package logica.poo.menu;
import logica.poo.ui.OpcionMenu;
import java.util.ArrayList;
import java.util.Scanner;
public class MenuConsola {

    private ArrayList<OpcionMenu> om;
    private int opcion;

    public MenuConsola (){

        om = new ArrayList<OpcionMenu>();
    }

    public void anadirOpcion(OpcionMenu op){

        this.om.add(op);
    }

    public void lanzarMenu(){
        //do{
            System.out.println("*** Menu de opciones ***");
            for (int i=0; i < om.size(); i++){
                System.out.println((i+1) + ". " + om.get(i));
            }
            System.out.println((om.size()+1) + ". salir");
            Scanner leer = new Scanner(System.in);
            System.out.println("Indique el número de opción: ");
            opcion = leer.nextInt();

            if (opcion >= 1 && opcion <= om.size()){
                om.get(opcion-1).ejecutar();
            }
        /*}
        while(opcion != om.size()+1);*/


    }
}
