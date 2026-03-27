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

    public void registrarBilletera(String cuenta, String propietario) {
        if (totalRegistros < 10) {
            cuentas[totalRegistros] = cuenta;
            propietarios[totalRegistros] = propietario;
            System.out.println("Billetera registrada: " + cuenta + " -  " + propietario);
            totalRegistros++;
        } else {
            System.out.println("No se pueden registrar más billeteras. Capacidad máxima alcanzada.");
        }
    }

    public void buscarCuenta(String cuenta) {
        for (int i = 0; i < totalRegistros; i++) {
            if (cuentas[i].equals(cuenta)) {
                System.out.println("Cuenta encontrada: " + cuentas[i] + " | Propietario: " + propietarios[i]);
            }
        }
        System.out.println("Cuenta no encontrada");
    }

    public void mostrarRegistro(){
        System.out.println("\n=== REGISTRO DE BANCO: " + nombreBanco + " ===");
        System.out.println("Total de billeteras registradas: " + totalRegistros);
        
        for (int i = 0; i < totalRegistros; i++) {
            System.out.println((i + 1) + ". Cuenta: " + cuentas[i] + " | Propietario: " + propietarios[i]);
        }
        System.out.println("========================================\n");
    }
    

}
