package paquete3;

public class Hospital {

    private String nombre;
    private String ciudad;
    private int numeroDoctores;
    private int numeroEnfermeros;

    public Hospital() {
        nombre = "na";
        ciudad = "Loja";
        numeroDoctores = 100;
        numeroEnfermeros = 400;
    }

    public Hospital(String n, String ciu, int doctores, int enfermeros) {

        nombre = n;
        ciudad = ciu;
        numeroDoctores = doctores;
        numeroEnfermeros = enfermeros;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCiudad(String n) {
        ciudad = n;
    }

    public void establecerNumeroDoctores(int n) {
        numeroDoctores = n;
    }

    public void establecerNumeroEnfermeros(int n) {
        numeroEnfermeros = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    public int obtenerNumeroDoctores() {
        return numeroDoctores;
    }

    public int obtenerNumeroEnfermeros() {
        return numeroEnfermeros;
    }

    @Override
    public String toString() {

        String cadena = String.format("Nombre: %s\nCiudad: %s\nNumero Doctores "
                + "%d\nNumero de Enfermeros:%d\n", obtenerNombre(),
                ciudad,
                /*
                En esta parte se puede utilizar "ciudad" en ves de 
                "obtenerCiudad()", ya que anteriormente le dimos un valor y toma
                ese valor dado anteriormente y lo presenta sin la necesidad de 
                que sea un metodo es como presentar una variable en un codigo
                normal.
                */
                obtenerNumeroDoctores(),
                obtenerNumeroEnfermeros());
        return cadena;
    }

}
