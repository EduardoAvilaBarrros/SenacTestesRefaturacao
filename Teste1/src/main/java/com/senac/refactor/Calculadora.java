package com.senac.refactor;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual operação deseja realizar?" +
                "\n1. Soma" +
                "\n2. Subtração" +
                "\n3. Multiplicação" +
                "\n4. Divisão");

        int operacao = sc.nextInt();

        System.out.println("Digite o primeiro número:" +
                "\nDigite o segundo número:");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();

        switch (operacao) {
            case 1:
                System.out.println(numero1 + numero2);
                break;
            case 2:
                System.out.println(numero1 - numero2);
                break;
            case 3:
                System.out.println(numero1 * numero2);
                break;
            case 4:
                System.out.println(numero1 / numero2);
                break;
        }
    }
}