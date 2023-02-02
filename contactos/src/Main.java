import entidades.contactos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        contactos contacto1 = new contactos();
        Scanner input = new Scanner(System.in);

        String fin = "";

        do {
            contacto1.crearContacto();

            System.out.println("Si quiere ingresar otro contacto, presione S, de lo contrario " +
                    "presione cualquier tecla para salir");
            fin = input.next();

        }while (fin.equalsIgnoreCase("s"));

        System.out.println("La lista de contactos ingresada:");

        contacto1.verListado();

    }
}