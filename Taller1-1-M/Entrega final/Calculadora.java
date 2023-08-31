import static java.lang.Math.*;
import java.util.Scanner;

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

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(0, 0);
        int opc;

        System.out.println("------Calculadora-------");
        System.out.println(" 1. Suma"
                + "2. Resta"
                + "3. Multiplicacion"
                + "4. Division"
                + "5. Potencia"
                + "6. Raiz"
                + "7. Seno"
                + "8. Coseno"
                + "9. Tangente"
                + "10. Salir");

        do {
            System.out.println("Digite un número entre 1-10: ");
            opc = lectura.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Ingrese el primer número a sumar: ");
                    int num1 = lectura.nextInt();
                    System.out.println("Ingrese el segundo número a sumar: ");
                    int num2 = lectura.nextInt();
                    calculadora = new Calculadora(num1, num2);
                    System.out.println("Resultado de la suma: " + calculadora.suma());
                    break;
                case 2:
                    System.out.println("Ingrese un número: ");
                    num1 = lectura.nextInt();
                    System.out.println("Ingrese el número que restará: ");
                    num2 = lectura.nextInt();
                    calculadora = new Calculadora(num1, num2);
                    System.out.println("Resultado de la resta: " + calculadora.resta());
                    break;
                case 3:
                    System.out.println("Ingrese un número: ");
                    num1 = lectura.nextInt();
                    System.out.println("Ingrese el número que multiplicará: ");
                    num2 = lectura.nextInt();
                    calculadora = new Calculadora(num1, num2);
                    System.out.println("Resultado de la multiplicación: " + calculadora.multi());
                    break;
                case 4:
                    System.out.println("Ingrese un número: ");
                    num1 = lectura.nextInt();
                    System.out.println("Ingrese el número que dividirá: ");
                    num2 = lectura.nextInt();
                    calculadora = new Calculadora(num1, num2);
                    System.out.println("Resultado de la división: " + calculadora.div());
                    break;
                case 5:
                    System.out.println("Ingrese un número: ");
                    num1 = lectura.nextInt();
                    System.out.println("Ingrese el número que potenciará: ");
                    num2 = lectura.nextInt();
                    calculadora = new Calculadora(num1, num2);
                    System.out.println("Resultado de la potencia: " + calculadora.pot());
                    break;
                case 6:
                    System.out.println("Ingrese un número: ");
                    num1 = lectura.nextInt();
                    System.out.println("Ingrese el número que se le hará raiz: ");
                    num2 = lectura.nextInt();
                    calculadora = new Calculadora(num1, num2);
                    System.out.println("Resultado de la raiz: " + calculadora.raiz());
                    break;
                case 7:
                    System.out.println("Ingrese un número: ");
                    num1 = lectura.nextInt();
                    calculadora = new Calculadora(num1, 0);
                    System.out.println("Resultado del seno: " + calculadora.seno());
                    break;
                case 8:
                    System.out.println("Ingrese un número: ");
                    num1 = lectura.nextInt();
                    calculadora = new Calculadora(num1, 0);
                    System.out.println("Resultado del coseno: " + calculadora.coseno());
                    break;
                case 9:
                    System.out.println("Ingrese un número: ");
                    num1 = lectura.nextInt();
                    calculadora = new Calculadora(num1, 0);
                    System.out.println("Resultado de la tangente: " + calculadora.tangente());
                    break;
                case 10:
                    System.out.println("Saliendo de la calculadora.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opc != 10);
    }
}
