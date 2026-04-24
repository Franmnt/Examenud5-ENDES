package TiendaInformatica;

import java.util.Date;

public class Pedido {

    private Date fecha;
    private String estado;
    private double importe;

    public Pedido(Date fecha, String estado, double importe) {
        this.fecha = fecha;
        this.estado = estado;
        this.importe = importe;
    }
}
