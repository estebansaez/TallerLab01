import java.util.Arrays;
import java.util.Scanner;

public class ColeccionLibros {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String[][] libros = new String[100][3];
        desplegarMenu();
        agregarLibro(libros, entrada(), entrada(), entrada());
    }

    public static void desplegarMenu() {
        System.out.println("----------Bienvenido----------");
        System.out.println("Seleccione la opcion que desea realizar:");
        System.out.println("1- Agregar Libro");
        System.out.println("2- Buscar Libro");
        System.out.println("3- Mostrar espacios usados");
        System.out.println("4- Mostrar espacios disponibles");
        System.out.println("5- Mostrar toda la coleccion");
        System.out.println("6- Salir");
    }

    public static String[][] agregarLibro(String[][] misLibros, String titulo, String autor, String editorial) {
        for (int i = 0; i < misLibros.length; i++) {
            for (int j = 0; j < misLibros[i].length; j++) {
                misLibros[i][j] = titulo;
                System.out.print(misLibros[i][j]+" ");
            }
            System.out.println();
        }
        return misLibros;
    }

    public static String entrada() {
        Scanner teclado = new Scanner(System.in);
        String entrada;
        do {
            try {
                entrada = teclado.next();
                break;
            } catch (Exception e) {
                System.out.println("Error, ingrese una palabra");
                teclado.nextLine();
            }
        } while (true);
        return entrada;
    }

}

