public class Jogador {
    private int casaAtual;
    private int meuNumero;

    public Jogador(int meuNumero) {
        this.casaAtual = 0; // Inicia na casa 0
        this.meuNumero = meuNumero;
    }

    public void jogar(Dado dado, Tabuleiro tabuleiro) {
        // Rola o dado para este jogador
        int passos = dado.rolar();
        this.casaAtual += passos;

        // Verifica se o jogador ultrapassou o número de casas
        if (this.casaAtual >= tabuleiro.getNumeroCasas()) {
            this.casaAtual = tabuleiro.getNumeroCasas() - 1;
        }

        System.out.println("Jogador " + this.meuNumero + " andou " + passos + " casas e está na casa " + this.casaAtual);
    }

    public int getCasaAtual() {
        return this.casaAtual;
    }

    public int getMeuNumero() {
        return this.meuNumero;
    }
}