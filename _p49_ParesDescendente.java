// Muestra los números impares de manera descendente desde 100 hasta el número que el usuario elija
//José Francisco Nava Casillas


import java.util.Scanner;

public class _p49_ParesDescendente {
    public static void main(String[] args) {
        int n, c1, c2, s;
        float prom;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Muestra los n\u00FAmeros impares de manera descendente desde 100 hasta el n\u00FAmero que el usuario elija\n");

            System.out.print("Hasta dónde? > "); n = obj.nextInt();
            c1 = 100;
            c2 = 0;
            s = 0;
            while (c1 >= n) {
                System.out.printf("%d ", c1);
                s += c1;
                c1 -= 2;
                c2 ++;
            }
            prom = (float) s / c2;
            System.out.printf("\nLa suma es     : %d", s);
            System.out.printf("\nEl promedio es : %.2f", prom);

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
        obj.close();
    }
}