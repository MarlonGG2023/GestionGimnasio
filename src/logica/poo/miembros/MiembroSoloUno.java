package logica.poo.miembros;

import logica.poo.centros.Centro;

import java.time.LocalDate;

public class MiembroSoloUno extends Miembro {
    private Centro centro;

    //segundo constructor
    public MiembroSoloUno (int id, String nombre, String apellido, String correo,
                           LocalDate fechaInicioGim, LocalDate fechaMembresia, int duracion){
        super(id, nombre, apellido, correo, fechaInicioGim, fechaMembresia, duracion, "Miembro Solo-Uno");

    }


    //Primer constructor
    public MiembroSoloUno (int id, String nombre, String apellido, String correo,
                           LocalDate fechaInicioGim, LocalDate fechaMembresia, int duracion, Centro centro){
       this(id, nombre, apellido, correo, fechaInicioGim, fechaMembresia, duracion);
       this.centro = centro;
       centro.agregarMiembro(this);
    }

    //Métodos

    public Centro getCentro(){
        return centro;
    }

    public void setCentro(Centro c){
        this.centro = c;
    }

    @Override
    public String toString() {

        return "\nNombre del centro de acondicionamiento: " + centro.getNombre() +
                "\nID del centro de acondicionamiento: " + centro.getCont() +
                "\nID miembro: " + getId() +
                "\nNúmero de miembro: " + getContM() +
                "\nNombre del miembro: " + getNombre()  + " " + getApellido() +
                "\nCorreo del mimebro: " + getCorreo() +
                "\nFecha de inicio GYM: " + getFechaInicioGim() +
                "\nFecha de inicio de membresia: " + getFechaMembresia() +
                "\nDuración de la membresia: " + getDuracion() +
                "\nFecha de vencimiento de la membresia: " + getFechaVencimiento();
    }


}


