public class RegistroBilletera {
    private String nombreBanco;
    private String[] cuentas;
    private String[] propietarios;
    private int totalRegistros;

    public RegistroBilletera(String nombreBanco) {
        this.nombreBanco = nombreBanco;
        cuentas = new String[10];
        propietarios = new String[10];
        totalRegistros = 0;
    }
}
