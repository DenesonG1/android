package com.example.atividade1.contato;

public class ContatoProfissional  implements Contato {
    private String nome;
    private String telefone;
    private String email;

    public ContatoProfissional(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String exibirContato() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + email;
    }

    public String enviarEmail() {
        return "Enviando e-mail para " + nome + " no endereço: " + email;
    }

    @Override
    public String toString() {
        return "Contato Profissional:\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "E-mail: " + email + "\n" +
                "Enviar e-mail: " + enviarEmail() + "\n";
    }
}
