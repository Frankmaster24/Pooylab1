//Imprimir la secuencia de términos armónicos el número de renglones

import java.util.Scanner;

public class _p63_SumaTerminos1 {
    public static void main(String[] args) {
        int t,n;
        double suma;
        Scanner obj = new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántos términos? ");n = obj.nextInt();
        System.out.print("Salida: ");
        
        suma = 0.0;
        for (t = 1; t <= n; t++) {
            if (t != 1) {
                System.out.print(" + ");
            }
            System.out.print("1/" + t);
            suma += 1.0 / t; 
        }

        System.out.println();
        System.out.print(String.format("Suma: %d", suma));
        obj.close();
    }
}