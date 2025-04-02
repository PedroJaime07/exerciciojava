package ExercicioIntrodutorio;/*
Exercício: Tabuleiro de Jogo da Velha
Crie um array bidimensional 3x3 para representar um tabuleiro de Jogo da Velha (ou Tic-Tac-Toe). Inicialize o tabuleiro com espaços vazios (" "), e então preencha alguns espaços com "X" e "O" para representar um jogo em andamento.

Requisitos:
1. Crie um array 3x3 de Strings.
2. Inicialize o tabuleiro com espaços vazios.
3. Modifique algumas células do tabuleiro com "X" e "O".
4. Imprima o tabuleiro no formato de um jogo da velha.
 */

public class JogoDaVelhaArraysMulti {
    public static void main(String[] args) {
        String[][] matriz = {
                {"X", "O", "O"},
                {"O", "X", "O"},
                {"O", "O", "X"}
        };
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }


    }



}
