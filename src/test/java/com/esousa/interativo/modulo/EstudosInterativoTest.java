package com.esousa.interativo.modulo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("EstudosInterativo")
class EstudosInterativoTest {

    @Test
    @DisplayName("anotações padrão não estão vazias")
    void anotacoesPadraoNaoVazias() {
        List<String> anotacoes = EstudosInterativo.getAnotacoesPadrao();
        assertFalse(anotacoes.isEmpty());
    }

    @Test
    @DisplayName("anotações padrão são imutáveis")
    void anotacoesPadraoImutaveis() {
        List<String> anotacoes = EstudosInterativo.getAnotacoesPadrao();
        assertThrows(UnsupportedOperationException.class, () -> anotacoes.add("nova"));
    }

    @Test
    @DisplayName("dicas de estudo não estão vazias")
    void dicasEstudoNaoVazias() {
        List<String> dicas = EstudosInterativo.getDicasEstudo();
        assertFalse(dicas.isEmpty());
    }

    @Test
    @DisplayName("dicas de estudo são imutáveis")
    void dicasEstudoImutaveis() {
        List<String> dicas = EstudosInterativo.getDicasEstudo();
        assertThrows(UnsupportedOperationException.class, () -> dicas.add("nova"));
    }
}
