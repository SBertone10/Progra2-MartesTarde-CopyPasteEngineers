import java.util.ArrayList;
public class Ej4{
    public static void main(String[] args) {
        PilaString palabra = new PilaString();
        String miPalabra = "ALGORITMOS";
        String [] letras = miPalabra.split("");

        palabra.InicializarPila();

        for (String letra: letras){  //esto es un for each letra que hay en letras
            palabra.Apilar(letra);
        }
        palabra.MostrarPila();
        ArrayList<String> dadoVuelta = new ArrayList<>();
        int puntero =0;
        int cantletras=10;
        for (int i=0; i<cantletras; i++){
            dadoVuelta.add(palabra.Tope());
            puntero++;
            palabra.Desapilar();
        }
        System.out.println(dadoVuelta);
    }
}