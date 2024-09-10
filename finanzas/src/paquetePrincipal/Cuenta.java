
package paquetePrincipal;

public class Cuenta {
    private String codigoCuentaCliente;
    private double saldoActual;
    private double saldoMedio;
    private boolean tieneAmortizacion; 

    public Cuenta(String codigoCuentaCliente, double saldoActual, double saldoMedio, boolean tieneAmortizacion) {
        this.codigoCuentaCliente = codigoCuentaCliente;
        this.saldoActual = saldoActual;
        this.saldoMedio = saldoMedio;
        this.tieneAmortizacion = tieneAmortizacion;
    }

    public String getCodigoCuentaCliente() {
        return codigoCuentaCliente;
    }

    public void setCodigoCuentaCliente(String codigoCuentaCliente) {
        this.codigoCuentaCliente = codigoCuentaCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getSaldoMedio() {
        return saldoMedio;
    }

    public void setSaldoMedio(double saldoMedio) {
        this.saldoMedio = saldoMedio;
    }

    public boolean isTieneAmortizacion() {
        return tieneAmortizacion;
    }

    public void setTieneAmortizacion(boolean tieneAmortizacion) {
        this.tieneAmortizacion = tieneAmortizacion;
    }
}

