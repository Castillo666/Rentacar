package Entidades;

import java.util.Date;

public class Servicio {
        int idServicio;
	Date fechaInicio;
	Date fechaFin;
	int monto;
	String detalle;
	String tipoServicio;
	int idEmpresa;

  /* public Servicio(int idServicio, Date fechaInicio, Date fechaFin, int monto, String detalle, String tipoServicio, int idEmpresa) {
        this.idServicio = idServicio;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.monto = monto;
        this.detalle = detalle;
        this.tipoServicio = tipoServicio;
        this.idEmpresa = idEmpresa;
    }
*/
        
    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public int getMonto() {
        return monto;
    }

    public String getDetalle() {
        return detalle;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    
    
    
        
}
