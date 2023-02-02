import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        List<String> ListaNombres = new ArrayList<String>();

        System.out.println("Ingrese la cantidad de nombres a colocar en lista");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un nombre");
            String nombre = input.nextLine();
            ListaNombres.add(nombre);
        }

        for(String valor : ListaNombres){
            System.out.println("La nueva lista contiene: " + valor);
        }

    }
}