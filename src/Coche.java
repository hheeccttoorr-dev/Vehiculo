public class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String marca, String modelo, int anio, int numeroPuertas) {
        super(marca, modelo, anio);
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }


}