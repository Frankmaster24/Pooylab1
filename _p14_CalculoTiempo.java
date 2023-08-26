// José Francisco Nava Casillas
// Realizar un programa que calcule el tiempo cuando se lo des en horas, minutos y segundos

import java.util.Scanner;

public class _p14_CalculoTiempo {

    public static void main(String[] args) {
        int horas,dias,minutos,segundos;

        Scanner obj=new Scanner(System.in);
        System.out.print("Dame las horas que quieras convertir= "); horas  = obj.nextInt();

        dias=horas/24;
        minutos=horas * 60;
        segundos= minutos * 60;

        System.out.println(String.format("Las horas que ingresaste son= %d en dias, %d en minuros, %d segundos", dias,minutos,segundos));

    }
}