import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = null;
        String reset = "\u001B[0m";
        String azul = "\u001B[34m";

        while (true) {
            System.out.println(azul + "\n********* MENU *********" + reset);
            System.out.println(azul +"1 - Iniciar nova partida" + reset);
            System.out.println(azul +"2 - Executar jogada" + reset);
            System.out.println(azul +"3 - Informar posições" + reset);
            System.out.println(azul +"0 - Sair" + reset);
            System.out.print(azul +"Escolha uma opção: " + reset);
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Iniciar nova partida
                    System.out.print("Digite o número de casas do tabuleiro: ");
                    int numeroCasas = scanner.nextInt();
                    System.out.print("Digite o número de jogadores: ");
                    int numeroJogadores = scanner.nextInt();
                    jogo = new Jogo(numeroCasas, numeroJogadores);
                    System.out.println("Nova partida iniciada!");
                    break;
                case 2:
                    // Executar jogada
                    if (jogo != null) {
                        jogo.proximaJogada();
                    } else {
                        System.out.println("Nenhuma partida iniciada. Por favor, inicie uma nova partida.");
                    }
                    break;
                case 3:
                    // Informar posições
                    if (jogo != null) {
                        jogo.informarPosicoes();
                    } else {
                        System.out.println("Nenhuma partida iniciada. Por favor, inicie uma nova partida.");
                    }
                    break;
                case 0:
                    // Sair do jogo
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    // Opção inválida
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}