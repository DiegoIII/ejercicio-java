public class Computadora {
    // Atributos
    String marca;
    String sistemaOperativo;
    int ramGB;
    double precio;
    boolean estaEncendida;

    // Constructor
    public Computadora(String marca, String sistemaOperativo, int ramGB, double precio, boolean estaEncendida) {
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.ramGB = ramGB;
        this.precio = precio;
        this.estaEncendida = estaEncendida;
    }

    // Métodos
    public void encender() {
        if (!estaEncendida) {
            estaEncendida = true;
            System.out.println(marca + " se está encendiendo...");
        } else {
            System.out.println(marca + " ya está encendida");
        }
    }

    public void apagar() {
        if (estaEncendida) {
            estaEncendida = false;
            System.out.println(marca + " se está apagando...");
        } else {
            System.out.println(marca + " ya está apagada");
        }
    }

    public void instalarPrograma(String nombrePrograma) {
        System.out.println("Instalando " + nombrePrograma + " en " + marca);
    }

    public void mostrarEspecificaciones() {
        System.out.println("Marca: " + marca);
        System.out.println("Sistema Operativo: " + sistemaOperativo);
        System.out.println("RAM: " + ramGB + "GB");
        System.out.println("Precio: $" + precio);
    }

    public void actualizarSistema() {
        System.out.println(marca + " está actualizando " + sistemaOperativo + "...");
    }
}