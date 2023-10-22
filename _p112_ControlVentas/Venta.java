package _p112_ControlVentas;

public abstract class Venta {
    private String Articulo;
    private int Cantidad;
    private double Precio;
    private double Total;

    public Venta(String articulo2, int cantidad2, double precio2) {
    }

    public Venta(String articulo, int cantidad, int precio, int total) {
        Articulo = articulo;
        Cantidad = cantidad;
        Precio = precio;
        Total = total;
    }

    public String getArticulo() {
        return Articulo;
    }

    public void setArticulo(String articulo) {
        Articulo = articulo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int cantidad) {
        Cantidad = cantidad;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public double getTotal() {
        return Total;
       
    }

    public void setTotal(int total) {
        Total = total;
    }
    // Se hace abstracta la clase getTotalVenta
    public abstract double getTotalVenta();
    // Se genera el toString 
    @Override
    public String toString() {
        return "Venta [Articulo=" + Articulo + ", Cantidad=" + Cantidad + ", Precio=" + Precio + ", Total=" + Total
                + "]";
    }
    
    
}
