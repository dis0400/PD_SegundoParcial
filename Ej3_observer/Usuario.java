package Ej3_observer;

public class Usuario implements IObserver {
    private String nombre;

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void update(String msg) {
        System.out.println("El usuario " + this.nombre + " recibio la notificacion: [" + msg + "]");
    }
    
}
