package Ej4_strategy;
import java.util.List;

public class OrdenarPorTitulo implements IStrategy {
    @Override
    public List<Libros> ordenar(List<Libros> listaLibros) {
        System.out.println("ORDENADO POR TITULO>>>");
        listaLibros.sort((e1, e2) -> e1.getTitulo().compareTo(e2.getTitulo()));
        return listaLibros;
    }
    
}
