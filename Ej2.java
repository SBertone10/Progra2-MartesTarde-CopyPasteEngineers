public class Ej2{
    public static void main(String[] args) {
        PilaString historial = new PilaString();
        historial.InicializarPila();
        historial.Apilar("linea de codigo 1");
        historial.Apilar("linea de codigo 2");
        historial.Apilar("linea de codigo 2 borrada");
        //al preisonar ctl+z desapila el borrado de la linea de codigo 2
        historial.Desapilar();
        historial.MostrarPila();
    }
}