package logica.poo.centros;

import logica.poo.miembros.Miembro;
import java.util.ArrayList;

public class Centro {

    private static int idCentro;
    private String nombre;
    private String direccion;
    private TipoCentro tipoCentro;
    private double tarifa;
    private ArrayList<Miembro> miembroCentro;

    public Centro() {

        miembroCentro = new ArrayList<Miembro>();
    }

    public Centro(String nombre, String direccion, TipoCentro tipoCentro, double tarifa) {
        getIdCentro();
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCentro = tipoCentro;
        this.tarifa = tarifa;
    }

    public static int getIdCentro() {

        return idCentro++;
    }

    public ArrayList<Miembro> getMiembroCentro() {
        return miembroCentro;
    }

    public void setMiembroCentro(ArrayList<Miembro> miembroCentro) {
        this.miembroCentro = miembroCentro;
    }

    public void agregarMiembro(Miembro m) {
        m.toString();
    }

    public String getMiembro() {
        return toString();
    }

    @Override
    public String toString() {
        return "Centro{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipoCentro=" + tipoCentro +
                ", tarifa=" + tarifa +
                '}';
    }
}
