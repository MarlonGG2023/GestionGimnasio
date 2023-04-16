package logica.poo.operaciones;
import logica.poo.miembros.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class OperacionesMiembros {

    private static ArrayList<Miembro> miembro = new ArrayList<Miembro>();

    public static void agregarMiembro(Miembro m){
        miembro.add(m);
    }

    public static Miembro buscarMiembro(int numMiembro){
        for(Miembro miembro : miembro){
            if(miembro.getNumMiembro() == numMiembro){
                return miembro;
            }
        }
        return null;
    }

    public static void listarMiembros(){
        System.out.println(miembro.toString());
    }
}
