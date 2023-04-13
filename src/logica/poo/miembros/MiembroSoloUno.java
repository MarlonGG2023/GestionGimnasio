package logica.poo.miembros;

import logica.poo.centros.Centro;

public class MiembroSoloUno {
    private Miembro miembro;
    private Centro centro;

    //Primer constructor
    public MiembroSoloUno (Miembro miembro, Centro centro){
        this.miembro = miembro;
        this.centro = centro;
    }

    //Segundo constructor

    //Métodos

    public Centro getCentro(){
        return centro;
    }

    public void setCentro(Centro centro){
        this.centro = centro;
    }


}


