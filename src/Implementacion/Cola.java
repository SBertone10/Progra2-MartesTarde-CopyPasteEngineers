package Implementacion;

import Interface.ColaTDA;

public class Cola implements ColaTDA {
    private static final int MAX = 100;
    private int[] datos;
    private int cantidad;

    public void InicializarCola() {
        datos = new int[MAX];
        cantidad = 0;
    }

    public void Acolar(int x) {
        if (cantidad < MAX) {
            datos[cantidad] = x;
            cantidad++;
        }

    }

    public void Desacolar() {
        if (!ColaVacia()) {
            for(int i = 0; i <cantidad - 1; ++i) {datos[i] =datos[i + 1];
            }

            cantidad--;
        }

    }

    public int Primero() {
        return datos[0];
    }

    public boolean ColaVacia() {
        return cantidad == 0;
    }
}
