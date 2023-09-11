// Muestra los números impares de manera ascendente desde 1 hasta el número que el usuario elija
//José Francisco Nava Casillas


import java.util.Scanner;

public class _p48_ImparesAscendentes {
    public static void main(String[] args) {
        int n, c1, c2, s;
        float prom;
        char resp;
        Scanner obj = new Scanner(System.in);

        do {
            System.out.print("\033[H\033[2J"); System.out.flush();
            System.out.print("Muestra los números impares ascendentes hasta donde decidas\n");

            System.out.print("Cual va a ser el limite?  > "); n = obj.nextInt();
            c1 = 1;
            c2 = 0;
            s = 0;
            while (c1 <= n) {
                c2 ++;
                s += c1;
                System.out.printf("%d ", c1);
                c1 += 2;
                
            }
            prom = (float) s / c2;
            System.out.printf("\nLa suma     : %d", s);
            System.out.printf("\nEl promedio : %.2f", prom);

            do {
                System.out.printf("\nDeseas continuar? (S/N) > "); resp = Character.toUpperCase((obj.next().charAt(0)));
            } while (!(resp == 'S' || resp == 'N'));
        } while (resp != 'N');
        System.out.println("\nGracias por utilizar este programa !");
        obj.close();
    }
}