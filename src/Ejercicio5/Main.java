package Ejercicio5;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Marcos", 29);
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
        persona1.setNombre("Rafael");
        persona1.setEdad(30);
        System.out.println(persona1.getNombre() + " tiene " + persona1.getEdad() + " años.");
    }
}
