package com.esousa.interativo.modulo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("HelloWorld")
class HelloWorldTest {

    @Test
    @DisplayName("saudação clássica")
    void deveGerarSaudacaoClassica() {
        String resultado = HelloWorld.gerarSaudacao("João", 1);
        assertEquals("Olá, João!", resultado);
    }

    @Test
    @DisplayName("saudação formal")
    void deveGerarSaudacaoFormal() {
        String resultado = HelloWorld.gerarSaudacao("Maria", 2);
        assertTrue(resultado.contains("bem-vindo(a)"));
        assertTrue(resultado.contains("Maria"));
    }

    @Test
    @DisplayName("saudação descontraída")
    void deveGerarSaudacaoDescontraida() {
        String resultado = HelloWorld.gerarSaudacao("Ana", 3);
        assertEquals("E aí, Ana! Tudo bem?", resultado);
    }

    @Test
    @DisplayName("todas as saudações juntas")
    void deveGerarTodasSaudacoes() {
        String resultado = HelloWorld.gerarSaudacao("Pedro", 4);
        assertTrue(resultado.contains("Olá, Pedro!"));
        assertTrue(resultado.contains("bem-vindo(a)"));
        assertTrue(resultado.contains("E aí, Pedro!"));
    }

    @ParameterizedTest(name = "nome ''{0}'' no tipo {1}")
    @CsvSource({"Mundo, 1", "Test, 2", "'', 1"})
    void naoDeveRetornarNulo(String nome, int tipo) {
        assertNotNull(HelloWorld.gerarSaudacao(nome, tipo));
    }

    @Test
    @DisplayName("nome nulo usa fallback 'Mundo'")
    void deveUsarFallbackParaNomeNulo() {
        assertEquals("Olá, Mundo!", HelloWorld.gerarSaudacao(null, 1));
    }

    @Test
    @DisplayName("tipo desconhecido usa saudação clássica como fallback")
    void deveUsarFallbackParaTipoDesconhecido() {
        String resultado = HelloWorld.gerarSaudacao("X", 99);
        assertEquals("Olá, X!", resultado);
    }
}
