package aula06;

/**
 *
 * @author Manoel Rodriguez
 */
public class ControleRemoto implements Controlador {
    
    public int volume;
    public boolean ligado;
    public boolean tocando;
    
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }
    
    private int getVolume() {
        return volume;
    }

    private void setVolume(int v) {
        volume += v;
    }

    private  boolean getLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    @Override
    public void ligar() {
        this.setLigado(true);
    }
    
    @Override
    public void desligar() {
        this.setLigado(false);
    }
    
    @Override
    public void abrirMenu() {
        
        System.out.println("-----MENU-----");
        System.out.println("Tocando: " + this.getTocando());
        System.out.println("Ligado: " + this.getLigado());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i < this.getVolume(); i += 10) {
            System.out.print(" | ");
        }
        System.out.println("");
    }
    
    @Override
    public void fecharManu( ) {
        System.out.println("Fechando o menu...");
    }
    
    @Override
    public void maisVolume( ) {
        if (this.getLigado( )) {
            this.setVolume(this.getVolume( ) + 5);
        }
        System.out.println("");
    }
    
    @Override
    public void menosVolume( ) {
        if (this.getLigado( )) {
            this.setVolume(this.getVolume( ) - 5);
        }
        System.out.println("");
    }
    
    @Override
    public void ligarMudo( ) {
        if (this.getLigado( ) && this.getVolume( ) > 0) {
            this.setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo( ) {
        if (this.getLigado( ) && this.volume == 0) {
            this.setVolume(50);
        }
    }
    
    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }
    
    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }
    
}
