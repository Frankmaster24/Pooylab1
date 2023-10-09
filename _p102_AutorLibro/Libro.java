package _p102_AutorLibro;

public class Libro {
    private String Isbn;
    private String Nombre;
    private Autor Autor;
    private double Precio;
    private int Cantidad;
    public Libro() {
    }
    public Libro(String isbn, String nombre, Autor autor, double
    precio, int cant) {
    Isbn = isbn;
    Nombre = nombre;
    Autor = autor;
    Precio = precio;
    Cantidad = cant;
    }
    public String getIsbn() {
    return Isbn;
    }
    public void setIsbn(String isbn) {
    Isbn = isbn;
    }
    public String getNombre() {
    return Nombre;
    
    }
    public void setNombre(String nombre) {
    
    Nombre = nombre;
    
    }
    
    public Autor getAutor() {
    return Autor;
    
    }
    public void setAutor(Autor autor) {
    
    Autor = autor;
    
    }
    public double getPrecio() {
    return Precio;
    
    }
    public void setPrecio(double precio) {
    
    Precio = precio;
    
    }
    public int getCant() {
    return Cantidad;
    
    }
    public void setCant(int cant) {
    
    Cantidad = cant;
    
    }
    @Override
    public String toString() {
    
    return "Libro [Isbn=" + Isbn + ", Nombre=" + Nombre
    + ", Autor=" + Autor + ", Precio=" + Precio + ", Cant="
    + Cantidad + "]";
    }
    }

