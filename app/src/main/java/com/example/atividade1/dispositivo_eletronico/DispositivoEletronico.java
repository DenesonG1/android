package com.example.atividade1.dispositivo_eletronico;

abstract class DispositivoEletronico {
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

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String marca;
    private String modelo;
    private int anoFabricacao;
    private boolean ligado;
    private String tipo;


    public DispositivoEletronico(String tipo,String marca, String modelo, int anoFabricacao, Boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.ligado = false;
        this.tipo = tipo;
    }

    public String ligar() {
        ligado = true;
        return " ligado.";
    }

    public String desligar() {
        ligado = false;
        return " desligado.";
    }

    @Override
    public String toString() {
        return "********** INFORMAÇÕES DO DISPOSITIVO **********\n" +
                "Tipo: " + tipo + "\n" +
                "Marca: " + marca + "\n" +
                "Modelo: " + modelo + "\n" +
                "Ano de Fabricação: " + anoFabricacao + "\n"+
                "*************************************************";
    }
}
