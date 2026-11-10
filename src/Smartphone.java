public class Smartphone extends Dispositivo {
    private int megapixelesCamara;
    private int almacenamientoGB;

    public Smartphone(String marca, String modelo, double precioBase,
                      int megapixelesCamara, int almacenamientoGB) {
        super(marca, modelo, precioBase);
        this.megapixelesCamara = megapixelesCamara;
        this.almacenamientoGB = almacenamientoGB;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- FICHA TÉCNICA: SMARTPHONE ---");
        super.mostrarInformacion();
        System.out.println("Cámara: " + megapixelesCamara + " MP");
        System.out.println("Almacenamiento: " + almacenamientoGB + " GB");
    }
}