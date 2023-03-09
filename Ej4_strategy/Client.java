package Ej4_strategy;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main (String[]args){
        List<Libros> librosList = new ArrayList<>();

        librosList.add(new Libros("890", "Harry Potter", "Magia"));
        librosList.add(new Libros("456", "Mujercitas", "historia"));
        librosList.add(new Libros("651", "Gaviotas", "melancolia"));
        librosList.add(new Libros("100", "Percy Jackson", "aventura"));
        librosList.add(new Libros("933", "La Constitucion", "Historia"));

        EstrategiaOrdenamiento estrategiaOrdenamiento = new EstrategiaOrdenamiento(librosList);

        for(Libros libros : librosList){
            libros.shoInfo();
        }

        estrategiaOrdenamiento.setStrategy(new OrdenarPorID());
        estrategiaOrdenamiento.ordenar();

        for(Libros libros : librosList){
            libros.shoInfo();
        }

        estrategiaOrdenamiento.setStrategy(new OrdenarPorTitulo());
        estrategiaOrdenamiento.ordenar();

        for(Libros libros : librosList){
            libros.shoInfo();
        }

        estrategiaOrdenamiento.setStrategy(new OrdenarPorCategoria());
        estrategiaOrdenamiento.ordenar();

        for(Libros libros : librosList){
            libros.shoInfo();
        }



    }
}
