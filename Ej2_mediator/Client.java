package Ej2_mediator;

public class Client {
    public static void main(String[] args){
        ConcreteChat chat = new ConcreteChat();

        Estudiante e1 = new Estudiante(chat);
        e1.setTipoPersona("estudiante");
        e1.setNombre("Carlos");

        Estudiante e2 = new Estudiante(chat);
        e2.setTipoPersona("estudiante");
        e2.setNombre("Luisa");

        Docente d1 = new Docente(chat);
        d1.setTipoPersona("docente");
        d1.setNombre("Ramiro");

        Docente d2 = new Docente(chat);
        d2.setTipoPersona("docente");
        d2.setNombre("Alma");

        Administrativo a1 = new Administrativo(chat);
        a1.setTipoPersona("administrativo");
        a1.setNombre("Esteban");

        Administrativo a2 = new Administrativo(chat);
        a2.setTipoPersona("administrativo");
        a2.setNombre("Rafaela");

        chat.addToChat(e1);
        chat.addToChat(e2);
        chat.addToChat(d1);
        chat.addToChat(d2);
        chat.addToChat(a1);
        chat.addToChat(a2);

        e1.send("Mensaje es para todos", "grupal");
        e1.send("Mensaje es para los docentes", "docentes");

        d2.send("Mensaje es para los estudiantes", "estudiantes");
        a2.send("Mensaje es para todos", "grupal");
    }
}
