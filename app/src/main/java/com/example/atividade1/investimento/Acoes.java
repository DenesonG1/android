package com.example.atividade1.investimento;

public class Acoes extends InvestimentoBase {
    public Acoes(String descricao, double valorInvestido, double taxaRetorno) {
        super(descricao, valorInvestido, taxaRetorno);
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo: Ações\n";
    }
}

