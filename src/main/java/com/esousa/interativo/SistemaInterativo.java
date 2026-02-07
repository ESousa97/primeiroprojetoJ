package com.esousa.interativo;

import com.esousa.interativo.modulo.CalculadoraBasica;
import com.esousa.interativo.modulo.EstudosInterativo;
import com.esousa.interativo.modulo.HelloWorld;
import com.esousa.interativo.modulo.PerfilInterativo;
import com.esousa.interativo.util.ConsoleUtils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe principal do Sistema Interativo Java.
 * <p>
 * Orquestra o menu principal e delega a execução para os módulos
 * funcionais: HelloWorld, PerfilInterativo, EstudosInterativo e
 * CalculadoraBasica.
 */
public class SistemaInterativo {

    private static final DateTimeFormatter FORMATTER =
            DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {
        exibirBannerInicial();

        try {
            executarMenuPrincipal();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        } finally {
            ConsoleUtils.fecharScanner();
            System.out.println("\nObrigado por usar o Sistema Interativo!");
        }
    }

    private static void exibirBannerInicial() {
        ConsoleUtils.exibirBanner("SISTEMA INTERATIVO JAVA - HELLO WORLD & PERFIL");
        System.out.println("Data/Hora: " + LocalDateTime.now().format(FORMATTER));
        System.out.println("Bem-vindo ao sistema interativo de demonstração Java!\n");
    }

    private static void executarMenuPrincipal() {
        boolean continuar = true;

        while (continuar) {
            exibirMenu();
            int opcao = ConsoleUtils.lerInteiro("Escolha uma opção (1-6): ", 1, 6);

            switch (opcao) {
                case 1 -> HelloWorld.executar();
                case 2 -> PerfilInterativo.executar();
                case 3 -> EstudosInterativo.executar();
                case 4 -> CalculadoraBasica.executar();
                case 5 -> exibirInformacoesSistema();
                case 6 -> continuar = false;
            }

            if (continuar) {
                ConsoleUtils.aguardarUsuario();
            }
        }
    }

    private static void exibirMenu() {
        ConsoleUtils.exibirCabecalho("MENU PRINCIPAL");
        System.out.println("1 - Hello World Clássico");
        System.out.println("2 - Perfil Interativo");
        System.out.println("3 - Estudos e Anotações");
        System.out.println("4 - Calculadora Básica");
        System.out.println("5 - Informações do Sistema");
        System.out.println("6 - Sair");
    }

    private static void exibirInformacoesSistema() {
        ConsoleUtils.exibirCabecalho("INFORMAÇÕES DO SISTEMA");
        System.out.println("Versão Java: " + System.getProperty("java.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Sistema Operacional: " + System.getProperty("os.name"));
        System.out.println("Usuário: " + System.getProperty("user.name"));
        System.out.println("Diretório Atual: " + System.getProperty("user.dir"));
        System.out.println("Data/Hora Atual: " + LocalDateTime.now().format(FORMATTER));
    }
}
