package aula11;

/**
 *
 * @author Manoel Rodriguez
 */
public class Aula11 {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();

        a1.setNome("Manoel");
        a1.setIdade(20);
        a1.setSexo("Masculino");
        a1.info();
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Caio");
        b1.setIdade(23);
        b1.setSexo("Masculino");
        
        b1.pagarMensalidade();

    }

}
