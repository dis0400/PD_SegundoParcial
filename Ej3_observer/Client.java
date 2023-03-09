package Ej3_observer;

public class Client {
    public static void main (String [] args){
        Facebook paginaWeb = new Facebook();

        Usuario usuario1 = new Usuario("Carlos");
        Usuario usuario2 = new Usuario("Juan");
        Usuario usuario3 = new Usuario("Maria");

        paginaWeb.subscribirUsuario(usuario1, TipoNotificacion.IMAGENES);
        paginaWeb.subscribirUsuario(usuario2, TipoNotificacion.VIDEOS);

        paginaWeb.subscribirUsuario(usuario3, TipoNotificacion.VIDEOS);
        paginaWeb.subscribirUsuario(usuario3, TipoNotificacion.IMAGENES);

        paginaWeb.notifyObservers("Nuevo video!!", TipoNotificacion.VIDEOS);
        paginaWeb.notifyObservers("Nuevas imagenes de gatitos!!", TipoNotificacion.IMAGENES);
}
}
