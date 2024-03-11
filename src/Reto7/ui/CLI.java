package Reto7.ui;

public class CLI {
    public class Cafetera {
        private int cafe;
        private int agua;
        private int azucar;
        private double ventas;
        private int[] tazasVendidas = new int[3];

        public Cafetera(int cafe, int agua, int azucar) {
            this.cafe = cafe;
            this.agua = agua;
            this.azucar = azucar;
            this.ventas = 0;
        }

        public void servirCafe(String tipo, boolean azucar, int cantidad) {
            int cafeNecesario = 0;
            int aguaNecesaria = 0;
            int azucarNecesaria = 0;
            double precio = 0;

            switch (tipo) {
                case "pequeño":
                    cafeNecesario = 10 * cantidad;
                    aguaNecesaria = 120 * cantidad;
                    azucarNecesaria = azucar ? 5 * cantidad : 0;
                    precio = azucar ? 10.50 : 14.50;
                    break;
                case "mediano":
                    cafeNecesario = 20 * cantidad;
                    aguaNecesaria = 220 * cantidad;
                    azucarNecesaria = azucar ? 10 * cantidad : 0;
                    precio = azucar ? 24.50 : 34.50;
                    break;
                case "grande":
                    cafeNecesario = 30 * cantidad;
                    aguaNecesaria = 320 * cantidad;
                    azucarNecesaria = azucar ? 15 * cantidad : 0;
                    precio = azucar ? 34.50 : 39.50;
                    break;
            }

            if (this.cafe >= cafeNecesario && this.agua >= aguaNecesaria && this.azucar >= azucarNecesaria) {
                this.cafe -= cafeNecesario;
                this.agua -= aguaNecesaria;
                this.azucar -= azucarNecesaria;
                this.ventas += precio * cantidad;
                switch (tipo) {
                    case "pequeño":
                        this.tazasVendidas[0] += cantidad;
                        break;
                    case "mediano":
                        this.tazasVendidas[1] += cantidad;
                        break;
                    case "grande":
                        this.tazasVendidas[2] += cantidad;
                        break;
                }
                System.out.println("Se sirvieron " + cantidad + " tazas de café " + tipo + ".");
            } else {
                System.out.println("No hay suficientes insumos para servir el café.");
            }
        }

        public void agregarCafe(int cantidad) {
            if (this.cafe + cantidad <= 2000) {
                this.cafe += cantidad;
                System.out.println("Se agregaron " + cantidad + " gramos de café.");
            } else {
                System.out.println("No hay suficiente espacio para agregar esa cantidad de café.");
            }
        }

        public void vaciarCafetera() {
            this.cafe = 0;
            this.agua = 0;
            this.azucar = 0;
            System.out.println("La cafetera ha sido vaciada.");
        }

        public void mostrarInsumos() {
            System.out.println("Café: " + this.cafe + "g\nAgua: " + this.agua + "ml\nAzúcar: " + this.azucar + "g");
        }

        public void reporte() {
            System.out.println("Importe total de venta: $" + this.ventas);
            System.out.println("Total de tazas vendidas: " + (this.tazasVendidas[0] + this.tazasVendidas[1] + this.tazasVendidas[2]));
            System.out.println("Desglose detallado de las tazas vendidas:");
            System.out.println("Pequeño: " + this.tazasVendidas[0]);
            System.out.println("Mediano: " + this.tazasVendidas[1]);
            System.out.println("Grande: " + this.tazasVendidas[2]);
        }
    }

    public class Main {
        public void main(String[] args) {
            Cafetera cafetera = new Cafetera(2000, 3000, 2000);
            cafetera.servirCafe("pequeño", true, 3);
            cafetera.servirCafe("mediano", false, 2);
            cafetera.agregarCafe(200);
            cafetera.mostrarInsumos();
            cafetera.vaciarCafetera();
            cafetera.mostrarInsumos();
            cafetera.reporte();
        }
    }
}
