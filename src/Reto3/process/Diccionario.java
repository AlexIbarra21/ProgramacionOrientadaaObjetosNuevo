package Reto3.process;

import java.util.Scanner;

public class Diccionario {

    import java.util.Scanner;

    public class Diccionario {
        String[] palabras = {"palabra1", "palabra2", "palabra3", "palabra4", "palabra5",
                "palabra6", "palabra7", "palabra8", "palabra9", "palabra10"};
        String[] significados = {"significado1", "significado2", "significado3",
                "significado4","significado5","significado6",
                "significado7","significado8","significado9",
                "significado10"};

        public void main(String[] args) {
            Diccionario diccionario = new Diccionario();
            Scanner scanner = new Scanner(System.in);
            char opcion;

            do {
                System.out.println("----- Diccionario -----");
                System.out.println("A. Listar palabras del diccionario");
                System.out.println("B. Buscar palabra en el diccionario");
                System.out.println("C. Detalle del diccionario");
                System.out.println("S. Finalizar programa");
                System.out.print("Elegir opción: ");
                opcion = scanner.next().charAt(0);

                switch (opcion) {
                    case 'A':
                        diccionario.listarPalabras();
                        break;
                    case 'B':
                        System.out.print("Palabra a mostrar significado: ");
                        String palabra = scanner.next();
                        diccionario.buscarPalabras(palabra);
                        break;
                    case 'C':
                        diccionario.detalleDiccionario();
                        break;
                    case 'S':
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } while (opcion != 'S');
        }

        void listarPalabras() {
            for (String palabra : palabras) {
                System.out.println(palabra);
            }
        }

        void buscarPalabras(String palabra) {
            int index = -1;
            for (int i = 0; i < palabras.length; i++) {
                if (palabra.equals(palabras[i])) {
                    index = i;
                    break;
                }
            }

            if (index != -1) {
                System.out.println(significados[index]);
            } else {
                System.out.println("La palabra no existe en el diccionario.");
            }
        }

        void detalleDiccionario() {
            System.out.println("Cantidad de palabras en el diccionario: " + palabras.length);
            for (int i = 0; i < palabras.length; i++) {
                System.out.println("Palabra: " + palabras[i] + ", Longitud: " + palabras[i].length() +
                        ", Significado: " + significados[i] + ", Longitud del significado: " + significados[i].length());
            }
        }
    }
