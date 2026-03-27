public class Billetera {
    private String propietario;
    private String numeroCuenta;
    private double saldo;
    private boolean activa;

    public Billetera(String propietario, String numeroCuenta, double saldoInicial) {
        this.propietario = propietario;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
        this.activa = true;
    }
}
