package aula09b;

/**
 *
 * @author Manoel Rodriguez
 */
public class Livro implements Publicacao {

    //Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //Métodos 
    public void detalhes() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Total de páginas: " + this.totPaginas);
        System.out.println("Página Atual: " + this.pagAtual);
        System.out.println("Aberto: " + this.aberto);
    }

    //Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }

    //Métodos Especiais
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
       this.aberto = true;
    }

    @Override
    public void fechar() {
       this.aberto = false;
    }

    @Override
    public void folhear(int p) {
      if(p <= this.totPaginas){
          this.pagAtual = p;
      } else {
          this.pagAtual = 0;
      }
        
    }

    @Override
    public void avancarPag() {
       if(this.pagAtual == this.totPaginas){
           System.out.println("Você ja está na última página!");
       } else{
           this.pagAtual++;
       }
        
    }

    @Override
    public void voltarPag() {
        if(this.pagAtual == 1){
            System.out.println("Você está na primeira página!");
        } else {
          this.pagAtual--;  
        }
    }

}
