package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {

    Pessoa pessoa;
    int idadeEsperada;
    String nome;
    LocalDate nascimento;

    @BeforeEach
    public void preencheVars(){
        nome = "Julia";
        nascimento = LocalDate.of(2020, 1, 1);
        
        pessoa = new Pessoa(nome, nascimento);
        idadeEsperada = 3;
    }

    @Test
    void getNomeTeste() {
        String nomeEsperado = pessoa.getNome();

        Assertions.assertEquals(nome, nomeEsperado);
    }
    
    @Test
    void getNascimentoTeste() {
        LocalDate nascimentoEsperado = pessoa.getNascimento();
        
        Assertions.assertEquals(nascimento, nascimentoEsperado);
    }

    @Test
    void validarCalculoDeIdade() {
        Assertions.assertEquals(idadeEsperada, pessoa.getIdade());
    }
}
