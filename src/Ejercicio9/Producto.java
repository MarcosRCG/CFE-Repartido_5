package Ejercicio9;

public class Producto {
    private String codigo;
    private String nombre;
    private int stock;
    private double precio;

    public Producto(String codigo, String nombre, int stock, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        if (stock>=0){
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
            this.stock = 0;
        }
        if (precio > 0){
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor que 0.");
            this.precio = 1.0;
        }
    }

    // Getters
    public String getNombre(){
        return nombre;
    }
    public int getStock(){
        return stock;
    }
    public double getPrecio(){
        return precio;
    }

    // Setters
    public void setPrecio(double nuevoPrecio){
        if (precio > 0){
            this.precio = nuevoPrecio;
            System.out.println("Se ha cambiado el precio a: $" + nuevoPrecio);
        } else {
            System.out.println("El precio debe ser mayor que 0.");
        }
    }

    public void vender(int cantidad){
        if (cantidad > 0 && cantidad <= stock){
            stock -= cantidad;
            System.out.println("Venta realizada. Nueva cantidad en stock: " + stock);
        } else {
            System.out.println("Stock insuficiente. No se puede realizar la venta.");
        }
    }

    public void reponer(int cantidad){
        if(cantidad > 0){
            stock += cantidad;
            System.out.println("Repuesto realizado. Nueva cantidad en stock: " + stock);
        } else {
            System.out.println("La cantidad debe ser mayor a 0.");
        }
    }
}
