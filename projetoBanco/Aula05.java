package projetoBanco;

/**
 *
 * @author Manoel Rodriguez
 */
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco2 p1 = new ContaBanco2();
        ContaBanco2 p2 = new ContaBanco2();

        p1.setNumConta(1111);
        p1.setDono("Manoel");
        p1.abrirConta("CP");
        p1.info();

        p2.setNumConta(2222);
        p2.setDono("Larissa");
        p2.info();

        p1.depositar(300);
        p2.depositar(500);

        p1.info();
        p2.info();

        p1.sacar(100);
        p1.info();

    }

}
