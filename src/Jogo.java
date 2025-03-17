import java.util.ArrayList;
import java.util.List;

public class Jogo {
    private Tabuleiro meuTabuleiro;
    private List<Jogador> meusJogadores;
    private Dado meuDado;

    public Jogo(int numeroCasas, int numeroJogadores) {
        this.meuTabuleiro = new Tabuleiro(numeroCasas);
        this.meusJogadores = new ArrayList<>();
        this.meuDado = new Dado();

        for (int i = 1; i <= numeroJogadores; i++) {
            this.meusJogadores.add(new Jogador(i));
        }
    }

    public void proximaJogada() {
        for (Jogador jogador : meusJogadores) {
            // Cada jogador rola o dado individualmente
            jogador.jogar(meuDado, meuTabuleiro);
        }
    }

    public void informarPosicoes() {
        for (Jogador jogador : meusJogadores) {
            System.out.println("Jogador " + jogador.getMeuNumero() + " está na casa " + jogador.getCasaAtual());
        }
    }
}