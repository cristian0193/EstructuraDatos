package Modelo;


public class Pelicula {
    
    private String id;
    private String titulo;
    private String categoria;
    private String formato;
    private String genero;

    public Pelicula(String id, String titulo, String categoria, String formato, String genero) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.formato = formato;
        this.genero = genero;
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

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
    
    
}
