package _p113_SegundoExamenParcial;

public class App {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");System.out.flush();
        Equipo miequipo = new Equipo("Real Mandil", "Torneo el mas chido");
        miequipo.reporte();
        miequipo.agregarJugador(new JugadorEntrenador("Francisco Nava", 'H', "Entrenador Principal", 100000, 8,1));
        miequipo.agregarJugador(new JugadorEntrenador("Edgar Nieves", 'H', "Entrenador de Apoyo", 9000, 10,2));
        miequipo.agregarJugador(new JugadorActivo("Alfredito Lopez",'H',"Principal No 11",100,2,2));
        miequipo.agregarJugador(new JugadorActivo("Uriel Maurisio",'H',"Principal No 16",100,3,1));
        miequipo.agregarJugador(new JugadorActivo("Alejandra Guzman",'M',"Principal No 21",100,3,3));
        miequipo.agregarJugador(new JugadorActivo("Armando Santana",'H',"Banca No 10",120,4,1));
        miequipo.agregarJugador(new JugadorActivo("Mijares Perez",'H',"Banca No 15",150,4,4));
        miequipo.agregarJugador(new JugadorActivo("Alejandro Hernandez",'M',"Banca No 20",350,5,3));
        miequipo.agregarJugador(new JugadorActivo("Ricardo Perez",'M',"Principal No 12",550,5,5));
        miequipo.agregarJugador(new JugadorActivo("Ricarda Lopez",'M',"Principal No 12",600,4,2));
        miequipo.agregarJugador(new JugadorActivo("Diana Saurio",'M',"Principal No 12",700,5,3));
        miequipo.reporte();
        }
}
