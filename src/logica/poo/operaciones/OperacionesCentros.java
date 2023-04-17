package logica.poo.operaciones;
import logica.poo.centros.*;
import logica.poo.menu.MenuConsola;
import logica.poo.ui.*;
import java.util.ArrayList;
import java.util.Scanner;


public class OperacionesCentros {

    //Atributos
    private static ArrayList<Centro> c = new ArrayList<Centro>(); //Almacena todos los centros creados en el sistema

    //Metodos
    public static ArrayList<Centro> getC() {
        return c;
    }

    public static void agregar(Centro centro){
        c.add(centro);
        System.out.println("Se ha agregado el centro.");
    }


    public static void listarCentros(){
        //Se usa forEach, permitiendo que una variable del mismo tipo del array copie lo que contiene el array.
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
