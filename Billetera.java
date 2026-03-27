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

    public void depositar(double monto) {
        saldo += monto;
        System.out.println("Depósito exitoso: + $" +monto);
        System.out.println("Nuevo saldo: $" +saldo);
    }
    
    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Retiro exitoso: - $" + monto);
            System.out.println("Saldo restante: $" + saldo);
        } else {
            System.out.println("¡Fondos insuficientes!");
            System.out.println("Saldo actual: $" + saldo);
        }
    }
}
