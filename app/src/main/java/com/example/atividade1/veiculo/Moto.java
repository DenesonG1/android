package com.example.atividade1.veiculo;

public class Moto extends Veiculo {
    public Boolean temCapacete;

    public Moto(String id, String marca, String modelo, int ano, int limiteVelocidade, Boolean temCapacete){
        super(id, marca, modelo, ano, limiteVelocidade);
        this.temCapacete = temCapacete;
    }


    public Boolean getTemCapacete() {
        return temCapacete;
    }

    public Boolean setTemCapacete(Boolean temCapacete) {
       return this.temCapacete = temCapacete;
    }

    @Override
    public String ligar(){
        return "A moto está ligada!";
    }

    @Override
    public String desligar(){
        return "A moto está desligada!";
    }
    @Override
    public String acelerar() {
        return "A moto está acelerando, com limite de velocidade de %d km/h!" + getLimiteVelocidade();
    }
    public String empinar() {
       return "A moto está empinando!";
    }

    public String toString() {
        return "********** INFORMAÇÕES DA MOTO **********\n" +
                "ID: " + getId() + "\n" +
                "Moto: " + getMarca() + " " + getModelo() + " (" + getAno() + ")\n" +
                "Limite de Velocidade: " + getLimiteVelocidade() + " km/h\n" +
                "Possui Capacete: " +  setTemCapacete(true) + "\n" +
                "Possui Capacete: " +  setTemCapacete(false) + "\n" +
                "Empinar moto: " + empinar() + "\n";
    }

}
