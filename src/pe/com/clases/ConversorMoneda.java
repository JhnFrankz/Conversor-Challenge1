package pe.com.clases;

public class ConversorMoneda {

    private double cantidad;
    private double valorResultado;
    private String mensajeResultado;

    public ConversorMoneda(double cantidad, int opcion) {
        this.cantidad = cantidad;
        switch (opcion) {
            case 0:
                convertirSolesDolar();
                break;
            case 1:
                convertirSolesEuro();
                break;
            case 2:
                convertirSolesLibras();
                break;
            case 3:
                convertirSolesYen();
                break;
            case 4:
                convertirSolesWonCoreano();
                break;
            case 5:
                convertirDolarSoles();
                break;
            case 6:
                convertirEuroSoles();
                break;
            case 7:
                convertirLibrasSoles();
                break;
            case 8:
                convertirYenSoles();
                break;
            case 9:
                convertirWonCoreanoSoles();
                break;
            default:
                break;
        }
    }

    public void convertirSolesDolar() {
        this.valorResultado = this.cantidad * 0.27;
        this.mensajeResultado = "Tienes " + this.getResultado() + " dólares.";
    }

    public void convertirSolesEuro() {
        this.valorResultado = this.cantidad * 0.25;
        this.mensajeResultado = "Tienes " + this.getResultado() + " euros.";
    }

    public void convertirSolesLibras() {
        this.valorResultado = this.cantidad * 0.22;
        this.mensajeResultado = "Tienes " + this.getResultado() + " libras.";
    }

    public void convertirSolesYen() {
        this.valorResultado = this.cantidad * 34.51;
        this.mensajeResultado = "Tienes " + this.getResultado() + " yenes.";
    }

    public void convertirSolesWonCoreano() {
        this.valorResultado = this.cantidad * 343.16;
        this.mensajeResultado = "Tienes " + this.getResultado() + " wones.";
    }

    public void convertirDolarSoles() {
        this.valorResultado = this.cantidad * 3.69;
        this.mensajeResultado = "Tienes " + this.getResultado() + " soles.";
    }

    public void convertirEuroSoles() {
        this.valorResultado = this.cantidad * 3.95;
        this.mensajeResultado = "Tienes " + this.getResultado() + " soles.";
    }

    public void convertirLibrasSoles() {
        this.valorResultado = this.cantidad * 4.64;
        this.mensajeResultado = "Tienes " + this.getResultado() + " soles.";
    }

    public void convertirYenSoles() {
        this.valorResultado = this.cantidad * 0.029;
        this.mensajeResultado = "Tienes " + this.getResultado() + " soles.";
    }

    public void convertirWonCoreanoSoles() {
        this.valorResultado = this.cantidad * 0.0029;
        this.mensajeResultado = "Tienes " + this.getResultado() + " soles.";
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getResultado() {
        return valorResultado;
    }

    public String getMensajeResultado() {
        return mensajeResultado;
    }
}
