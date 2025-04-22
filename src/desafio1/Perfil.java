package desafio1;/*
1. Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o metodo main, que ao executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".

2. Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada. Por exemplo, "Tudo bem?".

3. Crie uma classe chamada Estudos para imprimir anotações de estudos no console.

4. Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5. Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".

5. Crie uma classe Subtracao para imprimir o resultado de 10 - 5 no console.
*/

import java.util.Scanner;

public class Perfil {
    public static void main(String[] args) {
        System.out.println("Olá, Enoque!");
        System.out.println("Tudo bem?");

        // Chama o metodo da classe Estudos
        Estudos.exibirAnotacoes();
        Soma.exibirSomaDeDoisNumeros();
        Subtraia.exibirSubtracaoDeDoisNumeros();
    }
}

class Estudos {
    public static void exibirAnotacoes() {
        System.out.println("Anotações de estudos:");
    }
}

class Soma {
    public static void exibirSomaDeDoisNumeros() {
        int resultado = 10 + 5;
        System.out.println("A Soma de 10 + 5 = " + resultado);
    }
}

class Subtraia {
    public static void exibirSubtracaoDeDoisNumeros() {
        int resultado = 10 - 5;
        System.out.println("A Subtração de 10 - 5 = " + resultado);
    }
}