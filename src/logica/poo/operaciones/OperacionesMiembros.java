package logica.poo.operaciones;
import logica.poo.miembros.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class OperacionesMiembros {

    private ArrayList<Miembro> miembro;

    public OperacionesMiembros(){
        miembro = new ArrayList<Miembro>();
    }

    public void agregarMiembro(Miembro m){
        this.miembro.add(m);
    }

    public Miembro buscarMiembro(int numMiembro){
        for(Miembro miembro : miembro){
            if(miembro.getNumMiembro() == numMiembro){
                return miembro;
            }
        }
        return null;
    }

    public void listarMiembros(){
        System.out.println(miembro.toString());
    }
}
