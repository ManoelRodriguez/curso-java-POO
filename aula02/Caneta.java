package aula02;

public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    
    public void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
        
    }
    
   public  void rabiscar() {
        if(tampada == true)
            System.out.println("A caneta está tampada!");
          else
            System.out.println("Liberado!");
            
    }

    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
}
