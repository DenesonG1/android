package com.example.atividade1.contato;

public class ContatoPessoal implements Contato {
    private String nome;
    private String telefone;
    private String redesSociais;
    public ContatoPessoal(String nome, String telefone, String redesSociais) {
        this.nome = nome;
        this.telefone = telefone;
        this.redesSociais = redesSociais;
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
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nRedes Sociais: " + redesSociais;
    }

    public String enviarMensagem() {
        return "Enviando mensagem para " + nome + " via WhatsApp.";
    }

    @Override
    public String toString() {
        return "Contato Pessoal:\n" +
                "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "Redes Sociais: " + redesSociais + "\n" +
                "Enviar mensagem: " + enviarMensagem() + "\n";
    }

}
