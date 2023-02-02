import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> ListaNumeros = new ArrayList<Integer>();

       ListaNumeros.add(1);
       ListaNumeros.add(2);
       ListaNumeros.add(3);
       ListaNumeros.add(4);
       ListaNumeros.add(5);
       ListaNumeros.add(6);
       ListaNumeros.add(7);

       for(Integer valor : ListaNumeros){
           System.out.println(valor);
       }

        List<Integer> ListaNumeros2 = new ArrayList<Integer>();


        Scanner input = new Scanner(System.in);
       System.out.println("Ingrese un nuevo largo para la lista");
       int num = input.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un nuevo nro");
            int numero = input.nextInt();
            ListaNumeros2.add(numero);
        }

        for(Integer valor : ListaNumeros2){
            System.out.println("La nueva lista contiene: " + valor);
        }

    }
}