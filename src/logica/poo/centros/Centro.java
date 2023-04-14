package logica.poo.centros;

import logica.poo.miembros.Miembro;
import java.util.ArrayList;

public class Centro {

    private static int idCentro;
    private ArrayList<Miembro> miembroCentro;

    public Centro() {
        miembroCentro = new ArrayList<Miembro>() ;
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

    public void agregarMiembro(Miembro m){
        m.toString();
    }

    public String getMiembro(){
        return toString();
    }

    @Override
    public String toString() {
        return "";
    }
}
