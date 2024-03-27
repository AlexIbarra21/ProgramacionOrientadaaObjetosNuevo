package evidencia1.ui;

import java.util.ArrayList;
import java.util.Scanner;

public class CLI {

    // Clase Medicamento
    class Medicamento {
        String nombreQuimico;
        String nombreGenerico;
        String nombreRegistrado;
        double precioPublico;
        double precioVenta;
        String formaFarmaceutica;

        // Constructor de la clase Medicamento
        public Medicamento(String nombreQuimico, String nombreGenerico, String nombreRegistrado, double precioPublico, String formaFarmaceutica) {
            this.nombreQuimico = nombreQuimico;
            this.nombreGenerico = nombreGenerico;
            this.nombreRegistrado = nombreRegistrado;
            this.precioPublico = precioPublico;
            this.formaFarmaceutica = formaFarmaceutica;
            this.precioVenta = calcularPrecioVenta();
        }

        // Método para calcular el precio de venta basado en la forma farmacéutica
        public double calcularPrecioVenta() {
            switch (formaFarmaceutica) {
                case "sólida":
                    return precioPublico * 1.09;
                case "semisólida":
                    return precioPublico * 1.12;
                case "líquida":
                    return precioPublico * 1.13;
                default:
                    return precioPublico;
            }
        }
    }

    public class Main {
        public void main(String[] args) {
            ArrayList<Medicamento> listaMedicamentos = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            String opcion;

            do {
                System.out.println("Ingrese el nombre químico del medicamento:");
                String nombreQuimico = scanner.nextLine();

                System.out.println("Ingrese el nombre genérico del medicamento:");
                String nombreGenerico = scanner.nextLine();

                System.out.println("Ingrese el nombre registrado del medicamento:");
                String nombreRegistrado = scanner.nextLine();

                System.out.println("Ingrese el precio al público del medicamento:");
                double precioPublico = scanner.nextDouble();
                scanner.nextLine();  // Limpiar el buffer

                System.out.println("Ingrese la forma farmacéutica del medicamento (sólida, semisólida, líquida):");
                String formaFarmaceutica = scanner.nextLine();

                // Crear un nuevo objeto Medicamento y añadirlo a la lista
                Medicamento medicamento = new Medicamento(nombreQuimico, nombreGenerico, nombreRegistrado, precioPublico, formaFarmaceutica);
                listaMedicamentos.add(medicamento);

                System.out.println("¿Desea registrar otro medicamento? (sí/no)");
                opcion = scanner.nextLine();
            } while (opcion.equalsIgnoreCase("sí"));

            // Imprimir el reporte
            System.out.println("Reporte de medicamentos registrados:");
            for (Medicamento medicamento : listaMedicamentos) {
                System.out.println("Nombre químico: " + medicamento.nombreQuimico);
                System.out.println("Nombre genérico: " + medicamento.nombreGenerico);
                System.out.println("Nombre registrado: " + medicamento.nombreRegistrado);
                System.out.println("Precio al público: " + medicamento.precioPublico);
                System.out.println("Precio de venta: " + medicamento.precioVenta);
                System.out.println("Forma farmacéutica: " + medicamento.formaFarmaceutica);
                System.out.println("-------------------------");
            }
        }
    }

}
