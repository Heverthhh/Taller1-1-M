package thread;

public class Main{

public static void main(String[] args) {
Interfaz ventana = new Interfaz();
ventana.setSize(700,300);
ventana.setResizable(false);
ventana.setLocationRelativeTo(null);
ventana.setTitle("Casino (Hilos)");
ventana.setVisible(true);
}
}