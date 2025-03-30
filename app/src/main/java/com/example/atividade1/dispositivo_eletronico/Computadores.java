package com.example.atividade1.dispositivo_eletronico;

public class Computadores extends DispositivoEletronico {
    public String getCorMouse() {
        return corMouse;
    }

    public void setCorMouse(String corMouse) {
        this.corMouse = corMouse;
    }

    private String corMouse;

    public Computadores(String tipo,String marca, String modelo, int anoFabricacao, Boolean ligado, String corMouse) {
        super(tipo,marca, modelo, anoFabricacao, ligado);
        this.corMouse = corMouse;
    }

    public String conectarMonitor() {
        return "O computador está conectado com o monitor";
    }

    @Override
    public String toString() {
        return super.toString()  + "\nLigar computador: " + ligar() + "\nCor do mouse: " + corMouse + "mAh" +
                "\nConectar monitor: " + conectarMonitor()  + "\nDesligar computador: " + desligar() + "\n" ;
    }
}
