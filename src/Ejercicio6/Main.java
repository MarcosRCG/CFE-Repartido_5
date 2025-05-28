package Ejercicio6;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Game of Thrones", "George R. R. Martin", 2030);
        System.out.println(libro1.getTitulo() + " : " + libro1.getAutor() + " : " + libro1.getAnio());
        libro1.setTitulo("Harry Potter y el cáliz de fuego");
        libro1.setAutor("J. K. Rowling");
        libro1.setAnio(2030);
        libro1.setAnio(2000);
        System.out.println(libro1.getTitulo() + " : " + libro1.getAutor() + " : " + libro1.getAnio());

    }
}
