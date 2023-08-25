package edu.patrick.sintaxeJava.estruturasCondicionais;

public class CondicionaisSimples {
    public static void main(String[] args){
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if(valorSolicitado < saldo) 
            saldo -= valorSolicitado;

        System.out.println(saldo);
    }
}
