package edu.patrickmartx.models;

import edu.patrickmartx.service.*;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    private final AparelhoTelefonico aparelhoTelefonico;
    private final NavegadorInternet navegadorInternet;
    private final ReprodutorMusical reprodutorMusical;

    public Iphone(){
        this.aparelhoTelefonico = new AparelhoTelefonicoImpl();
        this.navegadorInternet = new NavegadorInternetImpl();
        this.reprodutorMusical = new ReprodutorMusicalImpl();
    }

    @Override
    public void ligar() {
        aparelhoTelefonico.ligar();
    }

    @Override
    public void atender() {
        aparelhoTelefonico.atender();
    }

    @Override
    public void iniciarCorrerioVoz() {
        aparelhoTelefonico.iniciarCorrerioVoz();
    }

    @Override
    public void exibirPagina() {
        navegadorInternet.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        navegadorInternet.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegadorInternet.atualizarPagina();
    }

    @Override
    public void tocar() {
        reprodutorMusical.tocar();
    }

    @Override
    public void pausar() {
        reprodutorMusical.pausar();
    }

    @Override
    public void selecionarMusica() {
        reprodutorMusical.selecionarMusica();
    }
}
