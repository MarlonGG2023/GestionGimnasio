package logica.poo.miembros;
import logica.poo.centros.*;
public class MultiClub {
    private Miembro miembro;
    private Centro centros;
    private int puntos;


    public MultiClub (Miembro miembro, Centro centros, int puntos){
        this.miembro = miembro;
        this.centros = centros;
        this.puntos = puntos;
    }

    public int getPuntos(){
        return puntos;
    }

    public void sumarPuntos(){
        return;
    }
    public void setCentros(Centro centros){
        this.centros = centros;
    }
}
