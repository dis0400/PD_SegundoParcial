package Ej1_memento;

public class Client {
    public static void main (String []args){
        EditorDeTexto text_editor = new EditorDeTexto();
        Metodo command = new Metodo();

        Documento document;
        //Versión Guardada 1
        String txt = "PATRONES DE DISEÑO";
        document = new Documento(1, "Guardado", txt);
        command.setState(document);
        text_editor.saveDocument(1,command.createMemento());

        txt = "PATRONES DE DISEÑO\n" +
              "Un patrón de diseño es";
        document = new Documento(2, "Sin Guardar", txt);

        //Versión Guardada 2
        txt = "PATRONES DE DISEÑO\n" +
                "Un patrón de diseño es una técnica";
        document = new Documento(2, "Guardado", txt);
        command.setState(document);
        text_editor.saveDocument(2,command.createMemento());

        //Versión Guardada 3
        txt = "PATRONES DE DISEÑO\n" +
                "Un patrón de diseño es una técnica\n"+
                "para resolver problemas";
        document = new Documento(3, "Guardado", txt);
        command.setState(document);
        text_editor.saveDocument(3,command.createMemento());

        //Versión Guardada 4
        txt = "PATRONES DE DISEÑO\n" +
                "Un patrón de diseño es una técnica\n"+
                "para resolver problemas comunes en\n"+
                "el desarrollo de software.";
        document = new Documento(4, "Guardado", txt);
        command.setState(document);
        text_editor.saveDocument(4,command.createMemento());


        // PRIMERA PARTE
        System.out.println(">> PRIMERA PARTE:\n");
        System.out.println("Revertir\n");
        command.restoreFromMemento(text_editor.getVersion("Ctrl+Z"));
        System.out.println("Ctrl+Z\n");
        command.restoreFromMemento(text_editor.getVersion("Revertir"));
        System.out.println("Ctrl+Z\n");
        command.restoreFromMemento(text_editor.getVersion("Ctrl+Z"));

        // SEGUNDA PARTE
        System.out.println(">> SEGUNDA PARTE:\n");
        System.out.println("Deshacer cambios\n");
        command.restoreFromMemento(text_editor.getVersion("Deshacer cambios"));
        System.out.println("Ctrl+Y\n");
        command.restoreFromMemento(text_editor.getVersion("Ctrl+Y"));
        System.out.println("Ctrl+Y\n");
        command.restoreFromMemento(text_editor.getVersion("Ctrl+Y"));
    }
}