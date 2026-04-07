import Implementacion.Cola;
import Interface.ColaTDA;

public class ej2 {
// Impresora Lab
    static void main(String[] args) {

        ColaTDA impresora = new Cola();
        impresora.InicializarCola();

        System.out.println("=== Archivos recibidos por la impresora ===");
        impresora.Acolar(1); System.out.println("Alumno 1 envió su TP");
        impresora.Acolar(2); System.out.println("Alumno 2 envió su TP");
        impresora.Acolar(3); System.out.println("Alumno 3 envió su TP");
        impresora.Acolar(4); System.out.println("Alumno 4 envió su TP");
        impresora.Acolar(5); System.out.println("Alumno 5 envió su TP");

        System.out.println("\n=== Orden de impresión (FIFO) ===");
        int orden = 1;
        while (!impresora.ColaVacia()) {
            System.out.println(orden + ". Imprimiendo TP del alumno " + impresora.Primero());
            impresora.Desacolar();
            orden++;
        }

        System.out.println("\nTodos los TPs fueron impresos.");
    }
}