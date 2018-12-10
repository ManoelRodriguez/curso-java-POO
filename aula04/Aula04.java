package aula04;

/**
 *
 * @author Manoel Rodriguez
 */
public class Aula04 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic Cristal", "Azul", 0.7f);

       // c1.setModelo("Bic");
       // c1.setPonta(0.5f);
        c1.status();
        System.out.println("");
        Caneta c2 = new Caneta("Faber Castell", "Preta", 1.2f);
        c2.status();
    }

}
