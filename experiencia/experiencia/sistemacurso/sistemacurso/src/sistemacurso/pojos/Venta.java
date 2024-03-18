/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemacurso.pojos;

import java.sql.Date;

/**
 *
 * @author ferys
 */
public class Venta {
    private int idVenta;
    private double montoVenta;   
    private Date fecha;

    public Venta(int idVenta, double montoVenta, Date fecha) {
        this.idVenta = idVenta;
        this.montoVenta = montoVenta;
        this.fecha = fecha;
    }

    public Date getFechaVenta() {
        return fecha;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fecha = fechaVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public double getMontoVenta() {
        return montoVenta;
    }

    public void setMontoVenta(double montoVenta) {
        this.montoVenta = montoVenta;
    }
    
}
