package logica.poo.ui;
import logica.poo.centros.*;
import logica.poo.operaciones.*;

import java.util.Scanner;
public class OpcionMenuCrearCentro extends OpcionMenu {

    @Override
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el nombre del centro de acondicionamiento: ");
        String nombre = sc.nextLine();

        System.out.println("Digite la dirección del centro de acondicionamiento: ");
        String dir = sc.nextLine();

        System.out.println("Digite el tipo de centro de acondicionamiento: ");
        TipoCentro tipoCentro = TipoCentro.valueOf(sc.nextLine());

        System.out.println("Digite la tarifa del centro de acondicionamiento: ");
        double tarifa = sc.nextInt();


        Centro centro = new Centro(nombre, dir, tipoCentro, tarifa);
        OperacionesCentros op = new OperacionesCentros();
        op.agregar(centro);
    }


    @Override
    public String toString() {
        return "Crear centro de acondicionamiento.";
    }
}
