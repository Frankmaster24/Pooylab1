
import java.util.Scanner;

public class _p68_TablaMultiplicar {

    public static void TablasMultiplicar (int t, int n) {
        System.out.printf("Tabla del %d", t);
        for(int i=1; i<=n; i++)
            System.out.printf("%d x %d = %d\n", t, i, t*i);
    }
    public static void main(String[] args) {
        int t, n;
        Scanner obj = new Scanner (System.in);

        Scanner obj = new Scanner(System.in);
        System.out.print("\033[H\033[2J");System.out.flush();
        System.out.print("Que tabla quieres ? "); t = obj. nextInt();        
        System.out.print("Hasta donde       ? "); n = obj. nextInt();   

        TablasMultiplicar(t,n);
        
       


    }
}
