package Ejercicio6;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;

    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        if (anio > 2025){
            System.out.println("El año del libro no puede ser mayor al acutal.");
            this.anio = 2025;
        } else {
            this.anio = anio;
        }
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnio() {
        return anio;
    }

    public void setTitulo(String nuevoTitulo) {
        this.titulo = nuevoTitulo;
    }
    public void setAutor(String nuevoAutor) {
        this.autor = nuevoAutor;
    }
    public void setAnio(int nuevoAnio) {
        if (nuevoAnio > 2025) {
            System.out.println("Año inválido. No se modificó el valor.");
        } else {
            this.anio = nuevoAnio;
        }
    }

}
