package logica.poo.inicio;

import logica.poo.menu.MenuConsola;
import logica.poo.ui.*;

public class GestionGimnasio {
    public static void main(String[] args) {

        //Instancias para agregar opciones al menu consola

        MenuConsola  menu = new MenuConsola();
        menu.anadirOpcion(new OpcionMenuCrearCentro());
        menu.anadirOpcion(new OpcionMenuListarCentros());
        menu.anadirOpcion(new OpcionMenuCrearMiembro());
        menu.anadirOpcion(new OpcionMenuListarMiembros());
        menu.anadirOpcion(new OpcionMenuMiembrosCentro());

        //Metodo para ejecutar el menu
        menu.lanzarMenu();

    }
}