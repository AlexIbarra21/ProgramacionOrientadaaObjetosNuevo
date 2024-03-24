package Reto8.ui;

import java.util.Scanner;

public class CLI {
    import java.util.Scanner;

    public class DemoJuegosSupermercadoCLI {

        private static final int MAX_ACTIVACIONES = 10;

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Bucle para las activaciones
            for (int i = 0; i < MAX_ACTIVACIONES; i++) {
                // Mostrar menú de juegos
                System.out.println("**Juegos disponibles:**");
                System.out.println("1. Adivina el número");
                System.out.println("2. Encuentra la carita");
                System.out.println("3. Gira una carta");

                // Seleccionar juego
                int opcion = scanner.nextInt();
                scanner.nextLine();

                // Registrar datos del cliente
                System.out.println("Ingrese su nombre:");
                String nombre = scanner.nextLine();
                System.out.println("Ingrese su correo electrónico:");
                String correo = scanner.nextLine();
                System.out.println("Ingrese su teléfono:");
                String telefono = scanner.nextLine();
                System.out.println("Ingrese su fecha de nacimiento (DD/MM/AAAA):");
                String fechaNacimiento = scanner.nextLine();

                // Crear partida
                Partida partida = null;
                switch (opcion) {
                    case 1:
                        partida = new AdivinaElNumero();
                        break;
                    case 2:
                        partida = new EncuentraLaCarita();
                        break;
                    case 3:
                        partida = new GiraUnaCarta();
                        break;
                }

                partida.registrarDatosCliente(nombre, correo, telefono, fechaNacimiento);

                // Jugar partida
                partida.jugar(scanner);

                // Mostrar mensaje de fin de partida
                if (partida.gano()) {
                    System.out.println("¡Felicidades, has ganado!");
                } else {
                    System.out.println("Sigue participando, ¡suerte en la próxima!");
                }
            }
        }
    }

}
