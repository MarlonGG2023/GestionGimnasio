package logica.poo.menu;
import logica.poo.ui.OpcionMenu;
import java.util.ArrayList;
import java.util.Scanner;
public class MenuConsola {

    private ArrayList<OpcionMenu> om;

    public MenuConsola (){
        om = new ArrayList<OpcionMenu>();
    }

    public void anadirOpcion(OpcionMenu op){

        this.om.add(op);
    }

    public void lanzarMenu(){
        System.out.println("----MENÚ----");
        for (int i=0; i < om.toArray().length; i++){
            System.out.println((i+1) + ". " + om.get(i));
        }
        System.out.println("0. Salir");
    }
}
