import entidades.Pelicula;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pelicula pelicula = new Pelicula();

        String fin="";

        System.out.println("Sistema de ingreso de películas");
        do {
            pelicula.crearPelicula();

            System.out.println("Si desea ingresar otra película presione S, de lo contrario" +
                    "presione cualquier tecla para continuar" );
            fin = input.next();

        }while (fin.equalsIgnoreCase("s"));

        pelicula.verListado();

    }
}