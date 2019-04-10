package Entidades;


public class Factura {
        public static int numeroFactura = 1;
        int idFactura;
	int placaVehiculo;
	int cedulaCliente;
	int monto;
    
    public Factura(){
        idFactura = Factura.numeroFactura++;
    }
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
        
    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getPlacaVehiculo() {
        return placaVehiculo;
    }

    public int getCedulaCliente() {
        return cedulaCliente;
    }

    public int getMonto() {
        return monto;
    }

    public void setPlacaVehiculo(int placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public void setCedulaCliente(int cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }       
}
