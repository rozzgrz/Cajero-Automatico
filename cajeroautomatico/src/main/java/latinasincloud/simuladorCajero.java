package latinasincloud;
import java.util.Scanner;

public class simuladorCajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 12000.0;
        int opcion;
        boolean continuar = true;

        System.out.println("Bienvenido al Cajero Automatico");

        while (continuar) {
            System.out.println("\n1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;

                case 2:
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double montoDeposito = scanner.nextDouble();
                    if (montoDeposito > 0) {
                        saldo += montoDeposito;
                        System.out.println("Deposito realizado correctamente. Nuevo saldo: $" + saldo);
                    } else {
                        System.out.println("La cantidad debe ser mayor a cero.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double montoRetiro = scanner.nextDouble();
                    if (montoRetiro > 0 && montoRetiro <= saldo) {
                        saldo -= montoRetiro;
                        System.out.println("Retiro realizado exitosamente. Saldo restante: $" + saldo);
                    } else if (montoRetiro > saldo) {
                        System.out.println("Saldo insuficiente para realizar esta operacion.");
                    } else {
                        System.out.println("La cantidad debe ser mayor a cero.");
                    }
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Gracias por utilizar nuestro cajero automatico.");
                    break;

                default:
                    System.out.println("Opcion invalida. Por favor seleccione una opcion valida.");
                    break;
            }
        }

        scanner.close();
    }
}