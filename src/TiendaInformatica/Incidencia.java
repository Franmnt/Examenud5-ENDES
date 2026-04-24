package TiendaInformatica;

import java.util.Date;

public class Incidencia {

    private String descripcion;
    private Date fecha;
    private String estado;

    public Incidencia(String descripcion, Date fecha, String estado) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
    }
}
