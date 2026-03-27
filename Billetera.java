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
    public void mostrarInfo() {
        System.out.println("**¡BIENVENIDO A SU BILLETERA DIGITAL!**");
        System.out.println("Propietario: " + propietario);
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo: $" + saldo);
        if (activa) {
            System.out.println("Estado: Activa");
        } else {
            System.out.println("Estado: Inactiva");
        }
    }

}
