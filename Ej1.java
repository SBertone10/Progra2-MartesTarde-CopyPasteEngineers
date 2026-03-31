public class Ej1{
    public static void main(String[] args) {
        //EJ1 historial de navegacion
        
        PilaString historial = new PilaString();
        historial.InicializarPila();
        historial.Apilar("fi.uba.ar");
        historial.Apilar("campusuade.edu.ar");
        historial.Apilar("stackoverflow.com");
        historial.MostrarPila();
        historial.Desapilar();
        System.out.println("----");
        historial.MostrarPila();
    }
}
        