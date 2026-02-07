package com.esousa.interativo.modulo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("CalculadoraBasica")
class CalculadoraBasicaTest {

    @Nested
    @DisplayName("calcular()")
    class Calcular {

        @ParameterizedTest(name = "{0} + {1} = {2}")
        @CsvSource({"10, 5, 15", "0, 0, 0", "-3, 3, 0", "1.5, 2.5, 4"})
        void deveSomar(double a, double b, double esperado) {
            assertEquals(esperado, CalculadoraBasica.calcular(a, b, 1), 0.001);
        }

        @ParameterizedTest(name = "{0} - {1} = {2}")
        @CsvSource({"10, 5, 5", "0, 0, 0", "3, 7, -4"})
        void deveSubtrair(double a, double b, double esperado) {
            assertEquals(esperado, CalculadoraBasica.calcular(a, b, 2), 0.001);
        }

        @ParameterizedTest(name = "{0} * {1} = {2}")
        @CsvSource({"10, 5, 50", "0, 100, 0", "-2, 3, -6"})
        void deveMultiplicar(double a, double b, double esperado) {
            assertEquals(esperado, CalculadoraBasica.calcular(a, b, 3), 0.001);
        }

        @ParameterizedTest(name = "{0} / {1} = {2}")
        @CsvSource({"10, 5, 2", "7, 2, 3.5", "-10, 2, -5"})
        void deveDividir(double a, double b, double esperado) {
            assertEquals(esperado, CalculadoraBasica.calcular(a, b, 4), 0.001);
        }

        @Test
        @DisplayName("divisão por zero deve lançar ArithmeticException")
        void deveLancarExcecaoParaDivisaoPorZero() {
            ArithmeticException ex = assertThrows(
                    ArithmeticException.class,
                    () -> CalculadoraBasica.calcular(10, 0, 4)
            );
            assertTrue(ex.getMessage().contains("Divisão por zero"));
        }

        @Test
        @DisplayName("operação inválida deve lançar IllegalArgumentException")
        void deveLancarExcecaoParaOperacaoInvalida() {
            assertThrows(
                    IllegalArgumentException.class,
                    () -> CalculadoraBasica.calcular(1, 1, 99)
            );
        }
    }

    @Nested
    @DisplayName("getOperador()")
    class GetOperador {

        @ParameterizedTest(name = "operação {0} = ''{1}''")
        @CsvSource({"1, +", "2, -", "3, *", "4, /"})
        void deveRetornarOperadorCorreto(int operacao, String esperado) {
            assertEquals(esperado, CalculadoraBasica.getOperador(operacao));
        }

        @Test
        @DisplayName("operação desconhecida retorna '?'")
        void deveRetornarInterrogacaoParaOperacaoDesconhecida() {
            assertEquals("?", CalculadoraBasica.getOperador(99));
        }
    }
}
