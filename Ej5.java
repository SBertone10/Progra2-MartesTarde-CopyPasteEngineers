public class Ej5{

    public Ej5() {
    } 

    public void calcularPromedio(double n1, double n2) {
        // Llamada al método suma y almacenamiento del resultado
        double total = sumar(n1, n2);
       
        double promedio = total / 2;
        System.out.println("La suma es: " + total);
        System.out.println("El promedio es: " + promedio);
    }

    public double sumar(double a, double b) {
        
        return a + b;
    }

    public static void main(String[] args) {
        PilaString procesos = new PilaString();
        procesos.InicializarPila();  
        procesos.Apilar("Main()"); //entra primero, llama a promedios
        procesos.Apilar("Promedio()");//entra segundo y llama a sumar
        procesos.Apilar("Sumar()");//ultimo en entrar
        
        Ej5 calculadora = new Ej5();
        calculadora.calcularPromedio(6, 7);
        System.out.println(procesos.Tope()); //en el tope va a estar suma
    }

    
       
}