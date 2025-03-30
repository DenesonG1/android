package com.example.atividade1.investimento;

public abstract class InvestimentoBase implements Investimento {
    private String descricao;
    private double valorInvestido;
    private double taxaRetorno;  // Taxa de retorno do investimento

    public InvestimentoBase(String descricao, double valorInvestido, double taxaRetorno) {
        this.descricao = descricao;
        this.valorInvestido = valorInvestido;
        this.taxaRetorno = taxaRetorno;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public double calcularRetorno() {
        return valorInvestido * (taxaRetorno / 100);
    }

    public boolean precisaRevisao(double limiteRevisao) {
        return calcularRetorno() < limiteRevisao;
    }

    @Override
    public String toString() {
        return "Investimento: " + descricao + "\n" +
                "Valor Investido: " + valorInvestido + "\n" +
                "Retorno Esperado: " + calcularRetorno() + "\n";
    }
}
