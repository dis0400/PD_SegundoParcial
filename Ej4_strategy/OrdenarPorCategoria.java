package Ej4_strategy;
import java.util.List;

public class OrdenarPorCategoria implements IStrategy{
    @Override
    public List<Libros> ordenar(List<Libros> listaLibros) {
        System.out.println("ORDENADO POR CATEGORIA>>>");
        listaLibros.sort((e1, e2) -> e1.getCategoria().compareTo(e2.getCategoria()));
        return listaLibros;
    }
    
}
