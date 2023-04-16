package logica.poo.ui;

import logica.poo.miembros.*;
import logica.poo.centros.*;
import logica.poo.operaciones.OperacionesCentros;
import logica.poo.operaciones.OperacionesMiembros;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class OpcionMenuCrearMiembro extends OpcionMenu{

    private Centro c;


    @Override
    public void ejecutar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nEscoja si desea ser un miembroSoloUno(1) o un miembroMultiClub(2): ");
        int opcion = sc.nextInt();

        if(opcion == 1){
            System.out.println("Digite su id: ");
            int id = sc.nextInt();

            String a = sc.nextLine();
            System.out.println("Digite su nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Digite su apellido: ");
            String apellido = sc.nextLine();

            System.out.println("Digite su correo: ");
            String correo = sc.nextLine();

            System.out.println("Digite el id del centro: ");
            int centro = sc.nextInt();
            c = OperacionesCentros.buscarCentro(centro);

            String b = sc.nextLine();
            System.out.println("Digite su fecha de ingreso al centro de acondicionamiento:");
            LocalDate fechaIG = LocalDate.parse(sc.nextLine());

            System.out.println("Digite su fecha de inicio de la membresia al centro de acondicionamiento: ");
            LocalDate fechaIM = LocalDate.parse(sc.nextLine());

            System.out.println("Digite la duración de la membresia: ");
            int duracion = sc.nextInt();


            MiembroSoloUno msu = new MiembroSoloUno(id, nombre, apellido, correo, fechaIG, fechaIM, duracion,  c);
            OperacionesMiembros.agregarMiembro(msu);

        }
        else if (opcion == 2) {
            System.out.println("\nDigite su id: ");
            int id = sc.nextInt();

            String a = sc.nextLine();
            System.out.println("Digite su nombre: ");
            String nombre = sc.nextLine();

            System.out.println("Digite su apellido: ");
            String apellido = sc.nextLine();

            System.out.println("Digite su correo: ");
            String correo = sc.nextLine();

            String b = sc.nextLine();
            System.out.println("Digite su fecha de ingreso al centro de acondicionamiento:");
            LocalDate fechaIG = LocalDate.parse(sc.nextLine());

            System.out.println("Digite su fecha de inicio de la membresia al centro de acondicionamiento: ");
            LocalDate fechaIM = LocalDate.parse(sc.nextLine());

            System.out.println("Digite la duración de la membresia: ");
            int duracion = sc.nextInt();
            
            MultiClub mc = new MultiClub(id, nombre, apellido, correo, fechaIG, fechaIM, duracion);
            OperacionesMiembros.agregarMiembro(mc);

        }

    }

    @Override
    public String toString() {
        return "Crear cliente/miembro.";
    }
}
