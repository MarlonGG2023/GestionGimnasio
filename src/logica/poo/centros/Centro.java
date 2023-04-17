package logica.poo.centros;

import logica.poo.miembros.Miembro;
import java.util.ArrayList;

public class Centro {

    //Atributos de la clase Centro
    private static int idCentro = 1; //Atributo para generar id de manera automatica
    private int cont;
    private String nombre;
    private String direccion;
    private TipoCentro tipoCentro;
    private double tarifa;
    private static ArrayList<Miembro> miembroCentro; //Lista de arreglos para almacenar los miembros de un centro


    //Constructor de la clase Centro
    public Centro(String nombre, String direccion, TipoCentro tipoCentro, double tarifa) {
        this.cont = getIdCentro();
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoCentro = tipoCentro;
        this.tarifa = tarifa;
        this.miembroCentro = new ArrayList<Miembro>();
    }

    //Metodos Getter y Setter
    public static int getIdCentro() {

        return idCentro++;
    }

    public int getCont() {
        return cont;
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


    //Metodos de la clase
    public void agregarMiembro(Miembro m) {
        miembroCentro.add(m);
    }

    //Metodo que concatena multiples lineas
    public String getMiembro() {
        StringBuilder sb = new StringBuilder();
        for (Miembro miembro : miembroCentro){

            sb.append("\nId del centro de acondicionamiento: " + this.cont)
                    .append("\nnombre del centro de acondicionamiento: " + this.nombre)
                    .append("\nnúmero del miembro: " + miembro.getContM())
                    .append("\nnombre del miembro: " + miembro.getNombre())
                    .append("\nApellido del miembro: " + miembro.getApellido())
                    .append("\nTipo de miembro: " + miembro.getTipoClub() + "\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "\nId del centro = " + cont +
                "\nNombre = " + nombre +
                "\nDireccion = " + direccion +
                "\nTipoCentro = " + tipoCentro +
                "\nTarifa = " + tarifa;
    }
}
