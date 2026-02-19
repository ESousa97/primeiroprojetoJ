package com.esousa.interativo.modulo;

import com.esousa.interativo.config.ApplicationConstants;
import com.esousa.interativo.util.ConsoleUtils;

/**
 * Módulo de Perfil Interativo.
 * <p>
 * Coleta informações pessoais do usuário (nome, idade, profissão, hobby)
 * e exibe um perfil resumido com mensagem personalizada.
 */
public final class PerfilInterativo {

    private PerfilInterativo() {
        // Classe utilitária
    }

    /**
     * Ponto de entrada do módulo: coleta e exibe dados do perfil.
     */
    public static void executar() {
        ConsoleUtils.exibirCabecalho("PERFIL INTERATIVO");

        String nome = ConsoleUtils.lerLinha("Qual é o seu nome? ");
        int idade = ConsoleUtils.lerIdade("Qual é a sua idade? ");
        String profissao = ConsoleUtils.lerLinha("Qual é a sua profissão? ");
        String hobby = ConsoleUtils.lerLinha("Qual é o seu hobby favorito? ");

        exibirPerfil(nome, idade, profissao, hobby);
    }

    /**
     * Exibe os dados do perfil e uma mensagem baseada na faixa etária.
     *
     * @param nome      nome do usuário
     * @param idade     idade do usuário
     * @param profissao profissão informada
     * @param hobby     hobby favorito
     */
    private static void exibirPerfil(String nome, int idade,
                                     String profissao, String hobby) {
        System.out.println("\nSeu Perfil:");
        System.out.println("-".repeat(30));
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Profissão: " + profissao);
        System.out.println("Hobby: " + hobby);
        System.out.println(gerarMensagemIdade(idade));
        System.out.println("Tudo bem, " + nome + "?");
    }

    /**
     * Gera uma mensagem com base na faixa etária.
     * Método puro, sem I/O.
     *
     * @param idade idade do usuário
     * @return mensagem personalizada
     */
    public static String gerarMensagemIdade(int idade) {
        if (idade < ApplicationConstants.MIN_IDADE || idade > ApplicationConstants.MAX_IDADE) {
            throw new IllegalArgumentException("Idade fora da faixa suportada: " + idade);
        }

        if (idade < 18) {
            return "Você é jovem e tem muito potencial pela frente.";
        } else if (idade < 65) {
            return "Você está na melhor fase da vida.";
        } else {
            return "Sua experiência é muito valiosa.";
        }
    }
}
