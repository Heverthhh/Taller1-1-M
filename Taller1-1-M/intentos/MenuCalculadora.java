package com.mycompany.calculadora;
import javax.swing.JOptionPane;

public class MenuCalculadora {
    
    public int showCalculadora() {
        StringBuilder txt = new StringBuilder();
        txt.append("1. Suma");
        txt.append("\n2. Resta");
        txt.append("\n3. Multiplicacion");
        txt.append("\n4. Division");
        txt.append("\n5. Potencia");
        txt.append("\n6. Raiz");
        txt.append("\n7. Seno");
        txt.append("\n8. Coseno");
        txt.append("\n9. Tangente");
        txt.append("\n10. Salir");
        
        int opc = Integer.parseInt(JOptionPane.showInputDialog(null, txt, "Calculadora", JOptionPane.QUESTION_MESSAGE));
        return opc;
    }
    
    public void executeCalculadora() {
        int opc;
        do {
            opc = showCalculadora();
            
            switch (opc) {
                case 1:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a sumar"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a sumar"));
                    Calculadora calculadoraSuma = new Calculadora(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado de la suma: " + calculadoraSuma.suma());
                    break;
                case 2:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a restar"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a restar"));
                    Calculadora calculadoraResta = new Calculadora(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado de la resta: " + calculadoraResta.resta());
                    break;
                case 3:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a multiplicar"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a multiplicar"));
                    Calculadora calculadoraMulti = new Calculadora(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado de la multiplicación: " + calculadoraMulti.multi());
                    break;
                case 4:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número a dividir"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número a dividir"));
                    Calculadora calculadoraDiv = new Calculadora(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado de la división: " + calculadoraDiv.div());
                    break;
                case 5:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el exponente"));
                    Calculadora calculadoraPot = new Calculadora(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado de la potencia: " + calculadoraPot.pot());
                    break;
                case 6:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el índice de la raíz"));
                    Calculadora calculadoraRaiz = new Calculadora(num1, num2);
                    JOptionPane.showMessageDialog(null, "Resultado de la raíz: " + calculadoraRaiz.raiz());
                    break;
                case 7:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                    Calculadora calculadoraSeno = new Calculadora(num1, 0);
                    JOptionPane.showMessageDialog(null, "Resultado del seno: " + calculadoraSeno.seno());
                    break;
                case 8:
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                    Calculadora calculadoraCoseno = new Calculadora(num1, 0);
                    JOptionPane.showMessageDialog(null, "Resultado del coseno: " + calculadoraCoseno.coseno());
                    break;
                case 9:
                    int num1;
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                    Calculadora calculadoraTangente = new Calculadora(num1, 0);
                    JOptionPane.showMessageDialog(null, "Resultado de la tangente: " + calculadoraTangente.tangente());
                    break;
                case 10:
                    JOptionPane.showMessageDialog(null, "Saliendo de la calculadora.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
            }
        } while (opc != 10);
    }
}
