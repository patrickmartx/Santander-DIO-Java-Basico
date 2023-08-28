package edu.patrick.sintaxeJava.estruturaRepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE", "JONAS", "LUCAS", "MARCOS"};

        for (int x = 0; x < alunos.length; x++){
            System.out.printf("O aluno no índice x=%d é %s", x, alunos[x]);
            System.out.println();
        }

        System.out.println();

        for (String aluno : alunos){
            System.out.printf("O nome do aluno é %s", aluno);
            System.out.println();
        }
    }
}
