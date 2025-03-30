package com.example.atividade1.financa_pessoal;


import java.util.List;

public class GestorFinanceiro {
    private List<Transacao> transacoes;

    public GestorFinanceiro(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }

    public double calcularSaldoTotal() {
        double saldo = 0;
        for (Transacao transacao : transacoes) {
            if (transacao instanceof Despesa) {
                saldo -= transacao.getValor();
            } else if (transacao instanceof Receita) {
                saldo += transacao.getValor();
            }
        }
        return saldo;
    }

    public String obterInformacoesFinanceiras(double limiteRevisao) {
        StringBuilder sb = new StringBuilder();
        sb.append("********** INFORMAÇÕES DE FINANÇAS **********\n");
        for (Transacao transacao : transacoes) {
            sb.append(transacao.toString()).append("\n");
        }
        sb.append("Saldo Total: ").append(calcularSaldoTotal()).append("\n");

        // Revisão das transações
        sb.append("********** TRANSACÕES QUE PRECISAM DE REVISÃO **********\n");
        for (Transacao transacao : transacoes) {
            if (transacao.precisaRevisao(limiteRevisao)) {
                sb.append("Transação precisa de revisão: ").append(transacao.getDescricao()).append("\n");
            }
        }

        return sb.toString();
    }
}
