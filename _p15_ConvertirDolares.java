// José Francisco Nava Casillas
// Realizar un programa que convierta pesos a dolarukos

import java.util.Scanner;

public class _p15_ConvertirDolares {
    public static void main(String[] args) {

        float pesos,dolares,div;
        Scanner obj=new Scanner(System.in); 
        System.out.print("Dame la cantidad de pesos que quieras convertir= "); pesos  = obj.nextInt();
        System.out.print("Dame el precio del dolar actual= "); dolares  = obj.nextInt();

        div= pesos/dolares;

        System.out.println(String.format("Con %.2f pesos ajustas %.2f dolares ",pesos,div));


    }
}