package TiendaInformatica;

public class Cliente {

    private String codigo;
    private String nombre;
    private String correo;
    private String direccion;
    private int telefono;
    private String historial;
    private String incidencias;

    public Cliente(String codigo, String nombre, String correo, String direccion, int telefono, String historial, String incidencias) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.historial = historial;
        this.incidencias = incidencias;
    }
}
