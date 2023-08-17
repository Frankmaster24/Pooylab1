// Mnada un saludo a pantalla

public class _p01_HolaMundo {
    public static void main(String[] args) {
        String amigo = "Elchikirris";
        String hermano = "Valentin Elizalde";
        String mensaje =String.format ("Tanto %s como %s desean aprender Java",amigo,hermano);
        System.out.println("Hola Mundo desde el lenguaje java");
        System.out.println("\nHola amigos" + amigo + "bienvenido a java");
        System.out.println("\nMis amigoes" + amigo + "mi hermano es" + hermano );
        System.out.println("\n" + mensaje);
        
    }
}