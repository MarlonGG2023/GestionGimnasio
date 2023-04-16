package logica.poo.miembros;

import logica.poo.centros.Centro;

import java.time.LocalDate;

public class MiembroSoloUno extends Miembro {
    private Centro centro;

    //segundo constructor
    public MiembroSoloUno (int id, String nombre, String apellido, String correo,
                           LocalDate fechaInicioGim, LocalDate fechaInicioMem, int duracionMem, LocalDate fechaFinMem,
                           double deudaMiembro){
        super(id, nombre, apellido, correo, fechaInicioGim, fechaInicioMem, duracionMem, fechaFinMem, deudaMiembro);

    }


    //Primer constructor
    public MiembroSoloUno (int id, String nombre, String apellido, String correo,
                           LocalDate fechaInicioGim, LocalDate fechaInicioMem, int duracionMem, LocalDate fechaFinMem,
                           double deudaMiembro, Centro centro){
       this(id, nombre, apellido, correo, fechaInicioGim, fechaInicioMem, duracionMem, fechaFinMem, deudaMiembro);
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

        return "El nombre del centro de acondicionamiento es " + centro.getNombre() + " y su ID es " + centro.getCont() + "Mi id es "
                + getId() + ", mi número de miembro es " + getNumMiembro() + ". Me llamo " + getNombre()  + " " + getApellido() +  ",  mi correo es " +
                getCorreo() + ", inicie en el  GYM el " + getFechaInicioGim() + " y obtuve mi membresia el " + getFechaInicioMem() + ", la cual tiene una duración de " +
                getDuracionMem() + ", es decir, se acaba el " + getFechaFinMem() + ". Mi deuda con el GYM es de " + getDeudaMiembro();
    }


}


