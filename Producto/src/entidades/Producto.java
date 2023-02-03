package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Producto {

    private String tipo;
    private int stock;
    private double precio;

    ArrayList<Producto> listaProducto = new ArrayList<>();

    public Producto() {
        this.listaProducto = listaProducto;
    }

    public Producto(String tipo, int stock, double precio) {
        this.tipo = tipo;
        this.stock = stock;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(ArrayList<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    public void crearProducto(){
        Producto producto = new Producto();
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el producto a contabilizar:");
        tipo = input.next();
        producto.setTipo(tipo);

        System.out.println("Ingrese el stock disponible: ");
        stock = input.nextInt();
        producto.setStock(stock);

        System.out.println("Ingrese el precio x unidad");
        precio = input.nextDouble();
        producto.setPrecio(precio);

        añadirProducto(producto);
    }

    public void añadirProducto(Producto producto){
        this.listaProducto.add(producto);
    }

    public void verListado(){
        for (Producto producto:listaProducto) {
            System.out.println(producto);
        }
    }


    @Override
    public String toString() {
        return "Producto" + "\n" +
        "tipo:" + tipo + "\n" +
                "stock:" + stock + "\n" +
                "precio:" + precio + "\n";
    }

    public void mayor20(){
        for (Producto i : listaProducto) {
            if (i.getPrecio() >= 20.00) {
                System.out.println("Productos con precio mayor a 20$");
                System.out.println(i);
            }
        }
    }

    public void menor100(){
        for (Producto i : listaProducto) {
            if (i.getPrecio() <= 100.00) {
                System.out.println("Productos con precio menor a 100$");
                System.out.println(i);
            }
        }
    }


}
