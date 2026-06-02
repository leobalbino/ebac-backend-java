package br.com.leo.abstratas;

public class Programa {
    public static void main(String[] args) {
        Assalariado empregado = new Assalariado();
        empregado.setCpf("123");
        empregado.setNome("Leo");
        empregado.setSobrenome("Balbino");
        empregado.setSalario(100d);
        imprimir(empregado);

        Comissionado comissionado = new Comissionado();
        comissionado.setCpf("123");
        comissionado.setNome("Leo2");
        comissionado.setTotalVenda(2000d);
        comissionado.setTotalComissao(0.1d);
        imprimir(comissionado);

        Horista horista = new Horista();
        horista.setCpf("123");
        horista.setNome("Leo3");
        horista.setSobrenome("Balbino");
        horista.setPrecoHora(10d);
        horista.setTotalHoraTrabalhada(60d);
        imprimir(horista);
    }

    public static void imprimir(Empregado empregado) {
        empregado.imprimirSobrenome();
        empregado.imprimirValores();
        System.out.println(empregado.getNome() + " tem de salario " + empregado.vencimento());

    }
}
