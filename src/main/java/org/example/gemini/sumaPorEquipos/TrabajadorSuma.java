package org.example.gemini.sumaPorEquipos;

public class TrabajadorSuma implements Runnable{
    private int inicio;
    private int fin;
    private int resultado;

    public TrabajadorSuma(int inicio, int fin) {
        this.inicio = inicio;
        this.fin = fin;
        this.resultado = 0;
    }

    @Override
    public void run() {
        for (int i = inicio; i <= fin ; i++) {
            resultado += i;
        }
    }

    public int getResultado() {
        return resultado;
    }
}
