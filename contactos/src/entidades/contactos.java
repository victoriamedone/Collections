package entidades;
import java.util.ArrayList;
import java.util.Scanner;

public class contactos {

    private int nroContacto;
    private String nombre;

    ArrayList<String> listaContactos = new ArrayList<>();

    public contactos(){
        this.listaContactos = listaContactos;
    }

    public contactos(int nroContacto, String nombre) {
        this.nroContacto = nroContacto;
        this.nombre = nombre;
    }

    public int getNroContacto() {
        return nroContacto;
    }

    public void setNroContacto(int nroContacto) {
        this.nroContacto = nroContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getListaContactos() {
        return listaContactos;
    }

    public void setListaContactos(ArrayList<String> listaContactos) {
        this.listaContactos = listaContactos;
    }

    public void crearContacto(){

        Scanner input = new Scanner(System.in);
        contactos contacto = new contactos();

        System.out.println("Ingrese el nombre del contacto a crear");
        nombre = input.next();
        contacto.setNombre(nombre);

        System.out.println("Ingrese el numero correspondiente");
        nroContacto = input.nextInt();
        contacto.setNroContacto(nroContacto);

       añadirContacto(contacto);

    }
    public void añadirContacto(contactos contacto){
        this.listaContactos.add(String.valueOf(contacto));
    }


    @Override
    public String toString() {
        return "\n" +
                "nombre= " + nombre + "\n" +
                "nro de contacto= " + nroContacto + "\n";};

    public void verListado() {
        for (String contacto: listaContactos) {
            System.out.println(contacto);
    }
}
}
