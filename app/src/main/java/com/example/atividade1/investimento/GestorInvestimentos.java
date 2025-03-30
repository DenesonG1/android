package com.example.atividade1.investimento;

import java.util.List;

public class GestorInvestimentos {
    private List<Investimento> investimentos;

    public GestorInvestimentos(List<Investimento> investimentos) {
        this.investimentos = investimentos;
    }

    public double calcularRetornoTotal() {
        double retornoTotal = 0;
        for (Investimento investimento : investimentos) {
            retornoTotal += investimento.calcularRetorno();
        }
        return retornoTotal;
    }

    public String obterInformacoesInvestimentos(double limiteRevisao) {
        StringBuilder sb = new StringBuilder();
        sb.append("********** INFORMAÇÕES DE INVESTIMENTOS **********\n");

        // Exibindo todos os investimentos
        for (Investimento investimento : investimentos) {
            sb.append(investimento.toString()).append("\n");
        }

        // Calculando e exibindo o retorno total
        sb.append("Retorno Total: ").append(calcularRetornoTotal()).append("\n");

        // Verificando e exibindo os investimentos que precisam de revisão
        sb.append("********** INVESTIMENTOS QUE PRECISAM DE REVISÃO **********\n");

        boolean encontrouInvestimentosParaRevisao = false;  // Variável para verificar se algum investimento precisa de revisão

        for (Investimento investimento : investimentos) {
            if (investimento.precisaRevisao(limiteRevisao)) {
                sb.append("Investimento precisa de revisão: ").append(investimento.getDescricao()).append("\n");
                encontrouInvestimentosParaRevisao = true;
            }
        }

        if (!encontrouInvestimentosParaRevisao) {
            sb.append("Nenhum investimento precisa de revisão no momento.\n");
        }

        return sb.toString();
    }

}
