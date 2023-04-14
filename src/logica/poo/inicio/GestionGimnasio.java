package logica.poo.inicio;

import logica.poo.menu.MenuConsola;
import logica.poo.miembros.Miembro;
import java.util.ArrayList;
import logica.poo.ui.*;

public class GestionGimnasio {
    public static void main(String[] args) {


        MenuConsola  menu = new MenuConsola();
        menu.anadirOpcion(new OpcionMenuCrearCentro());
        menu.anadirOpcion(new OpcionMenuListarCentros());
        menu.anadirOpcion(new OpcionMenuCrearMiembro());
        menu.anadirOpcion(new OpcionMenuListarMiembros());
        menu.anadirOpcion(new OpcionMenuMiembrosCentro());
        menu.lanzarMenu();

    }
}