import java.util.Scanner;

public class _p11_CalcularAngulo {
    public static void main(String[] args) {
          int angulo1, angulo2, suma, angulo3;
        Scanner obj=new Scanner(System.in);

        suma=angulo1=angulo2=0;
        System.out.print("Dame el primer angulo= "); angulo1 = obj.nextInt();
        System.out.print("Dame el segundo angulo= "); angulo2 = obj.nextInt();

        suma = 180 - (angulo1 + angulo2);


        System.out.println(String.format("El tercer aungulo es %d", suma));
    }
    
}
