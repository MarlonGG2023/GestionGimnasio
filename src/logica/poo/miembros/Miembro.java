package logica.poo.miembros;
import java.util.Date;
import java.time.LocalDate;

public class Miembro {

    private int id;
    private int numMiembro;
    private String nombre;
    private String apellido;
    private String correo;
    private LocalDate fechaInicioGim;
    private Date fechaInicioMem;
    private int duracionMem;
    private Date fechaFinMem;
    private float deudaMiembro;


    public Miembro (int id, int numMiembro, String nombre, String apellido, String correo,
                    LocalDate fechaInicioGim, Date fechaInicioMem, int duracionMem, Date fechaFinMem,
                    float deudaMiembro){

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFechaInicioMem() {
        return fechaInicioMem;
    }

    public void setFechaInicioMem(Date fechaInicioMem) {
        this.fechaInicioMem = fechaInicioMem;
    }

    public int getDuracionMem() {
        return duracionMem;
    }

    public void setDuracionMem(int duracionMem) {
        this.duracionMem = duracionMem;
    }

    public Date getFechaFinMem() {
        return fechaFinMem;
    }

    public void setFechaFinMem(Date fechaFinMem) {
        this.fechaFinMem = fechaFinMem;
    }

    public float getDeudaMiembro() {
        return deudaMiembro;
    }

    public void setDeudaMiembro(float deudaMiembro) {
        this.deudaMiembro = deudaMiembro;
    }

    @Override
    public String toString() {
        return "Mi cedula es " + id + ", soy el miembro numero " + numMiembro + ", mi nombre es" + nombre + " " + apellido + ". Mi correo es " + correo
                + " e inicie en el gimnasio el " + fechaInicioGim  + ", inicie la membresia el " + fechaInicioMem + ". Mi membresia dura " + duracionMem
                + " y se acaba el " + fechaFinMem + ". Al terminar debo " + deudaMiembro;
    }
}
