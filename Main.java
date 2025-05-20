public class Main {
    public static void main(String[] args) {
        // Crear objetos Computadora
        Computadora laptop = new Computadora("Dell", "Windows 11", 16, 1200.99, false);
        Computadora desktop = new Computadora("Apple", "macOS", 32, 2499.99, true);

        // Usar los métodos
        laptop.encender();
        desktop.apagar();

        laptop.instalarPrograma("Photoshop");
        desktop.mostrarEspecificaciones();

        // Pasar un tiempo...
        laptop.actualizarSistema();
        desktop.encender();
    }
}