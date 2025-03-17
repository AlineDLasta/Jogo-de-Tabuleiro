public class Dado {
    private int numeroAtual;

    public Dado() {
        this.numeroAtual = 1; // Inicializa o dado com o valor 1
    }

    public int rolar() {
        this.numeroAtual = (int) (Math.random() * 6) + 1; // Gera um número aleatório entre 1 e 6
        return this.numeroAtual;
    }

    public int getNumeroAtual() {
        return this.numeroAtual;
    }
}