package com.dio;

public class Notaveis {

    public static void  area (double lado){
        System.out.println("Área do  quadrado = " + lado *lado);
    }
    public static void  area (double lado1, double lado2){
        System.out.println("Área do  retângulo = " + lado1 *lado2);
    }
    public static void  area (double baseMaior, double baseMenor, double altura){
        System.out.println("Área do  trapézio = " +((baseMaior + baseMenor)*altura)/2);
    }
    /*
    Para acontecer a sobrecarga, é preciso que o tipo de dado também se altere dentro do
    parâmetro, pois o programa apresenta erro ao informar dois metodos com o mesmo formato e
    que tenha os mesmos parâmetros.
    Assim, o método abaixo aprsenta conflito com o método do calculo do retangulo, por ter 2 doubles
    no parâmetro:
            public static void  area (double diagonal1, double diagonal2){
                System.out.println("Área do  losango = " +((diagonal1 + diagonal2)/2);}
   Isso é facilmente corrigido alterando os tipos de variaveis declaradas no parâmetro:
   (pode-se alterar apenas uma ou todas)
   */
    public static void  area (float diagonal1,float diagonal2){
        System.out.printf("Área do losango = %s%n", (diagonal1 + diagonal2) / 2);
    }

}
