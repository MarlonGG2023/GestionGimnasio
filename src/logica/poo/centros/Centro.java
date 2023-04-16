package logica.poo.centros;

import logica.poo.miembros.Miembro;
import java.util.ArrayList;

public class Centro {

    private static int idCentro = 1;
    private int cont;
    private String nombre;
    private String direccion;
    private TipoCentro tipoCentro;
    private double tarifa;
    private static ArrayList<Miembro> miembroCentro;


    public Centro(String nombre, String direccion, TipoCentro tipoCentro, double tarifa) {
        this.cont = getIdCentro();
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCentro = tipoCentro;
        this.tarifa = tarifa;
        this.miembroCentro = new ArrayList<Miembro>();
    }

    public static int getIdCentro() {

        return idCentro++;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoCentro getTipoCentro() {
        return tipoCentro;
    }

    public void setTipoCentro(TipoCentro tipoCentro) {
        this.tipoCentro = tipoCentro;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public ArrayList<Miembro> getMiembroCentro() {
        return miembroCentro;
    }

    public void setMiembroCentro(ArrayList<Miembro> miembroCentro) {
        this.miembroCentro = miembroCentro;
    }

    public void agregarMiembro(Miembro m) {
        miembroCentro.add(m);
    }

    public String getMiembro() {
        StringBuilder sb = new StringBuilder();
        for (Miembro miembro : miembroCentro){

            sb.append("Id del centro de acondicionamiento: " + getIdCentro()).append(", ")
                    .append("nombre del centro de acondicionamiento: " + nombre).append(", ")
                    .append("número del miembro: " + miembro.getNumMiembro()).append(", ")
                    .append("nombre del miembro: " + miembro.getNombre()).append(", ")
                    .append("Apellido del miembro: " + miembro.getApellido()).append(", ")
                    .append("Tipo de miembro: " + miembro);
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "Id del centro = " + cont +
                ", nombre = " + nombre + '\'' +
                ", direccion = ' " + direccion + '\'' +
                ", tipoCentro = " + tipoCentro +
                ", tarifa = " + tarifa;
    }
}
