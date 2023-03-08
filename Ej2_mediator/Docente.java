package Ej2_mediator;

public class Docente extends Persona {
    private String nombre;
    private String ci;

    public Docente(IChat mediator) {
        super(mediator);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public void send(String msg, String tipoMensaje) {
        mediator.send(msg, tipoMensaje, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Mensaje recibido por docente " + nombre + " > " + msg);
    }
    
}
