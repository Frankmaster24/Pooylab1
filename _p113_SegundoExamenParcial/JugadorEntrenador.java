package _p113_SegundoExamenParcial;

public class JugadorEntrenador extends Jugador {
    private int subordinados;
    private int proyectos;
    
    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario) {
        super(nombre, sexo, descripcion, salario);
    }
    // Se genera el constructor
    public JugadorEntrenador(String nombre, char sexo, String descripcion, double salario, int subordinados, int proyectos) {
        super(nombre, sexo, descripcion, salario);
        this.subordinados = subordinados;
        this.proyectos = proyectos;
        calcularTotal();
    }
    // Se generan los getters and setters
    public int getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(int subordinados) {
        this.subordinados = subordinados;
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }
       @Override
    public double getBono() {
        return (getSalario() * 0.15) + (proyectos * 100) + (subordinados * 10);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Subordinados: " + subordinados + "\n" +
                "Proyectos: " + proyectos + "\n";
    }
}
