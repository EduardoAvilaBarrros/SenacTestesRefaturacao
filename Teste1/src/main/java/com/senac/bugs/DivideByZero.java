package com.senac.bugs;

public class DivideByZero {

    public static void main(String[] args) {
        int number = 10;
        //ELE DA ERRO POIS NAO TEM COMO DIVIDIR NENHUM NUMERO POR ZERO
        int divisor = 0;
        int result = number / divisor;
        System.out.println(result);
    }
}

