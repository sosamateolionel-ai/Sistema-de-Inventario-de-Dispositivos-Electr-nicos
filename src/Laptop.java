public class Laptop extends Dispositivo {
    private String procesador;
    private int memoriaRamGB;

    public Laptop(String marca, String modelo, double precioBase,
                  String procesador, int memoriaRamGB) {
        super(marca, modelo, precioBase);
        this.procesador = procesador;
        this.memoriaRamGB = memoriaRamGB;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- FICHA TÉCNICA: LAPTOP ---");
        super.mostrarInformacion();
        System.out.println("Procesador: " + procesador);
        System.out.println("Memoria RAM: " + memoriaRamGB + " GB");
    }
}