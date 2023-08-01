package com.senac.refactor;

public class Circle {
    public static void main(String[] args) {
        System.out.println(calculaAreaDoCirculo(5));
    }

    public static double calculaAreaDoCirculo(double raio) {
        return (Math.PI * raio * raio);
    }

    public static double calculaPerimetroDoCirculo(double raio) {
        return (2 * Math.PI * raio);
    }

    public static double calculaVolumeDaEsfera(double raio) {
        return ((4 * Math.PI * raio * raio * raio) / 3);
    }

    public static double calculaAreaDaSuperficieDaEsfera(double raio) {
        return (4 * Math.PI * raio * raio);
    }
}
