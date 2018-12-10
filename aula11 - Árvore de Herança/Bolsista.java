package aula11;

/**
 *
 * @author Manoel Rodriguez
 */
public class Bolsista extends Aluno {

    //Atributos
    private int bolsa;

    //Métodos
    public void renovarBolsa() {
        System.out.println("Renovando bolsa...");
    }

    @Override //Aplicando a Sobreposição
    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista. Pagamento facilitado!");
    }

    //Métodos Especiais
    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

}
