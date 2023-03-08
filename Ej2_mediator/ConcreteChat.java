package Ej2_mediator;
import java.util.ArrayList;
import java.util.List;

public class ConcreteChat implements IChat {
    private List<Persona> listaChat = new ArrayList<>();

    public void addToChat(Persona persona){
        listaChat.add(persona);
    }

    @Override
    public void send(String msg, String tipoMensaje, Persona sender) {
        if (tipoMensaje == "grupal" && sender.getTipoPersona().equals("estudiante")){
            for (Persona persona:listaChat) {
                persona.receive(msg);
            }
        } else if (tipoMensaje == "docentes" && sender.getTipoPersona().equals("estudiante")) {
            for (Persona persona:listaChat) {
                if(persona.getTipoPersona().equals("docente")) {
                    persona.receive(msg);
                }
            }
        } else if (tipoMensaje == "administrativos" && sender.getTipoPersona().equals("estudiante")) {
            for (Persona persona:listaChat) {
                if(persona.getTipoPersona().equals("administrativo")) {
                    persona.receive(msg);
                }
            }
        } else if (tipoMensaje == "docentes" && sender.getTipoPersona().equals("docente")){
            for (Persona persona:listaChat) {
                if(persona.getTipoPersona().equals("docente")) {
                    persona.receive(msg);
                }
            }
        } else if (tipoMensaje == "estudiantes" && sender.getTipoPersona().equals("docente")){
            for (Persona persona:listaChat) {
                if(persona.getTipoPersona().equals("estudiante")) {
                    persona.receive(msg);
                }
            }
        } else if (tipoMensaje == "grupal" && sender.getTipoPersona().equals("administrativo")) {
            for (Persona persona:listaChat) {
                persona.receive(msg);
            }
        }
    }
    
}
