package _p107_Forma;

import java.util.ArrayList;

public class App {
    public static void main( String[] args){
        //Forma f1 = new Forma("Azul");  // No puedo crear clases de una estancia abtracta
       

        Circulo circulo = new Circulo("Rojo", 10.3);
        System.out.println(circulo);
        System.out.println("Area Circulo : " + circulo.getArea());

        Triangulo triangulo = new Triangulo("verde", 10, 20);
        System.out.println(triangulo);
        System.out.println("Area triangulo :" + trinagulo.getArea());

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(triangulo);
        formas.add(new Circulo("Rosa", 33.45));

    }
    else if(forma instanceof Circulo) {
    System.out.print("Circulo es :");
    System.out.print( ((Circulo)forma).getArea() );
    }
    System.out.println("\n");
    }
    
    


    
    

