package aula07;

import java.util.Random;

/**
 *
 * @author Manoel Rodriguez
 */
public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovado;

    //Métodos
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;

        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovado) {
            System.out.println("-----------Desafiado----------");
            this.desafiado.apresentar();
            System.out.println("-----------Desafiante----------");
            this.desafiante.apresentar();

            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3); // 0,1,2

            System.out.println("==========RESULTADO DA LUTA==========");
            switch (vencedor) {
                case 0:   // Empate
                    System.out.println("A luta terminou em empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // Desafiado vence
                    System.out.println("O vencedor é: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // Desafiante vence
                    System.out.println("O vencedor é: " + this.desafiante.getNome());
                    this.desafiante.ganharLuta();
                    this.desafiado.perderLuta();
                    break;
            }
            System.out.println("=====================================");
        } else {
            System.out.println("A luta não pode acontecer!");
        }

    }

    //Construtor
    public Luta() {

    }

    //Métodos Especiais 
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

}
