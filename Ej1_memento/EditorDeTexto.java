package Ej1_memento;
import java.util.HashMap;
import java.util.Map;

public class EditorDeTexto {
    private final Map<Integer,Memento> stateSaved= new HashMap<>();
    private int version;
    private int max_version;

    public void saveDocument(Integer version, Memento memento){
        setVersion(version);
        setMaxVersion(version);
        stateSaved.put(version,memento);
    }

    public Memento getVersion(String method){
        int comp = version;
        if((method.toUpperCase().equals("REVERTIR") || method.toUpperCase().equals("CTRL+Z")) && comp-1 != 0){
            setVersion(version-1);
            return stateSaved.get(comp - 1);
        } else if ((method.toUpperCase().equals("DESHACER CAMBIOS") || method.toUpperCase().equals("CTRL+Y")) && comp+1 <= max_version){
            setVersion(version+1);
            return stateSaved.get(comp + 1);
        } else{
            System.out.println("--- Comando Desconocido ---");
            return stateSaved.get(comp);
        }
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setMaxVersion(int version) {
        this.max_version = version;
    }
}
