//José Francisco Nava Casillas
//Convertir temperaturas
import java.util.Scanner;

public class _p12_ConvertirTemperatura {
    public static void main(String[] args) {
        float fahrenheit,celsius ;
        Scanner obj=new Scanner(System.in);
        fahrenheit=celsius=0;

        System.out.print("Dame los grados en fahrenheit= "); fahrenheit = obj.nextFloat();
      //el 5.0f asegura que las operaciones se hagan con numeros flotantes 
      
        celsius = (fahrenheit - 32) * (5.0f / 9.0f);

        System.out.println(String.format("La conversion la conversion es= %f ", celsius));

    }
}