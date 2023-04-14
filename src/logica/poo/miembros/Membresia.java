package logica.poo.miembros;

import java.time.LocalDate;

import java.time.temporal.ChronoUnit;

public class Membresia {
    private LocalDate fechaMembresia;
    private int duracion;


    public Membresia (LocalDate fechaMembresia, int duracion){
        this.fechaMembresia = fechaMembresia;
        this.duracion = duracion;
    }

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

    public LocalDate fechaVencimiento(){
        //Aquí va la operacion para obtener la fecha de vencimiento
        long diasSumados = getDuracion();
        LocalDate fechaVencimiento;
        fechaVencimiento = fechaMembresia.plus(diasSumados,ChronoUnit.DAYS) ;
        return fechaVencimiento;
    }
}
