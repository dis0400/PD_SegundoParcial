package Ej4_strategy;
import java.util.List;

public class EstrategiaOrdenamiento {
    private IStrategy strategy;

    private List<Libros> listaLibros;

    public EstrategiaOrdenamiento(List<Libros> listaLibros) {
        strategy = new OrdenarPorID();
        this.listaLibros = listaLibros;

    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    
    public void ordenar(){
        listaLibros = strategy.ordenar(listaLibros);
    }


}
