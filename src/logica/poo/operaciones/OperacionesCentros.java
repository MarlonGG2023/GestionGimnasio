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
        Scanner sc = new Scanner(System.in);
        /*MenuConsola menu = new MenuConsola();
        OpcionMenuCrearCentro omcc = new OpcionMenuCrearCentro();
        System.out.println("Desea continuar operando en crear centro(si=1/no=0): ");
        int resp = sc.nextInt();
        if(resp == 1){
            omcc.ejecutar();
        }
        else{
            menu.anadirOpcion(new OpcionMenuCrearCentro());
            menu.anadirOpcion(new OpcionMenuListarCentros());
            menu.anadirOpcion(new OpcionMenuCrearMiembro());
            menu.anadirOpcion(new OpcionMenuListarMiembros());
            menu.anadirOpcion(new OpcionMenuMiembrosCentro());
            menu.lanzarMenu();
        }*/

    }

    public static void listarCentros(){
        for(Centro centro:c){
            System.out.println("\n" + centro);
        }
    }


    public static Centro buscarCentro(int idCentro){
        for(Centro centro : c){
            if(centro.getIdCentro() == idCentro){
                return centro;
            }
        }
        return null;
    }
}
