package Ej2_mediator;

public class Estudiante extends Persona {
        private String nombre;
        private int nroMatricula;
    
        public Estudiante(IChat mediator) {
            super(mediator);
        }
    
        public String getNombre() {
            return nombre;
        }
    
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        public int getNroMatricula() {
            return nroMatricula;
        }
    
        public void setNroMatricula(int nroMatricula) {
            this.nroMatricula = nroMatricula;
        }
    
        @Override
        public void send(String msg, String tipoMensaje) {
            mediator.send(msg, tipoMensaje, this);
        }
    
        @Override
        public void receive(String msg) {
            System.out.println("Mensaje recibido por estudiante " + nombre + " > " + msg);
        }

}
