package ExercicioIntrodutorio;

import java.util.Scanner;

public class CalcularJuros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do emprestimo");
        float valorEmprestimo = scanner.nextFloat();

        System.out.println("Quantas parcelas:");
        int parcelas = scanner.nextInt();

        float[] valor = new float[parcelas];


        System.out.println("Digite os valores das parcelas, pode usar virgula");
        for (int i = 0; i < valor.length; i++) {
            System.out.println((i + 1) + ": ");
            valor[i] = scanner.nextFloat();

        }

        float soma = 0;
        for (float i : valor) {
            soma += i;
        }

        System.out.println("Valor do Emprestimo R$" + valorEmprestimo);
        System.out.println("Valor pago " + soma);
        System.out.println("Juros: R$" + (soma - valorEmprestimo));
    }
}
