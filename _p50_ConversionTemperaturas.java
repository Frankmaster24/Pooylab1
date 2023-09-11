// Imprime las conversiones de grados celsius a fahrenheit en un rango dado por el usuario
//José Francisco Nava Casillas



import java.util.Scanner;

public class _p50_ConversionTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continuar = 's';

        while (continuar == 's' || continuar == 'S') {
            System.out.print("Ingrese la temperatura inicial en grados Celsius: ");
            double inicial = scanner.nextDouble();

            System.out.print("Ingrese la temperatura final en grados Celsius: ");
            double finalTemp = scanner.nextDouble();

            if (finalTemp < inicial) {
                System.out.println("La temperatura final no puede ser menor que la temperatura inicial.");
                continue;
            }

            System.out.println("Tabla de conversión de Celsius a Fahrenheit:");

            System.out.println("Celsius   |   Fahrenheit");
            System.out.println("-----------------------");

            for (double celsius = inicial; celsius <= finalTemp; celsius++) {
                double fahrenheit = (celsius * 9/5) + 32;
                System.out.printf("%.2f°C   |   %.2f°F%n", celsius, fahrenheit);
            }

            System.out.print("\n¿Desea realizar otra conversión? (s/n): ");
            continuar = scanner.next().charAt(0);
        }

        scanner.close();
    }
}
