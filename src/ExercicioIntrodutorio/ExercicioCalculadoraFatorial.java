package ExercicioIntrodutorio;/*
Exercício: Calculadora de Fatorial
Enunciado:
Crie um programa em Java que calcule o fatorial de um número inteiro positivo fornecido pelo usuário.
O fatorial de um número n é o produto de todos os números inteiros de 1 até n.
Requisitos:
1. Solicite ao usuário um número inteiro positivo.
2. Calcule o fatorial desse número.
3. Caso o usuário digite um número negativo, informe que o fatorial não existe para números negativos e solicite que ele digite um número válido.
4. O programa deve continuar pedindo números até que o usuário deseje sair. (Exemplo: "Deseja continuar? (sim/não)")
 */

import java.util.Scanner;

public class ExercicioCalculadoraFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            long fatorial = 1;
            System.out.println("Digite um número inteiro positivo:");
            int numero = scanner.nextInt();
            scanner.nextLine();
            if (numero > 0) {
                for (int i = 1; i <= numero; i++) {
                    fatorial = fatorial * i;
                }
            } else {
                System.out.println("O fatorial para números negativos não existe, digite outro número sendo inteiro positivo");
            }
            System.out.println(fatorial);
            System.out.println("Deseja continuar? (sim/não)");
            String continuar = scanner.nextLine();
            if (continuar.equalsIgnoreCase("nao")) {
                System.out.println("Programa encerrado");
                break;
            }
        }

    }
}
