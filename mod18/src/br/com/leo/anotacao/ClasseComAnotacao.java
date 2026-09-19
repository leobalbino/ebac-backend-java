package br.com.leo.anotacao;

@PrimeiraAnotacao(value = "Leo", bairros = "Teste", numeroCasa = 10)
public class ClasseComAnotacao {

    @PrimeiraAnotacao(value = "Balbino", bairros = {"Teste", "Teste2"}, numeroCasa = 15, valores = 100d)
    private String nome;

}
