public class Ej6{
    public static void main(String[] args) {
        PilaString historial = new PilaString();
        historial.InicializarPila();
        historial.Apilar("/C:");
        historial.Apilar("Usuarios");
        historial.Apilar("Documentos");
        //voy para atras
        String ultimoVisto=historial.Tope(); //auxiliar guarda lo ultimo visto
        historial.Desapilar();//fui para atras ahora topes es usuarios estoy en esa carpeta
        historial.MostrarPila();
        historial.Apilar(ultimoVisto); //presiono subir de nivel
        System.out.println("----");
        historial.MostrarPila();
    }
}