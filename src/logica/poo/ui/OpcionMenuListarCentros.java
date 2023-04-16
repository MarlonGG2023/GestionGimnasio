package logica.poo.ui;
import logica.poo.centros.*;
import logica.poo.operaciones.*;

public class OpcionMenuListarCentros extends OpcionMenu{

    @Override
    public void ejecutar() {

        OperacionesCentros.listarCentros();
        //System.out.println("Crack");
    }

    @Override
    public String toString() {
        return "Listar centros.";
    }
}
