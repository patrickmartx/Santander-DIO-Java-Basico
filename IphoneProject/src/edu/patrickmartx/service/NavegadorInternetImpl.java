package edu.patrickmartx.service;

public class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página através de Navegador de Internet...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adcionando nova aba através de Navegador de Internet...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página através de Navegador de Internet...");
    }
}
