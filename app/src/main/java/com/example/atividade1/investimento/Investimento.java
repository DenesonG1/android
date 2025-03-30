package com.example.atividade1.investimento;

public interface Investimento {
    String getDescricao();
    double getValorInvestido();
    double calcularRetorno();
    boolean precisaRevisao(double limiteRevisao);
    String toString();

}
