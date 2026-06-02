package br.com.leo.abstratas;

public class Horista extends Empregado {

    private double precoHora;
    private double totalHoraTrabalhada;

    @Override
    public Double vencimento() {
        return precoHora*totalHoraTrabalhada;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    public double getTotalHoraTrabalhada() {
        return totalHoraTrabalhada;
    }

    public void setTotalHoraTrabalhada(double totalHoraTrabalhada) {
        this.totalHoraTrabalhada = totalHoraTrabalhada;
    }
}
