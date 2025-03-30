package com.example.atividade1.investimento;

public class Imoveis extends InvestimentoBase {
    public Imoveis(String descricao, double valorInvestido, double taxaRetorno) {
        super(descricao, valorInvestido, taxaRetorno);
    }

    @Override
    public String toString() {
        return super.toString() + "Tipo: Imóveis\n";
    }
}

