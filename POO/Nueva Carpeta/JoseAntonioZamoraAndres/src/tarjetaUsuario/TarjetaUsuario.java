
package tarjetaUsuario;

public class TarjetaUsuario {
    private String id;
    private boolean activada;

    public TarjetaUsuario(String id, boolean activa) {
        this.id =id;
        this.activada =activa;
    }
    public boolean getActivada(){
        return this.activada;
    }
    public void setActivada(boolean activada){
        this.activada = activada;
    }
}
