package org.example;

public class Calculadora {
    private int N1;
    private int N2;

    public Calculadora() {
        this.N1 = this.N2 = 0;
    }
    public Calculadora(int num1, int num2) {
        this.N1 = num1;
        this.N2 = num2;
    }

    public int multiplicar(){
        return this.N1*this.N2;
    }
    public void setN1(int num1){
        this.N1 = num1;
    }
    public void setN2(int num2){
        this.N2 = num2;
    }
}
