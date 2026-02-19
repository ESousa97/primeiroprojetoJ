package com.esousa.interativo.modulo;

import com.esousa.interativo.config.ApplicationConstants;
import com.esousa.interativo.util.ConsoleUtils;

/**
 * Módulo Hello World Interativo.
 * <p>
 * Permite ao usuário personalizar saudações escolhendo entre
 * diferentes estilos (clássico, formal, descontraído).
 */
public final class HelloWorld {

    private HelloWorld() {
        // Classe utilitária
    }

    /**
     * Ponto de entrada do módulo: coleta nome e estilo de saudação do usuário.
     */
    public static void executar() {
        ConsoleUtils.exibirCabecalho("HELLO WORLD INTERATIVO");

        String nome = ConsoleUtils.lerLinha(
                "Digite seu nome (ou pressione Enter para usar 'Mundo'): ");
        if (nome.isEmpty()) {
            nome = ApplicationConstants.NOME_PADRAO;
        }

        System.out.println("\nEscolha o tipo de saudação:");
        System.out.println("1 - Clássica");
        System.out.println("2 - Formal");
        System.out.println("3 - Descontraída");
        System.out.println("4 - Todas");

        int opcao = ConsoleUtils.lerInteiro("Opção (1-4): ", 1, 4);

        System.out.println("\nResultado:");
        System.out.println(gerarSaudacao(nome, opcao));
    }

    /**
     * Gera o texto da saudação com base no nome e tipo escolhido.
     * Método puro, sem I/O — facilita testes unitários.
     *
     * @param nome nome do destinatário
     * @param tipo 1=clássica, 2=formal, 3=descontraída, 4=todas
     * @return texto da saudação
     */
    public static String gerarSaudacao(String nome, int tipo) {
        String nomeSeguro = (nome == null || nome.isBlank())
            ? ApplicationConstants.NOME_PADRAO
            : nome.trim();

        return switch (tipo) {
            case 1 -> "Olá, " + nomeSeguro + "!";
            case 2 -> "Seja bem-vindo(a), " + nomeSeguro + ". É um prazer tê-lo(a) aqui!";
            case 3 -> "E aí, " + nomeSeguro + "! Tudo bem?";
            case 4 -> String.join("\n",
                "Olá, " + nomeSeguro + "!",
                "Seja bem-vindo(a), " + nomeSeguro + ". É um prazer tê-lo(a) aqui!",
                "E aí, " + nomeSeguro + "! Tudo bem?");
            default -> "Olá, " + nomeSeguro + "!";
        };
    }
}
