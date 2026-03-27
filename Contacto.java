public class Contacto {

    private String nombre;
    private String cuentaDestino;
    private String banco;
    private boolean favorito;

    public Contacto(String nombre, String cuentaDestino, String banco) {
        this.nombre = nombre;
        this.cuentaDestino = cuentaDestino;
        this.banco = banco;
        favorito = false;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public boolean isFavorito() {
        return favorito;
    }

    public void setFavorito(boolean favorito) {
        this.favorito = favorito;
    }

    public void mostrarContacto(){
        System.out.println("=== Contacto ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cuenta: " + cuentaDestino);
        System.out.println("Banco: " + banco);
        if(favorito == true){
            System.out.println("Favorito: ☻ Favorito" );
            System.out.println();
        }else{
        System.out.println("Favorito: Sin Marcar");
        System.out.println();
        }
    }
    public void marcarFvorito(){
        favorito = true;
        System.out.println();
        System.out.println("Contacto: "+nombre + " agregado a favoritos ★.");
        System.out.println();
    }
    public void enviarDinero(double monto){
        System.out.println();
        System.out.println("Transferencia enviada: \n"+
         "Destinatario: "+ nombre + 
         "\n Cuenta: " + cuentaDestino + 
         "\n Monto: " + monto );
        
        System.out.println("Completado.");
        System.out.println();
    }
   
}