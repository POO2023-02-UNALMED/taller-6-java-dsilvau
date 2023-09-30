package vehiculo;

public class Camion extends Vehiculo {
    private int ejes;
    private static int cantidadCamiones= 0;

    public Camion(String placa, String nombre, int precio, float peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes= ejes;
        cantidadCamiones++;
    }

    public int getEjes(){
        return ejes;
    }
    public void setEjes(int ejes){
        this.ejes= ejes;
    }

    public static int getCantidadCamiones(){
        return cantidadCamiones;
    }

}
