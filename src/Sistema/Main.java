package Sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion;

        do {
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    agregarCuentaAhorros();
                    break;
                case 2:
                    agregarCuentaCorriente();
                case 3:
                    mostrarCuentas();
                    break;
                case 4:
                    System.out.println("saliendo del programa...");
                    break;
                default:
                    System.out.println("opcion no valida. Intentelo de nuevo");

            }
        } while (opcion != 4);

    }

    private static void mostrarMenu() {
        System.out.println("Menu del banco: ");
        System.out.println("1. Agregar cuenta de ahorros");
        System.out.println("2. Agregar cuenta corriente");
        System.out.println("3. Mostrar cuentas");
        System.out.println("4. Salir");
        System.out.println("Selecciona una opcion");

    }

    private static void agregarCuentaAhorros() {

        System.out.println("Titular: ");
        String titular = entrada.nextLine();
        System.out.println("Saldo inicial: ");
        double saldo = entrada.nextDouble();
        System.out.println("Tasa de interes: ");
        double tasaInteres = entrada.nextDouble();
        System.out.println("Dinero a Depositar");
        double depositar = entrada.nextDouble();
        System.out.println("Dinero a Retirar");
        double retirar = entrada.nextDouble();

        entrada.nextLine();

        //creamos objeto
        CuentaAhorros cuentaAhorros = new CuentaAhorros(titular, saldo, tasaInteres, depositar, retirar);
        cuentas.add(cuentaAhorros);
        System.out.println("Tu cuenta de ahorro fue creada exitosamente :D");

    }

    private static void agregarCuentaCorriente() {

        System.out.println("Titular: ");
        String titular = entrada.nextLine();
        System.out.println("Saldo inicial: ");
        double saldo = entrada.nextDouble();
        System.out.println("Limite de sobregiro: ");
        double sobregiro = entrada.nextDouble();
        System.out.println("Ingrese valor a retirar: ");
        double retirar = entrada.nextDouble();
        entrada.nextLine();

        //creamos objeto
        CuentaCorriente cuentaCorriente = new CuentaCorriente(titular, saldo, sobregiro, retirar);
        cuentas.add(cuentaCorriente);
        System.out.println("Tu cuenta Corriente fue creada exitosamente :D");

    }

    private static void mostrarCuentas() {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuenta registradas");
        } else {
            for (CuentaBancaria cuenta : cuentas) {
                cuenta.mostrarDetalles();
            }
        }
    }
}
