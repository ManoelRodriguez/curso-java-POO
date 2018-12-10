
package aula02;

/**
 *
 * @author Manoel Rodriguez
 */
public class Celular {

    String modelo = "Galaxy J7 prime";
    String cor = "Preto";
    int hd = 32;
    int ram = 3;
    private boolean ligado = true;
    
    void info(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("HD: " + this.hd);
        System.out.println("Memória RAM: " + this.ram);
        System.out.println("Ligado: " + this.ligado);
    }
   public  void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }
    
}
