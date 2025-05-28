package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Producto producto1 = new Producto("001", "Hojas A4", 20, 200);

        System.out.println("Productos:");
        System.out.println(producto1.getNombre() + " | Cantidad: " + producto1.getStock() + " | Precio: $" + producto1.getPrecio());
        System.out.println();

        producto1.vender(6);
        producto1.reponer(4);
        System.out.println();

        producto1.setPrecio(250);

        System.out.println("Productos:");
        System.out.println(producto1.getNombre() + " | Cantidad: " + producto1.getStock() + " | Precio: $" + producto1.getPrecio());



    }
}
