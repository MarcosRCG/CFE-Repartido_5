package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Marcos", "Jefe", 40000);
        Empleado empleado2 = new Empleado("Rafael", "Vendedor", 40000);
        Empleado empleado3 = new Empleado("Julio", "Cajero", -1200);

        System.out.println("Empleado: " + empleado1.getNombre());
        System.out.println("Cargo: " + empleado1.getCargo());
        System.out.println("Sueldo final: $" + empleado1.getSueldoFinal());
        System.out.println();
        System.out.println("Empleado: " + empleado2.getNombre());
        System.out.println("Cargo: " + empleado2.getCargo());
        System.out.println("Sueldo final: $" + empleado2.getSueldoFinal());
        System.out.println();
        System.out.println("Empleado: " + empleado3.getNombre());
        System.out.println("Cargo: " + empleado3.getCargo());
        System.out.println("Sueldo final: $" + empleado3.getSueldoFinal());
        empleado3.setSueldo(30000);
        empleado3.setNombre("Augusto");
        empleado3.setCargo("Vendedor");
        System.out.println("Se modificó el sueldo base del empleado " + empleado3.getNombre() + " a: $" + empleado3.getSueldo());
    }
}
