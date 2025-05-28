package Ejercicio8;

public class Empleado {
    private String nombre;
    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        if (sueldo < 0){
            System.out.println("El sueldo base no puede ser negativo.");
            this.sueldo = 0.0;
        } else {
            this.sueldo = sueldo;
        }
    }

    // Getters
    public String getNombre(){
        return nombre;
    }
    public String getCargo(){
        return cargo;
    }
    public double getSueldo(){
        return sueldo;
    }
    public double getSueldoFinal(){
        if (cargo.equals("Jefe")){
            return sueldo*1.20;
        } else {
            return sueldo;
        }
    }

    // Setters
    public void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public void setCargo(String nuevoCargo){
        this.cargo = nuevoCargo;
    }
    public void setSueldo(float nuevoSueldo){
        this.sueldo = nuevoSueldo;
    }


}
