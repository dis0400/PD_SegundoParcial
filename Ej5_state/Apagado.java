package Ej5_state;

public class Apagado implements IEstado {

    @Override
    public void handle(Celular celular) {
        celular.setProgramasAbiertos(0);
        celular.setCPU(0);
        System.out.println("El celular está apagado");
        System.out.println("Programas abiertos > " + celular.getProgramasAbiertos());
        System.out.println("Uso de recursos > " + celular.getCPU());
        System.out.println("Memoria > " + celular.getMemoria());
        System.out.println("RAM > " + celular.getRAM());
    }
    
}
