package logica.poo.miembros;
import java.time.LocalDate;

public class Miembro {

    //Atributos
    private int id;
    private static int numMiembro = 1;
    private int contM;
    private String nombre;
    private String apellido;
    private String correo;
    private LocalDate fechaInicioGim;
    private double deudaMiembro;
    private Membresia membresia;
    private String tipoClub;


    //Constructor
    public Miembro(int id, String nombre, String apellido, String correo,
                   LocalDate fechaInicioGim, LocalDate fechaMembresia, int duracion, String tipoClub) {

        this.contM = getNumMiembro();
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaInicioGim = fechaInicioGim;
        membresia = new Membresia(fechaMembresia, duracion);
        membresia.getFechaVencimiento();
        this.tipoClub = tipoClub;
    }

    //Metodos getter y setter
    public int getId() {
        return id;
    }

    public static int getNumMiembro() {
        return numMiembro++;
    }

    public void setNumMiembro(int numMiembro) {
        return;
    }

    public int getContM() {
        return contM;
    }

    public void setContM(int contM) {
        this.contM = contM;
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

    public String getTipoClub() {
        return tipoClub;
    }

    @Override
    public String toString() {

        return "\nMi id: " + this.id +
                "\nNúmero de miembro: " + this.contM +
                "\nMe llamo: " + this.nombre  + " " + this.apellido +
                "\nCorreo: " + correo +
                "\nFecha inicio GYM: " + this.fechaInicioGim +
                "\nFecha membresia: " + membresia.getFechaMembresia() +
                "\nDuración de la membresia: " + membresia.getDuracion() +
                "\nFecha de vencimiento: " + membresia.getFechaVencimiento();
    }
}

