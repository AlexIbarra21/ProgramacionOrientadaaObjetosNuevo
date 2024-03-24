package Reto8.process;

import java.util.Scanner;

public class Partida {
    public abstract class Partida {

        protected String nombre;
        protected boolean gano;
        protected String nombreCliente;
        protected String correoCliente;
        protected String telefonoCliente;
        protected String fechaNacimientoCliente;

        public Partida(String nombre) {
            this.nombre = nombre;
            this.gano = false;
        }

        public abstract void jugar(Scanner scanner);

        public void registrarDatosCliente(String nombre, String correo, String telefono, String fechaNacimiento) {
            this.nombreCliente = nombre;
            this.correoCliente = correo;
            this.telefonoCliente = telefono;
            this.fechaNacimientoCliente = fechaNacimiento;
        }

        public String getNombre() {
            return nombre;
        }

        public boolean gano() {
            return gano;
        }

        public String getNombreCliente() {
            return nombreCliente;
        }

        public String getCorreoCliente() {
            return correoCliente;
        }

        public String getTelefonoCliente() {
            return telefonoCliente;
        }

        public String getFechaNacimientoCliente() {
            return fechaNacimientoCliente;
        }

        public abstract String getTipoJuego();
    }

}
