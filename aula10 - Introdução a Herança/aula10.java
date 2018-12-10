package aula10;

/**
 *
 * @author Manoel Rodriguez
 */
public class aula10 {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
       
        //Definindo Nomes
        p1.setNome("Manoel");
        p2.setNome("Paulo");
        p3.setNome("Henrique");
        p4.setNome("Fábio");
        
        //Definindo Idades
        p1.setIdade(20);
        p2.setIdade(34);
        p3.setIdade(27);
        p4.setIdade(30);
        
        //Definindo Sexo
        p1.setSexo("Masculino");
        p2.setSexo("Masculino");
        p3.setSexo("Masculino");
        p4.setSexo("Masculino");
        
        //Exibindo Informações
        p1.info();
        p2.info();
        p3.info();
        p4.info();
        
        
        
    }
    
}
