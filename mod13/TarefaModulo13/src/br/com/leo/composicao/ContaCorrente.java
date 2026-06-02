package br.com.leo.composicao;

public class ContaCorrente {
    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getChequeEspecial() {
        return ChequeEspecial;
    }

    public void setChequeEspecial(Double chequeEspecial) {
        ChequeEspecial = chequeEspecial;
    }

    private Double saldo;
    private Double ChequeEspecial;
}
