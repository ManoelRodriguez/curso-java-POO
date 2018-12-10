package aula07;

/**
 *
 * @author Manoel Rodriguez
 */
public class Lutador {

    //Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //Métodos
    public void apresentar() {
        System.out.println("---------------------------------------------");
        System.out.println("Lutador: " + this.nome);
        System.out.println("Origem: " + this.nacionalidade);
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() +" m de altura ");
        System.out.println("Pesando: " + this.getPeso() + "Kg" );
        System.out.println( this.getVitorias() + " vitórias");
        System.out.println( this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void status() {
        System.out.println("--------------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empatou: " + this.getEmpates());
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }

    //Construtor
    public Lutador(String n, String nacio, int id, float alt, float p, int vit, int der, int emp) {
        this.nome = n;
        this.nacionalidade = nacio;
        this.idade = id;
        this.altura = alt;
        this.setPeso(p);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

    //Métodos Especiais
    public String getNome() {
        return this.nome;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacio) {
        this.nacionalidade = nacio;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int id) {
        this.idade = id;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float alt) {
        this.altura = alt;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float p) {
        this.peso = p;
        this.setCategoria();

    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria() {
        if (peso < 52.2) {
            this.categoria = "Inválido";
        } else if (peso <= 70.3) {
            this.categoria = "Leve";
        } else if (peso <= 83.9) {
            this.categoria = "Médio";
        } else if (peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vit) {
        this.vitorias = vit;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int der) {
        this.derrotas = der;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int emp) {
        this.empates = emp;
    }

}
