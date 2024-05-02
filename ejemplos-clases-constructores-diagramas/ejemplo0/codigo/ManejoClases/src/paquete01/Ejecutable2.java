package paquete01;

public class Ejecutable2 {

    public static void main(String[] args) {
        Computadora personal = new Computadora(24.0);
        personal.establecerTipoProcesador("Intel vPRo");

        System.out.printf("%s %2,f",
                personal.obtenerTipoProcesador(),
                personal.obtenerMemoria());
    }
    
}
