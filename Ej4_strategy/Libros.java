package Ej4_strategy;

public class Libros {
    private String id;
    private String titulo;
    private String categoria;

    public Libros(String id, String titulo, String categoria) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }


    public void shoInfo(){
        System.out.println("ID LIBRO: "+id +" TITULO LIBRO: "+titulo+" CATEGORIA: "+categoria);
    }
}
