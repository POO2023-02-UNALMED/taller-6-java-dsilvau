package vehiculo;
import java.util.ArrayList;
import java.util.Collections;

public class Pais {
	private String nombre;
    private static ArrayList<Pais> paises= new ArrayList<Pais>();
    protected int cantidadVendidos = 0;

    public Pais(String nombre){
        this.nombre= nombre;
        paises.add(this);
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public static ArrayList<Pais> getPaises(){
        return paises;
    }

    public int getCantidadVendidos(){
        return cantidadVendidos;
    }

    public static Pais paisMasVendedor(){
        return Collections.max(paises, (p1,p2)->p1.cantidadVendidos-p2.cantidadVendidos);
    }

}
