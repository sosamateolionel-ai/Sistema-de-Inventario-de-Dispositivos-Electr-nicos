//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Smartphone celular = new Smartphone("Samsung", "Galaxy S24", 950000, 50, 256);
    Laptop notebook = new Laptop("Lenovo", "ThinkPad E14", 1200000, "Intel Core i7", 16);

    Dispositivo[] inventario = { celular, notebook };

    System.out.println("=== INVENTARIO DE LA TIENDA ===\n");
    for (Dispositivo d : inventario) {
        d.mostrarInformacion();
        System.out.println();
    }

}
