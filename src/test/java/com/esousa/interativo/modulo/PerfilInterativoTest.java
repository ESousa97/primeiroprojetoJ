package com.esousa.interativo.modulo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("PerfilInterativo")
class PerfilInterativoTest {

    @ParameterizedTest(name = "idade {0} = ''{1}''")
    @CsvSource({
            "10, Você é jovem e tem muito potencial pela frente.",
            "17, Você é jovem e tem muito potencial pela frente.",
            "18, Você está na melhor fase da vida.",
            "30, Você está na melhor fase da vida.",
            "64, Você está na melhor fase da vida.",
            "65, Sua experiência é muito valiosa.",
            "80, Sua experiência é muito valiosa."
    })
    @DisplayName("mensagem correta por faixa etária")
    void deveGerarMensagemCorretaPorIdade(int idade, String esperado) {
        assertEquals(esperado, PerfilInterativo.gerarMensagemIdade(idade));
    }

    @Test
    @DisplayName("mensagem não é nula para qualquer idade válida")
    void mensagemNaoNula() {
        assertNotNull(PerfilInterativo.gerarMensagemIdade(1));
        assertNotNull(PerfilInterativo.gerarMensagemIdade(100));
    }

    @Test
    @DisplayName("idade inválida deve lançar IllegalArgumentException")
    void deveLancarErroParaIdadeInvalida() {
        assertThrows(IllegalArgumentException.class, () -> PerfilInterativo.gerarMensagemIdade(0));
        assertThrows(IllegalArgumentException.class, () -> PerfilInterativo.gerarMensagemIdade(150));
    }
}
