//Ingresar un numeros del 1 al 6 segun los diferentes continentes
//José Francisco Nava Casillas

import java.util.Scanner;

public class _p35_ContinentesMundo {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J"); System.out.flush();
        System.out.println("Muestra un  continente en base al número: \n");
        System.out.print("Dame un numero (1..6) ? ");
        int c = new Scanner(System.in).nextInt();
        switch (c) {
        case 1 : System.out.println("\nAsia");break;
        case 2 : System.out.println("\nAfrica");break;
        case 3 : System.out.println("\nAmerica del Norte");break;
        case 4 : System.out.println("\nAmerica del Sur");break;
        case 5 : System.out.println("\nAntartida");break;
        case 6 : System.out.println("\nEuropa");break;
        default : System.out.println("Número inválido !!!");break; 
        }
        System.out.println("\n\nProceso terminado ...");
    }
}
