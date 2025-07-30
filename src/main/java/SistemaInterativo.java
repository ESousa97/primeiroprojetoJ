package main.java;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Sistema Interativo Java - Hello World e Perfil
 * Aplicação de console que demonstra conceitos básicos de Java de forma interativa.
 * 
 * Autor: Sistema Interativo
 * Versão: 2.0
 */
public class SistemaInterativo {
    
    private static final Scanner scanner = new Scanner(System.in);
    private static final String SEPARADOR = "=".repeat(60);
    private static final String SEPARADOR_MENOR = "-".repeat(40);
    
    public static void main(String[] args) {
        exibirBannerInicial();
        
        try {
            executarMenuPrincipal();
        } catch (Exception e) {
            System.err.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("\nObrigado por usar o Sistema Interativo!");
        }
    }
    
    /**
     * Mostra o banner de boas-vindas com informações básicas do sistema
     */
    private static void exibirBannerInicial() {
        System.out.println(SEPARADOR);
        System.out.println("SISTEMA INTERATIVO JAVA - HELLO WORLD & PERFIL");
        System.out.println("Data/Hora: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
        System.out.println(SEPARADOR);
        System.out.println("Bem-vindo ao sistema interativo de demonstração Java!");
        System.out.println("Aplicação robusta para aprender conceitos básicos.\n");
    }
    
    /**
     * Controla o fluxo do menu principal, permitindo ao usuário escolher opções até sair
     */
    private static void executarMenuPrincipal() {
        boolean continuar = true;
        
        while (continuar) {
            exibirMenuPrincipal();
            int opcao = lerOpcaoUsuario(1, 6);
            
            switch (opcao) {
                case 1 -> HelloWorld.executar();
                case 2 -> PerfilInterativo.executar();
                case 3 -> EstudosInterativo.executar();
                case 4 -> CalculadoraBasica.executar();
                case 5 -> exibirInformacoesSistema();
                case 6 -> continuar = false;
            }
            
            if (continuar) {
                aguardarUsuario();
            }
        }
    }
    
    /**
     * Exibe as opções disponíveis no menu principal
     */
    private static void exibirMenuPrincipal() {
        System.out.println("\n" + SEPARADOR_MENOR);
        System.out.println("MENU PRINCIPAL");
        System.out.println(SEPARADOR_MENOR);
        System.out.println("1 - Hello World Clássico");
        System.out.println("2 - Perfil Interativo");
        System.out.println("3 - Estudos e Anotações");
        System.out.println("4 - Calculadora Básica");
        System.out.println("5 - Informações do Sistema");
        System.out.println("6 - Sair");
        System.out.println(SEPARADOR_MENOR);
    }
    
    /**
     * Lê uma opção numérica válida entre os valores mínimo e máximo definidos
     */
    private static int lerOpcaoUsuario(int min, int max) {
        int opcao;
        while (true) {
            try {
                System.out.print("Escolha uma opção (" + min + "-" + max + "): ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer
                
                if (opcao >= min && opcao <= max) {
                    return opcao;
                } else {
                    System.out.println("Opção inválida! Digite um número entre " + min + " e " + max + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite apenas números.");
                scanner.nextLine(); // Limpa o buffer
            }
        }
    }
    
    /**
     * Pausa a execução até que o usuário pressione Enter para continuar
     */
    private static void aguardarUsuario() {
        System.out.println("\nPressione Enter para voltar ao menu principal...");
        scanner.nextLine();
    }
    
    /**
     * Exibe informações do sistema e ambiente de execução
     */
    private static void exibirInformacoesSistema() {
        System.out.println("\n" + SEPARADOR_MENOR);
        System.out.println("INFORMAÇÕES DO SISTEMA");
        System.out.println(SEPARADOR_MENOR);
        System.out.println("Versão Java: " + System.getProperty("java.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Sistema Operacional: " + System.getProperty("os.name"));
        System.out.println("Usuário: " + System.getProperty("user.name"));
        System.out.println("Diretório Atual: " + System.getProperty("user.dir"));
        System.out.println("Data/Hora Atual: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}

/**
 * Implementa a funcionalidade do Hello World interativo
 */
class HelloWorld {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void executar() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("HELLO WORLD INTERATIVO");
        System.out.println("=".repeat(40));
        
        System.out.print("Digite seu nome (ou pressione Enter para usar 'Mundo'): ");
        String nome = scanner.nextLine().trim();
        
        if (nome.isEmpty()) {
            nome = "Mundo";
        }
        
        System.out.println("\nEscolha o tipo de saudação:");
        System.out.println("1 - Clássica");
        System.out.println("2 - Formal");
        System.out.println("3 - Descontraída");
        System.out.println("4 - Todas");
        
        int opcao = lerOpcaoSaudacao();
        exibirSaudacao(nome, opcao);
    }
    
    /**
     * Lê a opção de saudação desejada pelo usuário
     */
    private static int lerOpcaoSaudacao() {
        while (true) {
            try {
                System.out.print("Opção (1-4): ");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                
                if (opcao >= 1 && opcao <= 4) {
                    return opcao;
                } else {
                    System.out.println("Opção inválida! Digite 1, 2, 3 ou 4.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                scanner.nextLine();
            }
        }
    }
    
    /**
     * Exibe a saudação escolhida com base no nome e tipo selecionados
     */
    private static void exibirSaudacao(String nome, int opcao) {
        System.out.println("\nResultado:");
        
        switch (opcao) {
            case 1 -> System.out.println("Olá, " + nome + "!");
            case 2 -> System.out.println("Seja bem-vindo(a), " + nome + ". É um prazer tê-lo(a) aqui!");
            case 3 -> System.out.println("E aí, " + nome + "! Tudo bem?");
            case 4 -> {
                System.out.println("Olá, " + nome + "!");
                System.out.println("Seja bem-vindo(a), " + nome + ". É um prazer tê-lo(a) aqui!");
                System.out.println("E aí, " + nome + "! Tudo bem?");
            }
        }
    }
}

/**
 * Implementa o Perfil Interativo para coletar e mostrar informações pessoais
 */
class PerfilInterativo {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void executar() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("PERFIL INTERATIVO");
        System.out.println("=".repeat(40));
        
        // Coleta informações do usuário
        System.out.print("Qual é o seu nome? ");
        String nome = scanner.nextLine().trim();
        
        System.out.print("Qual é a sua idade? ");
        int idade = lerIdade();
        
        System.out.print("Qual é a sua profissão? ");
        String profissao = scanner.nextLine().trim();
        
        System.out.print("Qual é o seu hobby favorito? ");
        String hobby = scanner.nextLine().trim();
        
        // Exibe o perfil coletado
        exibirPerfil(nome, idade, profissao, hobby);
        
        // Apresenta outras funcionalidades relacionadas
        EstudosInterativo.exibirAnotacoes();
        CalculadoraBasica.exibirOperacoesBasicas();
    }
    
    /**
     * Lê a idade do usuário validando que seja um número inteiro dentro de um intervalo razoável
     */
    private static int lerIdade() {
        while (true) {
            try {
                int idade = scanner.nextInt();
                scanner.nextLine(); // Limpa buffer
                
                if (idade > 0 && idade < 150) {
                    return idade;
                } else {
                    System.out.print("Idade inválida! Digite uma idade válida: ");
                }
            } catch (InputMismatchException e) {
                System.out.print("Digite apenas números para a idade: ");
                scanner.nextLine();
            }
        }
    }
    
    /**
     * Exibe os dados do perfil e uma mensagem personalizada baseada na idade
     */
    private static void exibirPerfil(String nome, int idade, String profissao, String hobby) {
        System.out.println("\nSeu Perfil:");
        System.out.println("-".repeat(30));
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Profissão: " + profissao);
        System.out.println("Hobby: " + hobby);
        
        if (idade < 18) {
            System.out.println("Você é jovem e tem muito potencial pela frente.");
        } else if (idade < 65) {
            System.out.println("Você está na melhor fase da vida.");
        } else {
            System.out.println("Sua experiência é muito valiosa.");
        }
        
        System.out.println("Tudo bem, " + nome + "?");
    }
}

/**
 * Classe para gerenciamento de estudos e anotações interativas
 */
class EstudosInterativo {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void executar() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("ESTUDOS E ANOTAÇÕES");
        System.out.println("=".repeat(40));
        
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Ver anotações padrão");
        System.out.println("2 - Adicionar nova anotação");
        System.out.println("3 - Dicas de estudo");
        
        int opcao = lerOpcaoEstudos();
        
        switch (opcao) {
            case 1 -> exibirAnotacoes();
            case 2 -> adicionarAnotacao();
            case 3 -> exibirDicasEstudo();
        }
    }
    
    /**
     * Lê a opção do menu de estudos garantindo entrada válida
     */
    private static int lerOpcaoEstudos() {
        while (true) {
            try {
                System.out.print("Opção (1-3): ");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                
                if (opcao >= 1 && opcao <= 3) {
                    return opcao;
                } else {
                    System.out.println("Opção inválida! Digite 1, 2 ou 3.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                scanner.nextLine();
            }
        }
    }
    
    /**
     * Mostra algumas anotações padrão sobre Java
     */
    public static void exibirAnotacoes() {
        System.out.println("\nAnotações de Estudos:");
        System.out.println("- Java é uma linguagem orientada a objetos");
        System.out.println("- Variáveis devem ser declaradas com tipo específico");
        System.out.println("- O método main() é o ponto de entrada do programa");
        System.out.println("- System.out.println() imprime texto no console");
        System.out.println("- Scanner é usado para ler entrada do usuário");
    }
    
    /**
     * Permite que o usuário adicione uma anotação personalizada
     */
    private static void adicionarAnotacao() {
        System.out.print("Digite sua anotação: ");
        String anotacao = scanner.nextLine().trim();
        
        if (!anotacao.isEmpty()) {
            System.out.println("\nAnotação adicionada com sucesso:");
            System.out.println(anotacao);
            System.out.println("Horário: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        } else {
            System.out.println("Anotação não pode estar vazia.");
        }
    }
    
    /**
     * Exibe dicas úteis para estudo
     */
    private static void exibirDicasEstudo() {
        System.out.println("\nDicas para melhorar seus estudos:");
        System.out.println("• Pratique código todos os dias");
        System.out.println("• Leia a documentação oficial");
        System.out.println("• Faça projetos pessoais para aplicar o conhecimento");
        System.out.println("• Participe de comunidades e grupos de estudo");
        System.out.println("• Aprenda com os erros e revise seu código");
    }
}

/**
 * Classe que implementa uma calculadora básica com operações simples
 */
class CalculadoraBasica {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void executar() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("CALCULADORA BÁSICA");
        System.out.println("=".repeat(40));
        
        System.out.println("Escolha uma operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Operações pré-definidas (10+5 e 10-5)");
        
        int opcao = lerOpcaoCalculadora();
        
        if (opcao == 5) {
            exibirOperacoesBasicas();
        } else {
            realizarOperacaoPersonalizada(opcao);
        }
    }
    
    /**
     * Lê a opção escolhida no menu da calculadora, garantindo valor válido
     */
    private static int lerOpcaoCalculadora() {
        while (true) {
            try {
                System.out.print("Opção (1-5): ");
                int opcao = scanner.nextInt();
                scanner.nextLine();
                
                if (opcao >= 1 && opcao <= 5) {
                    return opcao;
                } else {
                    System.out.println("Opção inválida! Digite um número de 1 a 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                scanner.nextLine();
            }
        }
    }
    
    /**
     * Realiza a operação matemática escolhida com dois números fornecidos pelo usuário
     */
    private static void realizarOperacaoPersonalizada(int tipoOperacao) {
        System.out.print("Digite o primeiro número: ");
        double num1 = lerNumero();
        
        System.out.print("Digite o segundo número: ");
        double num2 = lerNumero();
        
        double resultado;
        String operador;
        
        switch (tipoOperacao) {
            case 1 -> {
                resultado = num1 + num2;
                operador = "+";
            }
            case 2 -> {
                resultado = num1 - num2;
                operador = "-";
            }
            case 3 -> {
                resultado = num1 * num2;
                operador = "*";
            }
            case 4 -> {
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                    return;
                }
                resultado = num1 / num2;
                operador = "/";
            }
            default -> {
                System.out.println("Operação inválida.");
                return;
            }
        }
        
        System.out.println("\nResultado:");
        System.out.printf("%.2f %s %.2f = %.2f%n", num1, operador, num2, resultado);
    }
    
    /**
     * Lê um número double válido digitado pelo usuário
     */
    private static double lerNumero() {
        while (true) {
            try {
                double numero = scanner.nextDouble();
                scanner.nextLine();
                return numero;
            } catch (InputMismatchException e) {
                System.out.print("Digite um número válido: ");
                scanner.nextLine();
            }
        }
    }
    
    /**
     * Exibe algumas operações matemáticas básicas pré-definidas para exemplo
     */
    public static void exibirOperacoesBasicas() {
        System.out.println("\nOperações básicas pré-definidas:");
        
        int soma = 10 + 5;
        int subtracao = 10 - 5;
        int multiplicacao = 10 * 5;
        double divisao = 10.0 / 5.0;
        
        System.out.println("Soma de 10 + 5 = " + soma);
        System.out.println("Subtração de 10 - 5 = " + subtracao);
        System.out.println("Multiplicação de 10 * 5 = " + multiplicacao);
        System.out.println("Divisão de 10 / 5 = " + divisao);
    }
}
