package aula10;

/**
 *
 * @author Manoel Rodriguez
 */
public class Funcionario extends Pessoa {  //Herdando a classe "Mãe'"  Pessoa

    //Atributos
    private String setor;
    private boolean trabalhando;

    //Métodos
    public void mudaTrabalho() {  //Uma troca de turno, por exemplo
        this.trabalhando = !this.trabalhando;
    }

    //Métodos Especiais 
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
