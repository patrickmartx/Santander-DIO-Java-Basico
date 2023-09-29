package edu.patrickmartx.service;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar() {
        System.out.println("Ligando de Aparelho Telefonico...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo de Aparelho Telefonico...");
    }

    @Override
    public void iniciarCorrerioVoz() {
        System.out.println("Iniciando correio de voz de Aparelho Telefonico...");
    }
}
