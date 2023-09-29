package edu.patrickmartx.service;

public class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Tocando música através de Reprodutor Musical...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música através de Reprodutor Musical...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música através de Reprodutor Musical...");
    }
}
