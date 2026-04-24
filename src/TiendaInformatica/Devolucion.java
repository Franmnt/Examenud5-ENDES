package TiendaInformatica;

import java.util.Date;

public class Devolucion {

    private Date fecha;
    private String motivo;
    private String estado;

    public Devolucion(Date fecha, String motivo, String estado) {
        this.fecha = fecha;
        this.motivo = motivo;
        this.estado = estado;
    }


}

