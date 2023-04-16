package logica.poo.miembros;

import logica.poo.centros.Centro;

import java.time.LocalDate;

public class MiembroSoloUno extends Miembro {
    private Centro centro;
    private Membresia membresia;

    //segundo constructor
    public MiembroSoloUno (int id, String nombre, String apellido, String correo,
                           LocalDate fechaInicioGim, LocalDate fechaMembresia, int duracion){
        super(id, nombre, apellido, correo, fechaInicioGim, fechaMembresia, duracion);

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

    public LocalDate getFechaInicioMem(){
        return getFechaInicioMem();
    }

    public int getDuracion(){

        return getDuracion();
    }

    @Override
    public String toString() {

        return "El nombre del centro de acondicionamiento es " + centro.getNombre() + " y su ID es " + centro.getCont() + "Mi id es "
                + getId() + ", mi número de miembro es " + getNumMiembro() + ". Me llamo " + getNombre()  + " " + getApellido() +  ",  mi correo es " +
                getCorreo() + ", inicie en el  GYM el " + getFechaInicioGim() + " y obtuve mi membresia el " + getFechaMembresia() + ", la cual tiene una duración de " +
                getDuracion() + ", es decir, se acaba el " + getFechaVencimiento();
    }


}


