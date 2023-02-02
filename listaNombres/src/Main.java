import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<String> Nombres = new ArrayList<String>();

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de nombres que contiene la lista");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un nombre");
            String nombre = input.next();
            Nombres.add(nombre);
        }

        Nombres.remove(1);
        Collections.sort(Nombres);

        for (String lista : Nombres) {
            System.out.println("Nombre: " + lista);
        }
    }
}