package _p113_SegundoExamenParcial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private String liga;
    private ArrayList<Jugador> jugadores;
    // Se generan los constructores

    
    public Equipo(String nombre, String liga) {
        this.nombre = nombre;
        this.liga = liga;
        this.jugadores = new ArrayList<>();
    }

    public Equipo() {
    }
    // Se genean los getters and setters
    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }
    // Se hace el total de los bonos
    public double getTotalBono() {
        double totalBono = 0.0;
        for (Jugador jugador : jugadores) {
            totalBono += jugador.getBono();
        }
        return totalBono;
    }

    public double getTotal() {
        double totalSalarios = 0.0;
        for (Jugador jugador : jugadores) {
            totalSalarios += jugador.getTotal();
        }
        return totalSalarios;
    }
    //Total de los jugadores hombres
    public int getTotalH() {
        int totalHombres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'H') {
                totalHombres++;
            }
        }
        return totalHombres;
    }
    // Se genera de total de jugadoras mujeres
    public int getTotalM() {
        int totalMujeres = 0;
        for (Jugador jugador : jugadores) {
            if (jugador.getSexo() == 'M') {
                totalMujeres++;
            }
        }
        return totalMujeres;
    }
    // Se hace el reporte de todos los datos de cada jugador y su rol 
    public void reporte() {
        System.out.println("Reporte del Equipo: " + nombre);
        System.out.println("Liga: " + liga);
        System.out.println("Total de jugadores: " + jugadores.size());
        System.out.println("Total de bono del equipo: " + getTotalBono());
        System.out.println("Total de salarios del equipo: " + getTotal());
        System.out.println("Total de jugadores Hombres: " + getTotalH());
        System.out.println("Total de jugadores Mujeres: " + getTotalM());
        System.out.println("Listado de Jugadores:");
        for (Jugador jugador : jugadores) {
            System.out.print(jugador.getClass().getSimpleName() + " ");
            if (jugador instanceof JugadorEntrenador) {
                System.out.println("[" + jugador.toString() + "]");
            } else {
                System.out.println(jugador.toString());
            }
        }
    }

    @Override
    public String toString() {
        return "Equipo: " + nombre + "\n" +
               "Liga: " + liga + "\n" +
               "Total de jugadores: " + jugadores.size() + "\n" +
               "Total de bono del equipo: " + getTotalBono() + "\n" +
               "Total de salarios del equipo: " + getTotal() + "\n" +
               "Total de jugadores Hombres: " + getTotalH() + "\n" +
               "Total de jugadores Mujeres: " + getTotalM() + "\n";
    }
}
