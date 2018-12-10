
package aula09b;

/**
 *
 * @author Manoel Rodriguez
 */
public class ProjetoLivro {
    public static void main(String[] args) {
        
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
       p[0] = new Pessoa("Pedro", 22, "MAsculino");
       p[1] = new Pessoa("Maria", 25, "Feminino"); 
        
       l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
       l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);
       l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
       l[2].abrir();
       l[2].folhear(3);
       l[2].voltarPag();
       l[2].detalhes();
    }
    
}
