package logica.poo.inicio;

import logica.poo.menu.MenuConsola;
import logica.poo.miembros.Miembro;
import java.util.ArrayList;
import logica.poo.ui.*;

public class GestionGimnasio {
    public static void main(String[] args) {

        OpcionMenu opcion1 = new OpcionMenuCrearCentro();
        OpcionMenu opcion2 = new OpcionMenuListarCentros();
        OpcionMenu opcion3 = new OpcionMenuCrearMiembro();
        OpcionMenu opcion4 = new OpcionMenuListarMiembros();
        OpcionMenu opcion5 = new OpcionMenuMiembrosCentro();

        MenuConsola  menu = new MenuConsola();
        menu.anadirOpcion(opcion1);
        menu.lanzarMenu();
    }
}