package edu.carlos_castillo.reto1.ui;

import java.util.Scanner;

public class CLI {
    public static void showMenu (){
        public static void main(String[]Object args;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Seleccione una opción: \nA. Cálculo de masa corporal (índice de masa corporal) \nB. Cálculo de masa corporal magra \nC. Cálculo de metabolismo basal (gasto energético basal)");
            String opcion = scanner.nextLine();

            System.out.println("Ingrese el peso en kg:");
            double peso = scanner.nextDouble();

            System.out.println("Ingrese la estatura en cm:");
            double estatura = scanner.nextDouble();

            switch (opcion.toUpperCase()) {
                case "A":
                    double imc = peso / Math.pow(estatura / 100, 2);
                    System.out.println("El índice de masa corporal (IMC) es: " + imc);
                    break;
                case "B":
                    System.out.println("Ingrese el sexo del paciente (M para masculino, F para femenino):");
                    char sexo = scanner.next().charAt(0);
                    double masaCorporalMagra;
                    if (sexo == 'M') {
                        masaCorporalMagra = (1.10 * peso) - 128 * Math.pow(peso / Math.pow(estatura, 2), 2);
                    } else {
                        masaCorporalMagra = (1.07 * peso) - 148 * Math.pow(peso / Math.pow(estatura, 2), 2);
                    }
                    System.out.println("La masa corporal magra es: " + masaCorporalMagra);
                    break;
                case "C":
                    System.out.println("Ingrese la edad del paciente:");
                    int edad = scanner.nextInt();
                    System.out.println("Ingrese el sexo del paciente (M para masculino, F para femenino):");
                    sexo = scanner.next().charAt(0);
                    double geb;
                    if (sexo == 'M') {
                        geb = 66.5 + (13.75 * peso) + (5.003 * estatura) - (6.775 * edad);
                    } else {
                        geb = 655.1 + (9.563 * peso) + (1.85 * estatura) - (4.676 * edad);
                    }
                    System.out.println("El gasto energético basal (GEB) es: " + geb);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
            scanner.close();
        }
    }
    }
}
