package Entidades;

import java.util.Date;

public class Reserva {
    	int idReserva;
	Date fechaInicio;
	Date fechaFinal;
	Date fechaRegistro;
	int idOperador;
        String idVehiculo;
        int idCliente;
        double precioTotal;
        String sede;

    public Reserva() {
    }

    public Reserva(int idReserva, Date fechaInicio, Date fechaFinal, Date fechaRegistro, int idOperador, String idVehiculo, int idCliente, double precioTotal, String sede) {
        this.idReserva = idReserva;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.fechaRegistro = fechaRegistro;
        this.idOperador = idOperador;
        this.idVehiculo = idVehiculo;
        this.idCliente = idCliente;
        this.precioTotal = precioTotal;
        this.sede = sede;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }


    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    

    public String getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(String idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public int getIdOperador() {
        return idOperador;
    }

    public void setIdOperador(int idOperador) {
        this.idOperador = idOperador;
    }
  
    public static double calcularPrecio(int precioCarro, int cantDias, boolean wifi, boolean asistencia, boolean gps, boolean asiento, boolean seguro){
    
        double total = precioCarro * cantDias;
        if (wifi == true){
            total = total + (cantDias * 15);//$15 diarios
        }
        if (asistencia == true){
            total = total + (cantDias * 3.99);//$3.99 diarios
        }
        if (gps == true){
            total = total + (cantDias * 13.99);//$13.99 diarios
        }
        if (asiento == true){
            total = total + (cantDias * 6.99);//$6.99 diarios
        }
        if (seguro == true){
            total = total + (cantDias * 12.99);//$12.99 diarios
        }
        return total;
    
    }
     
}
