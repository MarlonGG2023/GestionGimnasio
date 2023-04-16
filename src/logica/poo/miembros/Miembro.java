package logica.poo.miembros;
import java.time.LocalDate;

public class Miembro {

    private static int id;
    private int numMiembro;
    private String nombre;
    private String apellido;
    private String correo;
    private LocalDate fechaInicioGim;
    private LocalDate fechaInicioMem;
    private int duracionMem;
    private LocalDate fechaFinMem;
    private double deudaMiembro;


    public Miembro(int id, int numMiembro, String nombre, String apellido, String correo,
                   LocalDate fechaInicioGim, LocalDate fechaInicioMem, int duracionMem, LocalDate fechaFinMem,
                   double deudaMiembro) {

        this.id = id;
        this.numMiembro = numMiembro;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.fechaInicioGim = fechaInicioGim;
        this.fechaInicioMem = fechaInicioMem;
        this.duracionMem = duracionMem;
        this.fechaFinMem = fechaFinMem;
        this.deudaMiembro = deudaMiembro;
    }

    private static int getId() {
        return Miembro.id++;
    }

    public int getNumMiembro() {
        return numMiembro;
    }

    public void setNumMiembro(int numMiembro) {
        this.numMiembro = numMiembro;
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

    public LocalDate getFechaInicioMem() {
        return fechaInicioMem;
    }

    public void setFechaInicioMem(LocalDate fechaInicioMem) {
        this.fechaInicioMem = fechaInicioMem;
    }

    public int getDuracionMem() {
        return duracionMem;
    }

    public void setDuracionMem(int duracionMem) {
        this.duracionMem = duracionMem;
    }

    public LocalDate getFechaFinMem() {
        return fechaFinMem;
    }

    public void setFechaFinMem(LocalDate fechaFinMem) {
        this.fechaFinMem = fechaFinMem;
    }

    public double getDeudaMiembro() {
        return deudaMiembro;
    }

    public void setDeudaMiembro(double deudaMiembro) {
        this.deudaMiembro = deudaMiembro;
    }

    @Override
    public String toString() {

        return "Mi id es " + Miembro.getId() + ", mi número de miembro es " + getNumMiembro() +
                ". Me llamo " + getNombre()  + " " + getApellido() +  ",  mi correo es " +
                getCorreo() + ", inicie en el  GYM el " + getFechaInicioGim() + " y obtuve mi membresia el " +
                getFechaInicioMem() + ", la cual tiene una duración de " + getDuracionMem() + ", es decir, se acaba el " +
                getFechaFinMem() + ". Mi deuda con el GYM es de " + getDeudaMiembro();
    }
}

