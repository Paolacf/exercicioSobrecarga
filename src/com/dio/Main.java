package com.dio;

public class Main {

    public static void main(String[] args) {
        //Sobrecarga: fazer o método se comportar diferente de acordo com cada contexto alterando os parâmetros.
        /*Exercício: elaborar um progrma que calcule as áreas de 3 quadriláteros notáveis -   quadrado retângulo e trapezio*/
        Notaveis.area(5);
        Notaveis.area(3d,4d);
        Notaveis.area(7,5,4);
        Notaveis.area(6f,8f);
    }
}
