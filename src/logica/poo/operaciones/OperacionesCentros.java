package logica.poo.operaciones;
import logica.poo.centros.*;
import logica.poo.menu.MenuConsola;
import logica.poo.ui.*;
import java.util.ArrayList;
import java.util.Scanner;


public class OperacionesCentros {

    private ArrayList<Centro> centro;

    public OperacionesCentros(){
        centro = new ArrayList<Centro>();
    }
    public void agregar(Centro centro){
        this.centro.add(centro);
        System.out.println("Se ha agregado el centro.");
        Scanner sc = new Scanner(System.in);
        MenuConsola menu = new MenuConsola();
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
        }

    }
    public void listarCentros(){
        for (int i = 0; i <= centro.size(); i++){
            System.out.println(getCentro().toString());
        }
    }
    public ArrayList<Centro> getCentro() {
        return centro;
    }

    public Centro buscarCentro(int idCentro){
        for(Centro centro : centro){
            if(centro.getIdCentro() == idCentro){
                return centro;
            }
        }
        return null;
    }
}
