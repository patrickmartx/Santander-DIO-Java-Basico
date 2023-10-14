package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PessoaTeste {
    int idadeEsperada;

    @BeforeEach
    public void preencheVars(){
        idadeEsperada = 3;
    }

    @Test
    void validarCalculoDeIdade() {
        Pessoa pessoa = new Pessoa("Julia", LocalDate.of(2020, 1, 1));

        Assertions.assertEquals(idadeEsperada, pessoa.getIdade());
    }
}
