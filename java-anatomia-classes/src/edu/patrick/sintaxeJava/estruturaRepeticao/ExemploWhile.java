package edu.patrick.sintaxeJava.estruturaRepeticao;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("Digite qualquer coisa (X para sair):");
            String texto = input.nextLine();
            System.out.println();

            if (texto.equals("X") || texto.equals("x")){
                System.out.println("Volte sempre!");
                break;
            } 

            System.out.println("Texto digitado: \n" + texto);
            System.out.println();
        }
    }
}
