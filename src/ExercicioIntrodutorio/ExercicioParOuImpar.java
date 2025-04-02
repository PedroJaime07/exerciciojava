package ExercicioIntrodutorio;

import java.util.Scanner;

/*
Exercício: Par ou Ímpar
Enunciado:
Crie um programa em Java que pergunte ao usuário um número inteiro
e informe se ele é par ou ímpar.

Além disso, o programa deve perguntar ao usuário se ele deseja continuar verificando outros números.
O programa só deve parar quando o usuário digitar "não" ou "N".
 */

public class ExercicioParOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite um número inteiro:");
            int numero = scanner.nextInt();
            scanner.nextLine();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par");
            } else {
                System.out.println("O número " + numero + " é ímpar");
            }
            System.out.println("Deseja continuar? (sim/não):");
            String continuar = scanner.nextLine();
            continuar = continuar.replaceAll("ã", "a");

            if (continuar.equalsIgnoreCase("nao")) {
                System.out.println("Programa encerrado");
                break;
            }

        }

    }
}
