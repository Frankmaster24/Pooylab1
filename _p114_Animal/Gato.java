package _p114_Animal;

public class Gato implements Animal {
    @Override
    public void dormir(){
        System.out.println("Elgato duerme en la caja");
    }
    @Override
    public void sonido () {
        System.out.println("Elgato hace miua... ");
    }
}
