package com.example.atividade1.financa_pessoal;

public class Receita implements Transacao {
    private String descricao;
    private double valor;
    private String categoria;

    public Receita(String descricao, double valor, String categoria) {
        this.descricao = descricao;
        this.valor = valor;
        this.categoria = categoria;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public String getCategoria() {
        return categoria;
    }

    @Override
    public boolean precisaRevisao(double limite) {
        return valor < limite;  // Se a receita for menor que o limite, precisa de revisão
    }

    @Override
    public String toString() {
        return "Receita: " + descricao + "\nCategoria: " + categoria + "\nValor: " + valor + "\n";
    }
}
