package _p113_SegundoExamenParcial;

public class JugadorActivo extends Jugador {
    private int partidos;
    private int goles;
    //Se genera un cosntructor vacio y el constructor con los parametros

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario) {
        super(nombre, sexo, descripcion, salario);
    }

    public JugadorActivo(String nombre, char sexo, String descripcion, double salario, int partidos, int goles) {
        super(nombre, sexo, descripcion, salario);
        this.partidos = partidos;
        this.goles = goles;
        calcularTotal();
    }
    // Se calcula el bono
    @Override
    public double getBono() {
        return (getSalario() * 0.10) + (partidos * 50) + (goles * 5);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Partidos: " + partidos + "\n" +
                "Goles: " + goles + "\n";
    }
}
