//Imprimir la secuencia de números mostrados el número de renglones

import java.util.Scanner;

public class _p62_SecuenciaNumeros2 {
    public static void main(String[] args) {
        int t,n,j;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántos renglones? ");n = obj.nextInt();
        System.out.print("Salida: ");

        for (t = 1; t <= n; t++) {
            for (j = 1; j <= t; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        obj.close();
    }
}