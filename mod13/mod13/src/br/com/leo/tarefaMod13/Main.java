package br.com.leo.tarefaMod13;

public class Main {
    public static void main(String[] args) {


        PessoaFisica pf = new PessoaFisica();
        pf.setNome("Leozinho");
        pf.setCpf("123.456.789-00");

        System.out.println("Pessoa Fisica: " + pf.getNome() + " - CPF: " + pf.getCpf());

        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("Tech Solutions LTDA");
        pj.setCnpj("12.345.678/0001-99");

        System.out.println("Pessoa Juridica: " + pj.getNome() + " - CNPJ: " + pj.getCnpj());
    }
}