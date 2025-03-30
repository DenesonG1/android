package com.example.atividade1.veiculo;

public class Carro extends Veiculo{
    public int marcha;

    public Boolean tetoSolarAberto;

    public Carro(String id, String marca, String modelo, int ano, int limiteVelocidade) {
        super(id, marca, modelo, ano, limiteVelocidade);
        this.marcha = 0;
        this.tetoSolarAberto = false;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }

    public Boolean getTetoSolarAberto() {
        return tetoSolarAberto;
    }

    public void setTetoSolarAberto(Boolean tetoSolarAberto) {
        this.tetoSolarAberto = tetoSolarAberto;
    }

    @Override
    public String ligar(){
        return "A moto está ligada!";
    }

    @Override
    public String desligar(){
        return "O carro está desligado!";
    }

    @Override
    public String acelerar() {
        return "O carro está acelerando, com limite de velocidade de %d km/h!" + getLimiteVelocidade();
    }

    public int trocarMarcha(int marcha){
        return this.marcha = marcha;
    }

    public Boolean abrirTetoSolar(){
        return tetoSolarAberto = true;
    }
    public Boolean fecharTetoSolar(){
        return tetoSolarAberto = false;
    }
    public String toString() {
        return "********** INFORMAÇÕES DO CARRO **********\n" +
                "ID: " + getId() + "\n" +
                "Carro: " + getMarca() + " " + getModelo() + " (" + getAno() + ")\n" +
                "Limite de Velocidade: " + getLimiteVelocidade() + " km/h\n" +
                "Marcha Atual: " + getMarcha() + "\n" +
                "Teto Solar Aberto: " + abrirTetoSolar() + "\n" +
                "Teto Solar Fechado: " + fecharTetoSolar() + "\n" +
                "********************************************\n";
    }
}
