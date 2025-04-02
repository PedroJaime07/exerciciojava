package ExercicioIntrodutorio;/*
Exercício: Calculadora de Média
Enunciado:
Crie um programa em Java que calcule a média de 3 notas de um aluno
e informe se o aluno foi aprovado ou reprovado.
Para aprovação, a média deve ser maior ou igual a 7.0.
 */

import java.util.Scanner;

public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite nota 1");
        double nota1 = scanner.nextDouble();
        System.out.println("Digite nota 2");
        double nota2 = scanner.nextDouble();
        System.out.println("Digite nota 3");
        double nota3 = scanner.nextDouble();
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nota 1: " + nota1);
        System.out.println("Nota 2: " + nota2);
        System.out.println("Nota 3: " + nota3);
        System.out.println("Média: " + String.format("%.2f", media));

        if (media >= 7) {
            System.out.println("Status: Aprovado");
        } else {
            System.out.println("Status: Reprovado");
        }

    }
}
