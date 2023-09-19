//Imprimir la secuencia de números mostrados el número de renglones

import java.util.Scanner;

public class _p61_SecuenciaNumeros1 {
    public static void main(String[] args) {
        int t,n,j;
        Scanner obj = new Scanner(System.in);

        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("¿Cuántos lineas? ");n = obj.nextInt();
        System.out.print("Salida: ");

        for (t = 1; t <= n; t++) {
            for (j = 1; j <= t; j++) {
                System.out.print(t + " ");
            }
            System.out.println();
        }

        obj.close();
    }
}