package _p106_Persona;

public class App {
    public static void main (String[]args){
        Persona p1 = new Persona("Carlos Castañeda", "Av Mexico 115");
        Persona p2 = new Persona("Alma Gonzalez", "Primera de la bolo 234");

        Estudiante estudiante = new Estudiante (p1, "Ing. Software",2023,500);

        System.out.println(estudiante);
        System.out.println("Nombre    :    " + estudiante.getNombre());
        System.out.println("Direccion  :   " + estudiante.getDireccion());
        System.out.println("Carrera     :  " + estudiante.getCarrera());
        System.out.println("Año        :   " + estudiante.getAño());
        System.out.println("Colegiatura  : " + estudiante.getColegiatura());
        
        Apoyo apoyo = new Apoyo(p2, "Licenciatura", 1000);
        apoyo.setPaga(2500);
        System.out.println("Nombre    :    " + apoyo.getNombre());
        System.out.println("Direccion  :   " + apoyo.getDireccion());
        System.out.println("Escolaridad     :  " + apoyo.getEscolaridad());
        System.out.println("Paga  : " + apoyo.getPaga());
        
        Apoyo apoyo2 = new Apoyo("Sra Tere", "Sierra Madre 22","Secuandaria", 1500);
        Estudiante estudiante2 = new Estudiante ("Edgar", "Calle de abajo 134","Ing. Civil", 2023,2500);

    } 
    
}
