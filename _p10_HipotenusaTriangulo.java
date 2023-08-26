// José Francisco Nava Casillas
//Sacar la hipotenusa de un triangulo
import java.util.Scanner;

public class _p10_HipotenusaTriangulo {
    public static void main(String[] args) {
        float raiz;
        int  catetoA, catetoB,multi1, multi2, suma ;
        Scanner obj=new Scanner(System.in);

        catetoA=catetoB=0;

        System.out.print("Dame el cateto A= "); catetoA = obj.nextInt();
        System.out.print("Dame el cateto B= "); catetoB = obj.nextInt();

        multi1 = catetoA * catetoA;
        multi2 = catetoB * catetoB;
        suma= multi1 + multi2;
        raiz = (float) Math.sqrt(suma);

        System.out.println(String.format("La hipotenusa con catetos %d y %d es de= %.2f", catetoA,catetoB,raiz));

    }
}

