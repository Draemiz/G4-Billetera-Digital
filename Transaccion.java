//IsmaelHernandez
public class Transaccion {
    //Atributos =)
    private String tipo;
    private double monto;
    private String descripcion;
    private boolean exitosa;

    public Transaccion(String tipo, double monto, String descripcion) {
        this.tipo = tipo;
        this.monto = monto;
        this.descripcion = descripcion;
        this.exitosa = true;
    }
     public void mostrarDetalle() {
        System.out.println("--- Detalle de Transacción ---");
        System.out.println("Tipo: " + tipo);
        System.out.println("Monto: $" + monto);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Estado: " + (exitosa ? "Exitosa" : "Fallida"));
    }
public void aplicarComision(double porcentaje) {
        double comision = monto * (porcentaje / 100);
        double total = monto + comision;

        System.out.println("Comisión (" + porcentaje + "%): $" + String.format("%.2f", comision));
        System.out.println("Monto total con comisión: $" + String.format("%.2f", total));
    }
        public void marcarFallida() {
        this.exitosa = false;
        System.out.println("Transacción marcada como fallida.");
        System.out.println("Monto afectado: $" + monto);
    }
}

