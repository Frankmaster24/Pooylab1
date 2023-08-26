// José Francisco Nava Casillas
// Realizar un programa que calcule el volumen de un cilindro


import java.util.Scanner;

public class _p13_VolumenCilindro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el radio del cilindro: ");
        double radio = scanner.nextDouble();

        System.out.print("Ingresa la altura del cilindro: ");
        double altura = scanner.nextDouble();

        // Calcular el volumen del cilindro
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        System.out.println(String.format("El volumen del cilindro es: %.2f", volumen));

    }
}