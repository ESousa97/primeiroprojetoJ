package com.esousa.interativo.modulo;

import com.esousa.interativo.util.ConsoleUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Módulo de Estudos e Anotações.
 * <p>
 * Permite visualizar anotações padrão sobre Java, adicionar
 * anotações personalizadas e conferir dicas de estudo.
 */
public final class EstudosInterativo {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

    private EstudosInterativo() {
        // Classe utilitária
    }

    /**
     * Ponto de entrada do módulo: exibe submenu de estudos.
     */
    public static void executar() {
        ConsoleUtils.exibirCabecalho("ESTUDOS E ANOTAÇÕES");

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ver anotações padrão");
        System.out.println("2 - Adicionar nova anotação");
        System.out.println("3 - Dicas de estudo");

        int opcao = ConsoleUtils.lerInteiro("Opção (1-3): ", 1, 3);

        switch (opcao) {
            case 1 -> exibirAnotacoes();
            case 2 -> adicionarAnotacao();
            case 3 -> exibirDicasEstudo();
        }
    }

    /**
     * Retorna as anotações padrão sobre Java.
     *
     * @return lista imutável de anotações
     */
    public static List<String> getAnotacoesPadrao() {
        return List.of(
                "Java é uma linguagem orientada a objetos",
                "Variáveis devem ser declaradas com tipo específico",
                "O método main() é o ponto de entrada do programa",
                "System.out.println() imprime texto no console",
                "Scanner é usado para ler entrada do usuário"
        );
    }

    /**
     * Retorna dicas de estudo.
     *
     * @return lista imutável de dicas
     */
    public static List<String> getDicasEstudo() {
        return List.of(
                "Pratique código todos os dias",
                "Leia a documentação oficial",
                "Faça projetos pessoais para aplicar o conhecimento",
                "Participe de comunidades e grupos de estudo",
                "Aprenda com os erros e revise seu código"
        );
    }

    private static void exibirAnotacoes() {
        System.out.println("\nAnotações de Estudos:");
        getAnotacoesPadrao().forEach(a -> System.out.println("- " + a));
    }

    private static void adicionarAnotacao() {
        String anotacao = ConsoleUtils.lerLinha("Digite sua anotação: ");

        if (!anotacao.isEmpty()) {
            System.out.println("\nAnotação adicionada com sucesso:");
            System.out.println(anotacao);
            System.out.println("Horário: " + LocalDateTime.now().format(FORMATTER));
        } else {
            System.out.println("Anotação não pode estar vazia.");
        }
    }

    private static void exibirDicasEstudo() {
        System.out.println("\nDicas para melhorar seus estudos:");
        getDicasEstudo().forEach(d -> System.out.println("• " + d));
    }
}
