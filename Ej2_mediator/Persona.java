package Ej2_mediator;

public abstract class Persona {
    private String tipoPersona;
    protected IChat mediator;

    public Persona(IChat mediator) {
        this.mediator = mediator;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public abstract void send(String msg, String tipoMensaje);
    public abstract void receive(String msg);
}
