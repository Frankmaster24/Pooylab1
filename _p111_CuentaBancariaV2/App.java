package _p111_CuentaBancariaV2;

public class App {
    public static void main(String[] args) {
        Banco mibanco = new Banco("Banco del norte SA de CV","Priva las Cumbres 123");
        System.out.print("\033[H\033[2J");System.out.flush();
        mibanco.reporte();
        mibanco.agregarClinetes(new Cliente("Carlos Fuentes"));
        mibanco.agregarClinetes(new Cliente("Juan De La Fuente"));
        mibanco.agregarClinetes(new Cliente("Rene Mayorga"));
        mibanco.agregarClinetes(new Cliente("Maria Vazquez")); 
        System.out.println("\n>>> Los clientes del banco son:\n");
        mibanco.reporte();
        mibanco.getClinetes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.10));
        mibanco.getClinetes().get(0).agregarCuenta(new CuentaDeAhorro(1000,0.20));
        mibanco.getClinetes().get(0).agregarCuenta(new CuentaDeCheques(1000,500));
        mibanco.getClinetes().get(1).agregarCuenta(new CuentaDeCheques(2500,500));
        mibanco.getClinetes().get(2).agregarCuenta(new CuentaDeCheques(2000,600));
        mibanco.getClinetes().get(2).agregarCuenta(new CuentaDeAhorro(2000,0.40));
        mibanco.reporte();
        mibanco.getClinetes().get(0).getCuentas().get(0).retira(500);
        mibanco.getClinetes().get(0).getCuentas().get(1).retira(100);
        mibanco.getClinetes().get(1).getCuentas().get(1).deposita(100);
        mibanco.getClinetes().get(2).getCuentas().get(1).deposita(300);
        mibanco.getClinetes().get(2).getCuentas().get(2).retira(1000);
        mibanco.reporte();
        mibanco.calcularInteres();
        mibanco.reporte();
}
}