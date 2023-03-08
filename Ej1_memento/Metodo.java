package Ej1_memento;

public class Metodo {
    private Documento state;

    public Metodo(){}

    public void setState(Documento state) {
        System.out.println("******** SET STATE ********");
        state.showInfo();
        System.out.println("***************************");
        this.state = state;
    }

    public Memento createMemento(){
        System.out.println("****** CREATE STATE *******");
        state.showInfo();
        System.out.println("***************************\n");
        return new Memento(this.state) ;
    }

    public void restoreFromMemento(Memento memento){
        this.state=memento.getState();
        System.out.println("***** STATE RESTORED ******");
        this.state.showInfo();
        System.out.println("***************************\n");
    }

}
