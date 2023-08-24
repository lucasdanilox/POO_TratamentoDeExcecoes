package conta;

import error.RegrasSaque;

public class Conta {

    private Integer numConta;
    private String titularConta;
    private Double saldo;
    private Double limiteSaque;

    public Conta() {
    }

    public Conta(Integer numConta, String titularConta, Double saldo, Double limiteSaque) {
        this.numConta = numConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumConta() {
        return numConta;
    }

    public void setNumConta(Integer numConta) {
        this.numConta = numConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public void setTitularConta(String titularConta) {
        this.titularConta = titularConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double deposito) {
        saldo += deposito;
    }

    public void saque(double valorSaque) {
        regrasSaque(valorSaque);
        saldo -= valorSaque;
    }

    private void regrasSaque(double validarSaque) {
        if (validarSaque > getLimiteSaque()) {
            throw new RegrasSaque("Erro de saque: A quantia excede o limite de saque");
        }
        if (validarSaque > getSaldo()) {
            throw new RegrasSaque("Erro de saque: Saldo insuficiente");
        }

    }
}

