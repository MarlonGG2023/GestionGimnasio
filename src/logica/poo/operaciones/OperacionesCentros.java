package logica.poo.operaciones;
import logica.poo.centros.*;
import logica.poo.menu.MenuConsola;
import logica.poo.ui.*;
import java.util.ArrayList;
import java.util.Scanner;


public class OperacionesCentros {

    private static ArrayList<Centro> c = new ArrayList<Centro>();

    public static ArrayList<Centro> getC() {
        return c;
    }

    public static void agregar(Centro centro){
        c.add(centro);
        System.out.println("Se ha agregado el centro.");
    }

    public static void listarCentros(){
        for(Centro centro:c){
            System.out.println("\n" + centro);
        }
    }


    public static Centro buscarCentro(int cont){
        for(Centro centro : c){
            if(centro.getCont() == cont){
                return centro;
            }
        }
        return null;
    }
}
