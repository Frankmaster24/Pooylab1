//Calcular la paga de un trabajador

import java.util.Scanner;

public class _p04_PagaTrabajador {
    public static void main(String[] args) {
        String nombre;
        int horas;
        double paga, tasa,impuestos,pagabruta,paganeta;
        Scanner obj = new Scanner(System.in);

        System.out.print("Nombre del trabajador ?"); nombre = obj.nextLine();
        System.out.print("Horas trabajadas ? "); horas = obj.nextInt();
        System.out.print("Paga x hora      ? "); paga = obj.nextFloat();
        tasa = 0.03;
      
      
        pagabruta = horas * paga;
        impuestos = pagabruta * tasa;
        paganeta = pagabruta - impuestos;

        System.out.println("\n Resumen de pagos\n");
        System.out.println(String.format("El trabajor%s, trabajo %d horas, a una paga de %.2f pesos la hora, con una tasa de impuestos de %.2f",nombre,horas,paga,tasa));
        System.out.println(String.format("Paga Bruta        = %.2f", pagabruta));
        System.out.println(String.format("Impuestos        = %.2f", impuestos));
        System.out.println(String.format("Paga neta        = %.2f", paganeta));
                


        
    }
}
