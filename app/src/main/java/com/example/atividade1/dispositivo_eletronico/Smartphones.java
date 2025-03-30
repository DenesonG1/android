package com.example.atividade1.dispositivo_eletronico;

public class Smartphones  extends DispositivoEletronico{
    public int getCapacidadeBateria() {
        return capacidadeBateria;
    }

    public void setCapacidadeBateria(int capacidadeBateria) {
        this.capacidadeBateria = capacidadeBateria;
    }

    private int capacidadeBateria;

    public Smartphones( String tipo, String marca, String modelo, int anoFabricacao, Boolean ligado, int capacidadeBateria) {
        super(tipo,marca, modelo, anoFabricacao, ligado);
        this.capacidadeBateria = capacidadeBateria;
    }

    public String fazerLigacaoParaContato() {
        return "O celular está fazendo uma chamada...";
    }

    @Override
    public String toString() {
        return super.toString() + "\nLigar celular: " + ligar() + "\nCapacidade da Bateria: " + capacidadeBateria + "mAh\n  " +
                "\nRealizar ligação para meu contato: " + fazerLigacaoParaContato() + "\nDesligar celular: " + desligar() + "\n";
    }
}
