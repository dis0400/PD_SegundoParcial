package Ej4_strategy;
import java.util.List;

public class OrdenarPorID implements IStrategy{
    @Override
    public List<Libros> ordenar(List<Libros> listaLibros) {
        System.out.println("ORDENADO POR ID>>>");
        listaLibros.sort((e1, e2) -> e1.getId().compareTo(e2.getId()));
        return listaLibros;
    }
}
