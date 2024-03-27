package Reto4.data;
import java.util.ArrayList;
import java.util.Scanner;

    public class RegistroVentasAutobus {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> pasajeros = new ArrayList<>();
            double costoBoleto = 1250.50;
            double totalVentas = 0;

            System.out.println("--- Sistema de registro de ventas ---");
            char opcion;

            do {
                System.out.println("A. Realizar venta de boleto");
                System.out.println("B. Mostrar datos de la lista de ventas");
                System.out.println("S. Finalizar programa");
                System.out.print("Elegir opción: ");
                opcion = scanner.next().charAt(0);

                switch (opcion) {
                    case 'A':
                        System.out.print("Ingresar nombre del comprador: ");
                        String comprador = scanner.next();
                        System.out.print("Ingresar cantidad de pasajeros adicionales: ");
                        int cantidadPasajeros = scanner.nextInt();

                        for (int i = 1; i <= cantidadPasajeros; i++) {
                            System.out.print("Ingresar nombre del pasajero adicional " + i + ": ");
                            String pasajeroAdicional = scanner.next();
                            pasajeros.add(pasajeroAdicional);
                        }

                        int totalPasajeros = cantidadPasajeros + 1;
                        double importeVenta = totalPasajeros * costoBoleto;
                        totalVentas += importeVenta;

                        System.out.println("\n--------- Ticket de venta ----------");
                        System.out.println("Cantidad de boletos: " + totalPasajeros);
                        System.out.println("Importe de venta: $" + importeVenta + " MXN");
                        System.out.println("Nombre del comprador: " + comprador);
                        System.out.println("Pasajeros adicionales: " + cantidadPasajeros);
                        System.out.println("--------------------------------------\n");
                        break;

                    case 'B':
                        System.out.println("\n--------- Lista de pasajeros ----------");
                        System.out.println("Pasajero 1 (comprador): " + pasajeros.get(0));
                        for (int i = 1; i < pasajeros.size(); i++) {
                            System.out.println("Pasajero " + (i + 1) + ": " + pasajeros.get(i));
                        }
                        System.out.println("Total de pasajeros: " + totalPasajeros);
                        System.out.println("Monto total de las ventas: $" + totalVentas + " MXN");
                        System.out.println("--------------------------------------\n");
                        break;

                    case 'S':
                        System.out.println("\n------ Fin del programa ------");
                        break;

                    default:
                        System.out.println("Opción no válida. Inténtalo nuevamente.");
                }
            } while (opcion != 'S');

            scanner.close();
        }
    }

}
