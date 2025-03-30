package com.example.atividade1.veiculo;

abstract class Veiculo {
    private String id;
    private String marca;
    private String modelo;
    private int ano;
    private int limiteVelocidade;

    public Veiculo(String id, String marca, String modelo, int ano, int limiteVelocidade) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.limiteVelocidade = limiteVelocidade;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getLimiteVelocidade() {
        return limiteVelocidade;
    }

    public void setLimiteVelocidade(int limiteVelocidade) {
        this.limiteVelocidade = limiteVelocidade;
    }

    public String ligar(){
        return "O veículo está ligado!";
    }

    public String desligar(){
        return "O veículo está desligado!";
    }

    public String acelerar() {
        return "O veículo está acelerando!";
    }
}
