package com.example.atividade1.financa_pessoal;

public interface Transacao {
    String getDescricao();
    double getValor();
    String getCategoria();
    boolean precisaRevisao(double limite);
}
