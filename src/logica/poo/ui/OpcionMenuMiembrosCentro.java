package logica.poo.ui;
import java. util.Scanner;
import logica.poo.centros.*;
import logica.poo.operaciones.*;

public class OpcionMenuMiembrosCentro extends OpcionMenu {

    private Centro c;

    @Override
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite el id del centro de acondicionamiento que desea revisar: ");
        int opcion = sc.nextInt();

        c = OperacionesCentros.buscarCentro(opcion);
        System.out.println(c.getMiembro());

    }

    @Override
    public String toString() {
        return "Listar miembros del centro de acondicionamiento.";
    }
}
