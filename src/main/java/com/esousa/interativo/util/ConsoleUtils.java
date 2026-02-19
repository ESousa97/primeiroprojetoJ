package com.esousa.interativo.util;

import com.esousa.interativo.config.ApplicationConstants;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Utilitários centralizados para operações de console.
 * <p>
 * Gerencia uma única instância de {@link Scanner} compartilhada
 * e fornece métodos padronizados para entrada e saída, eliminando
 * duplicação de código de I/O entre os módulos.
 */
public final class ConsoleUtils {

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final String SEPARADOR = "=".repeat(60);
    private static final String SEPARADOR_MENOR = "-".repeat(40);

    private ConsoleUtils() {
        // Classe utilitária — não deve ser instanciada
    }

    /**
     * Lê uma linha de texto do console.
     *
     * @param prompt mensagem exibida antes da leitura
     * @return texto digitado, sem espaços nas extremidades
     */
    public static String lerLinha(String prompt) {
        System.out.print(prompt);
        return SCANNER.nextLine().trim();
    }

    /**
     * Lê um número inteiro dentro de um intervalo válido.
     * Repete a solicitação até receber entrada válida.
     *
     * @param prompt mensagem exibida antes da leitura
     * @param min    valor mínimo aceito (inclusive)
     * @param max    valor máximo aceito (inclusive)
     * @return inteiro válido entre min e max
     */
    public static int lerInteiro(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int valor = SCANNER.nextInt();
                SCANNER.nextLine();
                if (valor >= min && valor <= max) {
                    return valor;
                }
                System.out.printf("Opção inválida! Digite um número entre %d e %d.%n", min, max);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
                SCANNER.nextLine();
            }
        }
    }

    /**
     * Lê um número inteiro positivo (1–149), usado para idades.
     *
     * @param prompt mensagem exibida antes da leitura
     * @return inteiro positivo válido
     */
    public static int lerIdade(String prompt) {
        return lerInteiro(prompt, ApplicationConstants.MIN_IDADE, ApplicationConstants.MAX_IDADE);
    }

    /**
     * Lê um número decimal (double) do console.
     * Repete a solicitação até receber entrada válida.
     *
     * @param prompt mensagem exibida antes da leitura
     * @return número decimal válido
     */
    public static double lerDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double valor = SCANNER.nextDouble();
                SCANNER.nextLine();
                return valor;
            } catch (InputMismatchException e) {
                System.out.println("Digite um número válido.");
                SCANNER.nextLine();
            }
        }
    }

    /**
     * Exibe um cabeçalho com separadores menores.
     *
     * @param titulo texto do cabeçalho
     */
    public static void exibirCabecalho(String titulo) {
        System.out.println("\n" + SEPARADOR_MENOR);
        System.out.println(titulo);
        System.out.println(SEPARADOR_MENOR);
    }

    /**
     * Exibe um banner com separadores largos.
     *
     * @param titulo texto do banner
     */
    public static void exibirBanner(String titulo) {
        System.out.println(SEPARADOR);
        System.out.println(titulo);
        System.out.println(SEPARADOR);
    }

    /**
     * Pausa a execução até o usuário pressionar Enter.
     */
    public static void aguardarUsuario() {
        System.out.println("\nPressione Enter para voltar ao menu principal...");
        SCANNER.nextLine();
    }

    /**
     * Fecha o Scanner compartilhado.
     * Deve ser chamado apenas ao encerrar a aplicação.
     */
    public static void fecharScanner() {
        SCANNER.close();
    }
}
