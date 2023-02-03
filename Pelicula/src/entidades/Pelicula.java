package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Pelicula {

    private String titulo;
    private String director;
    private double duracion;

    ArrayList<Pelicula> listaPeliculas = new ArrayList<>();

    public Pelicula() {
        this.listaPeliculas = listaPeliculas;
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    public void crearPelicula(){
        Scanner input = new Scanner(System.in);
        Pelicula pelicula = new Pelicula();


        System.out.println("Ingrese el titulo de la película");
        titulo = input.next();
        pelicula.setTitulo(titulo);

        System.out.println("Ingrese el nombre del director");
        director = input.next();
        pelicula.setDirector(director);

        System.out.println("Ingrese la duración de la pelicula");
        duracion = input.nextDouble();
        pelicula.setDuracion(duracion);

        añadirPelicula(pelicula);

    }

    public void añadirPelicula(Pelicula pelicula){
        this.listaPeliculas.add(pelicula);
    }

    public void verListado(){
        for (Pelicula pelicula: listaPeliculas) {
            System.out.println(pelicula);
        }
    }

    @Override
    public String toString() {
        return "Pelicula" +
                "titulo:" + titulo + "\n" +
                "director:" + director + "\n" +
                "duracion:" + duracion ;
    }
}
