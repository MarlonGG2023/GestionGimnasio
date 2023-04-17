package logica.poo.miembros;

import logica.poo.centros.*;
import logica.poo.operaciones.OperacionesCentros;

import java.time.LocalDate;
import java.util.ArrayList;

public class MultiClub extends Miembro {

    //Atributos
    private Membresia membresia;
    private Centro centros;
    private int puntos;


    //Constructor
    public MultiClub (int id, String nombre, String apellido, String correo,
                      LocalDate fechaInicioGim, LocalDate fechaMembresia, int duracion){
            super(id, nombre, apellido, correo, fechaInicioGim, fechaMembresia, duracion, "Miembro MultiClub");

        setCentros();
        sumarPuntos();
    }

    //Métodos
    public int getPuntos(){
        return puntos;
    }

    public void sumarPuntos(){
        puntos += 100;
    }
    public void setCentros(){
    ArrayList <Centro> c = OperacionesCentros.getC();
        for (int i = 0; i < c.size();i++){
            c.get(i).agregarMiembro(this);
        }
    }
}
