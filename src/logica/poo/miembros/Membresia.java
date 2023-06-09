package logica.poo.miembros;

import java.time.LocalDate;


public class Membresia {

    //Atributos
    private LocalDate fechaMembresia;
    private int duracion;


    //Constructor
    public Membresia (LocalDate fechaMembresia, int duracion){
        this.fechaMembresia = fechaMembresia;
        this.duracion = duracion;
    }

    //Métodos getter y setter
    public LocalDate getFechaMembresia(){

        return fechaMembresia;
    }
    public void setFechaMembresia(LocalDate fechaMembresia){

        this.fechaMembresia = fechaMembresia;
    }

    public int getDuracion(){

        return duracion;
    }
    public void setDuracion(int duracion){

        this.duracion = duracion;
    }

    public LocalDate getFechaVencimiento(){
        //Aquí va la operacion para obtener la fecha de vencimiento
        return fechaMembresia.plusDays(duracion);
    }
}
