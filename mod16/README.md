# Injeção de dependência com Spring Boot

Este projeto mostra `PedidoService` usando `EmailService`. Dizemos que
`EmailService` é uma **dependência** de `PedidoService`, pois o serviço de
pedidos precisa dele para completar seu trabalho.

## Estrutura

```text
mod16/
├── pom.xml
└── src/main/java/br/com/ebac/mod16/
    ├── Main.java
    ├── PedidoService.java
    └── EmailService.java
```

As três classes ficam no mesmo pacote para manter o primeiro exemplo simples.

## O papel de cada classe

### `EmailService`

É responsável apenas por enviar a confirmação. A anotação `@Service` comunica
ao Spring que essa classe contém uma regra ou operação da aplicação. Como
`@Service` é uma especialização de `@Component`, ela também faz a classe ser
encontrada durante a varredura de componentes.

Ao encontrar a classe, o Spring cria uma instância de `EmailService` e a
registra em seu contêiner. Essa instância registrada é chamada de **Bean**.

### `PedidoService`

É responsável por realizar o pedido. Para enviar a confirmação, precisa de um
`EmailService`. Essa necessidade aparece claramente no construtor:

```java
public PedidoService(EmailService emailService) {
    this.emailService = emailService;
}
```

O campo é `final` porque a dependência é obrigatória e não deve ser trocada
depois que o objeto for construído. Não existe `new EmailService()` nesta
classe. O objeto chega pronto pelo construtor.

`PedidoService` também tem `@Service`, portanto ele próprio é um Bean. Ao
criá-lo, o Spring examina seu construtor, percebe que precisa de um Bean do tipo
`EmailService`, encontra esse Bean no contêiner e o passa como argumento.

Não é necessário escrever `@Autowired` nesse construtor. Quando uma classe tem
apenas um construtor, o Spring o usa automaticamente para fazer a injeção.

### `Main`

`@SpringBootApplication` marca a classe principal e, entre outras funções,
ativa a varredura de componentes a partir do pacote `br.com.ebac.mod16`.
Por isso, `PedidoService` e `EmailService`, que estão nesse pacote, são
encontrados.

`SpringApplication.run(...)` inicia o Spring e cria o contêiner de Beans. A
classe implementa `CommandLineRunner`, então seu método `run` é executado assim
que o contêiner termina de iniciar. O próprio `Main` recebe `PedidoService` pelo
construtor, usando o mesmo princípio.

## Fluxo de execução

1. O método `main` chama `SpringApplication.run`.
2. O Spring procura componentes no pacote da classe `Main` e nos subpacotes.
3. Ele encontra `EmailService` e `PedidoService` por causa de `@Service`.
4. O Spring cria o Bean de `EmailService`.
5. Para criar `PedidoService`, o Spring vê o parâmetro `EmailService` no
   construtor e passa o Bean que já conhece.
6. O Spring injeta o Bean de `PedidoService` no construtor de `Main`.
7. Depois da inicialização, o Spring chama `Main.run`.
8. `run` chama `pedidoService.realizarPedido(...)`.
9. `PedidoService` cria o pedido e usa sua dependência para enviar a confirmação.

Saída principal esperada:

```text
Pedido de livro de Java criado para Maria.
E-mail enviado para Maria: seu pedido de livro de Java foi confirmado.
```

## Sem injeção de dependência

Uma implementação manual poderia fazer isto:

```java
public class PedidoService {
    private final EmailService emailService = new EmailService();

    public void realizarPedido(String nomeCliente, String produto) {
        System.out.println("Pedido criado.");
        emailService.enviarConfirmacao(nomeCliente, produto);
    }
}
```

Nesse caso, `PedidoService` decide qual objeto criar e como criá-lo. As duas
responsabilidades ficam misturadas: realizar pedidos e montar suas próprias
dependências. Se o construtor de `EmailService` mudar, provavelmente será
necessário mudar também `PedidoService`.

## Com injeção de dependência

No projeto, `PedidoService` apenas declara o que precisa:

```java
private final EmailService emailService;

public PedidoService(EmailService emailService) {
    this.emailService = emailService;
}
```

Quem cria e conecta os objetos é o Spring. Isso é **injeção de dependência**:
uma classe recebe de fora o objeto do qual depende, em vez de construí-lo.

## Conceitos essenciais

**Dependência** é um objeto que outra classe precisa para trabalhar. Aqui,
`EmailService` é uma dependência de `PedidoService`.

**Bean** é um objeto criado e registrado no contêiner do Spring. Nem todo objeto
Java é automaticamente um Bean. Neste exemplo, as classes anotadas com
`@Service` tornam-se Beans por meio da varredura de componentes.

Quando dizemos que o Spring **gerencia** um objeto, queremos dizer que o Spring
cuida de criá-lo, armazená-lo no contêiner, fornecer suas dependências e
entregá-lo às outras partes da aplicação que precisarem dele. Por padrão, esses
Beans são `singleton`: o contêiner usa uma única instância de cada um.

O acoplamento diminui porque `PedidoService` deixa de controlar a criação de
`EmailService`. Sua responsabilidade passa a ser apenas usar a dependência que
recebeu. Em aplicações maiores, costuma-se também depender de uma interface,
o que permite trocar implementações com ainda mais facilidade.

A injeção por construtor facilita testes porque um teste pode fornecer uma
dependência controlada diretamente:

```java
EmailService emailServiceDeTeste = new EmailService();
PedidoService pedidoService = new PedidoService(emailServiceDeTeste);
```

Em um teste mais realista, `EmailService` poderia ser substituído por um mock.
Assim, é possível verificar se o envio foi solicitado sem mandar um e-mail de
verdade. O uso de `new` no teste é normal: o objetivo ali é montar de forma
explícita o cenário que será testado. O problema seria `PedidoService` esconder
um `new EmailService()` dentro de si, impedindo essa substituição.

## Como executar

Abra a pasta como projeto Maven no IntelliJ IDEA, aguarde a importação das
dependências e execute o método `main` da classe `Main`. Pela linha de comando,
com Maven 3.6.3 ou superior instalado, use:

```shell
mvn spring-boot:run
```
