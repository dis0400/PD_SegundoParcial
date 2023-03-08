package Ej1_memento;

public class Documento {
    private int doc_version_id;
    private String doc_txt;
    private String doc_save_state;

    public Documento(int doc_version_id, String doc_save_state, String doc_txt) {
        this.doc_txt = doc_txt;
        this.doc_version_id = doc_version_id;
        this.doc_save_state = doc_save_state;
    }

    public void showInfo(){
        System.out.println("-- I.D.    : " + doc_version_id);
        System.out.println("-- Texto   : " + doc_txt);
        System.out.println("-- Estado   ");
        System.out.println("   De   ");
        System.out.println("   Guardado: " + doc_save_state);
    }

    public int getDocumentID() {
        return doc_version_id;
    }

    public void setDocumentID(int doc_id) {
        this.doc_version_id = doc_id;
    }

    public String getDocumentText() {
        return doc_txt;
    }

    public void setDocumentText(String doc_txt) {
        this.doc_txt = doc_txt;
    }

    public String getDocumentSaveState() {
        return doc_save_state;
    }

    public void setDocumentSaveState(String doc_save_state) {
        this.doc_save_state = doc_save_state;
    }
}
