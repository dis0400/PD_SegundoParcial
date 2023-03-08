package Ej1_memento;

public class Memento {
    private Documento state;

    public Memento(Documento stateSaved){
        this.state=stateSaved;
    }

    public Documento getState() {
        return state;
    }
}
