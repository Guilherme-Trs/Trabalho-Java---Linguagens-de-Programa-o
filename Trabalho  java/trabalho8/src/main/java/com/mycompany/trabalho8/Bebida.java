// Bebida.java
package com.mycompany.trabalho8;

public class Bebida {

    private String nome;
    private int volumeMl;

    public Bebida(String nome, int volumeMl) {
        this.nome = nome;
        this.volumeMl = volumeMl;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVolumeMl() {
        return volumeMl;
    }

    public void setVolumeMl(int volumeMl) {
        this.volumeMl = volumeMl;
    }

    public boolean ehLeve() {
        return this.volumeMl <= 330;
    }

    public boolean ehRefrescante() {
        return true;
    }

    public String descricaoCompleta() {
        return "Bebida: " + nome + ", Volume: " + volumeMl + " mL";
        
    }
}
