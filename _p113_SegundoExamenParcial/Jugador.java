package _p113_SegundoExamenParcial;

public abstract class Jugador {
    protected String nombre;
    protected char sexo;
    protected String descripcion;
    protected double salario;
    protected double total;
    // Se hacen los constructores
    
    public Jugador(String nombre, char sexo, String descripcion, double salario) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.descripcion = descripcion;
        this.salario = salario;
        calcularTotal();
    }

    public abstract double getBono();

    protected void calcularTotal() {

    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Sexo: " + sexo + "\n" +
               "Descripción: " + descripcion + "\n" +
               "Salario: " + salario + "\n" +
               "Total: " + total + "\n" +
               "Bono: " + getBono();
    }

    // Se generan los getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
