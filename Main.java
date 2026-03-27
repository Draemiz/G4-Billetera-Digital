public class Main {

    public static void main(String[] args) {

        System.out.println("BIENVENIDO A LA BILLETERA VIRTUAL");

        // 1. Integrante 1: Billetera
        System.out.println("Billetera");
        Billetera b1 = new Billetera("Carlos Mendoza", "BW-00123", 500);

        b1.mostrarInfo();

        System.out.println("Depositar");
        b1.depositar(150);

        System.out.println("Retirar");
        b1.retirar(200);

        System.out.println("Retirar demasiado");
        b1.retirar(1000);

        // 2. Integrante 2: Transaccion
        System.out.println("Transaccion");
        Transaccion t1 = new Transaccion("TRANSFERENCIA", 75.00, "Pago de servicio");

        t1.mostrarDetalle();
        System.out.println();

        t1.aplicarComision(2.5);
        System.out.println();

        t1.marcarFallida();
        System.out.println();

        t1.mostrarDetalle();

        // 3. Integrante 3: Contacto
        System.out.println("Contactos");
        Contacto contacto1 = new Contacto("Juan Perez", "1234567890", "Banco A");
        Contacto contacto2 = new Contacto("Maria Lopez", "0987654321", "Banco B");

        contacto1.mostrarContacto();
        contacto2.mostrarContacto();

        contacto1.marcarFvorito();
        contacto1.mostrarContacto();

        contacto1.enviarDinero(500);
        contacto2.enviarDinero(250);

        // 4. Integrante 4: RegistroBilletera
        System.out.println("Registro Billeteras");
        RegistroBilletera miRegistro = new RegistroBilletera("BilleteraXYZ");

        miRegistro.registrarBilletera("BW-001", "Becker");
        miRegistro.registrarBilletera("BW-002", "Laura Torres");

        miRegistro.mostrarRegistro();

        miRegistro.buscarCuenta("BW-002");
        miRegistro.buscarCuenta("BW-999");

        System.out.println("Fin");
    }

}
