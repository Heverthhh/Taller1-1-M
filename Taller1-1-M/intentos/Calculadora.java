package com.mycompany.calculadora;

import static java.lang.Math.*;

public class Calculadora {
    // variables
    int num1;
    int num2;

    // constructor
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // métodos
    int suma() {
        return num1 + num2;
    }

    int resta() {
        return num1 - num2;
    }

    int multi() {
        return num1 * num2;
    }

    int div() {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        return 0;
    }

    double pot() {
        return pow(num1, num2);
    }

    double raiz() {
        return pow(num1, 1.0 / num2);
    }

    double seno() {
        return sin(num1);
    }

    double coseno() {
        return cos(num1);
    }

    double tangente() {
        return tan(num1);
    }
}
  
