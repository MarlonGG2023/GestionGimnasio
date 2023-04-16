package logica.poo.miembros;
import java.time.LocalDate;

public class Miembro {

    private int id;
    private static int numMiembro = 1;
    private String nombre;
    private String apellido;
    private String correo;
    private LocalDate fechaInicioGim;
    private double deudaMiembro;
    private Membresia membresia;


    public Miembro(int id, String nombre, String apellido, String correo,
                   LocalDate fechaInicioGim, LocalDate fechaMembresia, int duracion) {

        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaInicioGim = fechaInicioGim;
        membresia = new Membresia(fechaMembresia, duracion);
        membresia.getFechaVencimiento();
    }

    public int getId() {
        return id;
    }

    public static int getNumMiembro() {
        return numMiembro++;
    }

    public void setNumMiembro(int numMiembro) {
        return;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getFechaInicioGim() {
        return fechaInicioGim;
    }

    public void setFechaInicioGim(LocalDate fechaInicioGim) {
        this.fechaInicioGim = fechaInicioGim;
    }

    public LocalDate getFechaMembresia(){
        return membresia.getFechaMembresia();
    }

    public int getDuracion(){

        return membresia.getDuracion();
    }

    public LocalDate getFechaVencimiento(){
        return membresia.getFechaVencimiento();
    }

    public double getDeudaMiembro() {
        return deudaMiembro;
    }

    public void setDeudaMiembro(double deudaMiembro) {
        this.deudaMiembro = deudaMiembro;
    }

    @Override
    public String toString() {

        return "Mi id es " + getId() + ", mi número de miembro es " + getNumMiembro() +
                ". Me llamo " + getNombre()  + "  " + getApellido() +  ",  mi correo es " +
                getCorreo() + ", inicie en el  GYM el " + getFechaInicioGim() + " y obtuve mi membresia el " +
                membresia.getFechaMembresia() + ", la cual tiene una duración de " + membresia.getDuracion() + ", es decir, se acaba el " +
                membresia.getFechaVencimiento();
    }
}

