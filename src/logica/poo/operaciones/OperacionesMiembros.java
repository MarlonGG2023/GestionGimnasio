package logica.poo.operaciones;
import logica.poo.miembros.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class OperacionesMiembros {

    //Atributos
    private static ArrayList<Miembro> miembro = new ArrayList<Miembro>(); //Almacena todos los miembros creados en el sistema


    //Métodos
    public static void agregarMiembro(Miembro m){
        miembro.add(m);
    }

    public static Miembro buscarMiembro(int numMiembro){
        for(Miembro miembro : miembro){
            if(miembro.getContM() == numMiembro){
                return miembro;
            }
        }
        return null;
    }

    public static void listarMiembros(){
        for(Miembro miembro1 : miembro){
            System.out.println("\n" + miembro1);
        }

    }
}
