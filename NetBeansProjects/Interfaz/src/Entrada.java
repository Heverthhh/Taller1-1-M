import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Entrada {

    private List<Muertes> muertos;

    public Entrada() {
        muertos = new ArrayList<>();
        cargarDesdeArchivo();
    }

    private void cargarDesdeArchivo() {
        try (Scanner scanner = new Scanner(new File("muertes.csv"))) {
            while (scanner.hasNextLine()) {
                String[] datosDifuntos = scanner.nextLine().split(",");
                Muertes temp = new Muertes(datosDifuntos[2], datosDifuntos[7], Integer.parseInt(datosDifuntos[8]));
                muertos.add(temp);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error al leer el archivo de municipios: " + e.getMessage());
        }
    }
    
    public int[] muertosPorGenero(){
        int muertosPorGenero[] = new int [2];
        int i=0;
        while (i<muertos.size()){
            Muertes temp = muertos.get(i);
            
            switch (temp.genero){
                case "Masculino":   muertosPorGenero[0]+=1;
                            break;
                case "Femenino":   muertosPorGenero[1]+=1;
                            break;
                default:    System.out.println("Error: El genero "+temp.genero+" no esta dentro de los posibles.");
                            break;
            }
            i++;
        }
        return muertosPorGenero;
    }
    
    public int[] muertosPorDiaTodos(){
        int muertosDia[] = new int [7];
        int i=0;
        while (i<muertos.size()){
            Muertes temp = muertos.get(i);
            
            switch (temp.dia) {
                case "domingo": muertosDia[0] += 1;
                                break;
                case "lunes":   muertosDia[1] += 1;
                                break;
                case "martes":  muertosDia[2] += 1;
                                break;
                case "miercoles":   muertosDia[3] += 1;
                                    break;
                case "jueves":  muertosDia[4] += 1;
                                break;
                case "viernes": muertosDia[5] += 1;
                                break;
                case "sabado":  muertosDia[6] += 1;
                                break;
                default:    System.out.println("Error: El dia " + temp.dia + " no esta dentro de los posibles.");
                            break;
            }
            i++;
        }
        return muertosDia;
    }
    
    public int[] muertosPorDiaHombres() {
        int muertosDia[] = new int[7];
        int i = 0;
        while (i < muertos.size()) {
            Muertes temp = muertos.get(i);

            if(temp.genero.equals("Masculino")){
                switch (temp.dia) {
                    case "domingo":
                        muertosDia[0] += 1;
                        break;
                    case "lunes":
                        muertosDia[1] += 1;
                        break;
                    case "martes":
                        muertosDia[2] += 1;
                        break;
                    case "miercoles":
                        muertosDia[3] += 1;
                        break;
                    case "jueves":
                        muertosDia[4] += 1;
                        break;
                    case "viernes":
                        muertosDia[5] += 1;
                        break;
                    case "sabado":
                        muertosDia[6] += 1;
                        break;
                    default:
                        System.out.println("Error: El dia " + temp.dia + " no esta dentro de los posibles.");
                        break;
                }
            }
            i++;
        }
        return muertosDia;
    }
    
    
}
