public class TestVehiculo {
    static void main() {
        Coche coche = new Coche("BMW" ,"M4", 2026, 3);
        Moto moto = new Moto ("BMW", "S1000RR", 2025, 999);

        coche.mostrarInformacion();
        System.out.println("--------------");
        System.out.println(coche.descripcionCorta());
        System.out.println("--------------");
        moto.mostrarInformacion();
        System.out.println("--------------");
        System.out.println(moto.descripcionCorta());
        System.out.println("--------------");



    }
}
