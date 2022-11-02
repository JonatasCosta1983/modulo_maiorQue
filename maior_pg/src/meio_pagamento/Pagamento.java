package meio_pagamento;

public class Pagamento {
    private int a;
    private int b;
    private int c;
    private int aux;

    public Pagamento(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int calcular(int a, int b, int c) {

        if (a > b && a > c) {
            aux = a;
        } else {
            if (b > c) {
                aux = b;
            } else {
                aux = c;
            }
        }
        return aux;
    }

    public void valorMaior(int valor) {
        System.out.println("O valor maior é:" + valor);
    }
}