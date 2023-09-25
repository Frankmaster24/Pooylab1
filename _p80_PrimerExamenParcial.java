import java.util.Scanner;

public class _p80_PrimerExamenParcial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("¿Cuántos participantes desea agregar?");
        int numParticipantes = scanner.nextInt();
        scanner.nextLine();  // Consumir el salto de línea
        
        int totalAlumnos = 0, totalDocentes = 0, totalTrabajadores = 0,totalHombres = 0, totalMujeres = 0,totalParticipantes = 0,totalDineroAlumnos = 0, totalDineroDocentes = 0;
        int totalDineroTrabajadores = 0;
        int totalDineroGeneral = 0;
        int totalEdades = 0;

        for (int i = 0; i < numParticipantes; i++) {
            System.out.println("Ingrese el nombre del participante " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingrese la edad de " + nombre + ": ");
            int edad = scanner.nextInt();
            scanner.nextLine();  // Consumir el salto de línea
            
            if (edad < 18) {
                System.out.println("Lo siento, solo los participantes mayores de edad pueden inscribirse.");
                continue;
            }
            
            System.out.println("Ingrese el sexo de " + nombre + " (M/F): ");
            char sexo = scanner.nextLine().charAt(0);
            
            System.out.println("Ingrese el tipo de participante de " + nombre + " (Alumno/Docente/Trabajador): ");
            String tipoParticipante = scanner.nextLine();

            totalParticipantes++;
            totalEdades += edad;

            switch (tipoParticipante.toLowerCase()) {
                case "alumno":
                    totalAlumnos++;
                    totalDineroAlumnos += 50;
                    break;
                case "docente":
                    totalDocentes++;
                    totalDineroDocentes += 80;
                    break;
                case "trabajador":
                    totalTrabajadores++;
                    totalDineroTrabajadores += 60;
                    break;
            }

            if (sexo == 'M') {
                totalHombres++;
            } else if (sexo == 'F') {
                totalMujeres++;
            }
        }

        totalDineroGeneral = totalDineroAlumnos + totalDineroDocentes + totalDineroTrabajadores;
        double promedioEdad = (double) totalEdades / totalParticipantes;

        System.out.println("\nResumen de inscripciones:");
        System.out.println("Total de Alumnos: " + totalAlumnos);
        System.out.println("Total de Docentes: " + totalDocentes);
        System.out.println("Total de Trabajadores: " + totalTrabajadores);
        System.out.println("Total de Hombres en general: " + totalHombres);
        System.out.println("Total de Mujeres en general: " + totalMujeres);
        System.out.println("Total de todos los participantes: " + totalParticipantes);
        System.out.println("Promedio de la edad de todos los participantes: " + promedioEdad);
        
        System.out.println("\nResumen de dinero recaudado:");
        System.out.println("Total dinero recaudado de Alumnos: " + totalDineroAlumnos);
        System.out.println("Total dinero recaudado de Docentes: " + totalDineroDocentes);
        System.out.println("Total dinero recaudado de Trabajadores: " + totalDineroTrabajadores);
        System.out.println("Total dinero en general: " + totalDineroGeneral);
        
        System.out.println("\nMensaje final de despedida:");

        if (totalDineroGeneral < 100) {
            System.out.println("El evento concluye con ganancias BAJAS");
        } else if (totalDineroGeneral >= 100 && totalDineroGeneral < 200) {
            System.out.println("El evento concluye con ganancias MODERADAS");
        } else {
            System.out.println("El evento concluye con BUENAS ganancias");
        }
    }
}
