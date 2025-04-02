package ExercicioIntrodutorio;

import java.util.Scanner;

public class ExercicioNumeroPrimo {
    /*
    Exercício: Verificação de Número Primo
Objetivo: Criar um programa em Java que verifique se um número informado pelo usuário é primo ou não.

Requisitos:
1. O programa deve solicitar ao usuário um número inteiro.
2. O programa deve verificar se esse número é primo. Um número primo é aquele maior que 1 que só pode ser dividido por 1 e por ele mesmo.
3. O programa deve informar se o número é primo ou não.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String opcao = "";
        while (!opcao.equalsIgnoreCase("sair")) {
            System.out.println("Vamos verficar se um número é primo:");
            System.out.println("Digite um número inteiro ou 'sair' para sair");
            opcao = input.nextLine();
            if (opcao.equalsIgnoreCase("sair")) {
                break;
            }
            try {
                int num = Integer.parseInt(opcao);
                if (num > 1 && num % 2 != 0) {
                    System.out.println("O número " + num + " é primo");
                } else if (num == 2) {
                    System.out.println("O número " + num + " é primo");
                } else {
                    System.out.println("O número " + num + " não é primo");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida, tente um número inteiro");
            }

        }


    }
}
