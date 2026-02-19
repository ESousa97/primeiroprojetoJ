package com.esousa.interativo.modulo;

import com.esousa.interativo.util.ConsoleUtils;

/**
 * Módulo de Calculadora Básica.
 * <p>
 * Oferece operações aritméticas fundamentais (soma, subtração,
 * multiplicação, divisão) com entrada interativa ou exemplos pré-definidos.
 */
public final class CalculadoraBasica {

    private static final int OPCAO_SOMA = 1;
    private static final int OPCAO_SUBTRACAO = 2;
    private static final int OPCAO_MULTIPLICACAO = 3;
    private static final int OPCAO_DIVISAO = 4;
    private static final int OPCAO_PREDEFINIDAS = 5;

    private CalculadoraBasica() {
        // Classe utilitária
    }

    /**
     * Ponto de entrada do módulo: exibe opções de operação.
     */
    public static void executar() {
        ConsoleUtils.exibirCabecalho("CALCULADORA BÁSICA");

        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Operações pré-definidas");

        int opcao = ConsoleUtils.lerInteiro("Opção (1-5): ", OPCAO_SOMA, OPCAO_PREDEFINIDAS);

        if (opcao == OPCAO_PREDEFINIDAS) {
            exibirOperacoesPredefinidas();
        } else {
            realizarOperacaoInterativa(opcao);
        }
    }

    /**
     * Realiza o cálculo aritmético entre dois números.
     * Método puro, sem I/O — facilita testes unitários.
     *
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param operacao 1=soma, 2=subtração, 3=multiplicação, 4=divisão
     * @return resultado da operação
     * @throws ArithmeticException      se divisão por zero
     * @throws IllegalArgumentException se operação inválida
     */
    public static double calcular(double a, double b, int operacao) {
        return switch (operacao) {
            case OPCAO_SOMA -> a + b;
            case OPCAO_SUBTRACAO -> a - b;
            case OPCAO_MULTIPLICACAO -> a * b;
            case OPCAO_DIVISAO -> {
                if (b == 0) {
                    throw new ArithmeticException("Divisão por zero não é permitida");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Operação inválida: " + operacao);
        };
    }

    /**
     * Retorna o símbolo do operador para a operação indicada.
     *
     * @param operacao 1=+, 2=-, 3=*, 4=/
     * @return símbolo do operador
     */
    public static String getOperador(int operacao) {
        return switch (operacao) {
            case OPCAO_SOMA -> "+";
            case OPCAO_SUBTRACAO -> "-";
            case OPCAO_MULTIPLICACAO -> "*";
            case OPCAO_DIVISAO -> "/";
            default -> "?";
        };
    }

    private static void realizarOperacaoInterativa(int tipoOperacao) {
        double num1 = ConsoleUtils.lerDouble("Digite o primeiro número: ");
        double num2 = ConsoleUtils.lerDouble("Digite o segundo número: ");

        try {
            double resultado = calcular(num1, num2, tipoOperacao);
            String operador = getOperador(tipoOperacao);
            System.out.println("\nResultado:");
            System.out.printf("%.2f %s %.2f = %.2f%n", num1, operador, num2, resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void exibirOperacoesPredefinidas() {
        System.out.println("\nOperações básicas pré-definidas:");
        System.out.printf("Soma:          10 + 5 = %.0f%n", calcular(10, 5, OPCAO_SOMA));
        System.out.printf("Subtração:     10 - 5 = %.0f%n", calcular(10, 5, OPCAO_SUBTRACAO));
        System.out.printf("Multiplicação: 10 * 5 = %.0f%n", calcular(10, 5, OPCAO_MULTIPLICACAO));
        System.out.printf("Divisão:       10 / 5 = %.1f%n", calcular(10, 5, OPCAO_DIVISAO));
    }
}
