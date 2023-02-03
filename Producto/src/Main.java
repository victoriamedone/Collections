import entidades.Producto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto();
        Scanner input = new Scanner(System.in);
        String fin = "";

        do {
            producto.crearProducto();
            System.out.println("Si desea ingresar otro producto presione S, de lo contrario" +
                    "presione cualquier tecla para continuar" );
            fin = input.next();

        }while (fin.equalsIgnoreCase("s"));

        producto.verListado();
        producto.mayor20();
        producto.menor100();
    }
}