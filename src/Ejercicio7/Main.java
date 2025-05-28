package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("001122", "Marcos");

        System.out.println("Número de cuenta: " + cuenta1.getNumero());
        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Saldo: " + cuenta1.getSaldo());

        cuenta1.depositar(120000);
        cuenta1.retirar(20000);
    }
}
