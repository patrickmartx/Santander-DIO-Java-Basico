package edu.patrick.sintaxeJava.estruturasCondicionais;

public class CondicionalEncadeada {
    public static void main(String[] args) {
        String time = "Vasco";

        if (time.equals("Vasco"))
            System.out.println("AI TÁ FALANDO DE LENDA");
        else if(time.equals("Botafogo"))
            System.out.println("Bom time");
        else
            System.out.println("Time ruim!");
    }
}
