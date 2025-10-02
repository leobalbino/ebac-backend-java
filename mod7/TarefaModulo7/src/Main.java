public class Main {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Atribuindo valores as propriedades do objeto
        meuCarro.marca = "Chevrolet";
        meuCarro.modelo = "Onix";
        meuCarro.cor = "Preto";

        // Chamando os metodos do objeto para testar a funcionalidade
        System.out.println("--- Status inicial do carro ---");
        meuCarro.exibirStatus();

        System.out.println("\n--- Acoes ---");
        meuCarro.ligar();
        meuCarro.ligar(); // Tentando ligar de novo para ver a mensagem de erro
        meuCarro.desligar();

        System.out.println("\n--- Status final do carro ---");
        meuCarro.exibirStatus();
    }
}