package ExercicioIntrodutorio;

import java.util.Scanner;

public class ExercicioCalculadoraSimples {
    /* Exercício: Calculadora Simples
    Crie um programa em Java que:
    1. Peça ao usuário para digitar dois números
    2. Pergunte qual operação deseja realizar(+,-,*,/)
    3. Realize a operação escolhida e exiba o resultado.
        Dicas:
    . Use a classe Scanner para receber a entrada do usuário.
    . Use if-else ou switch para verificar a operação escolhida.
    . Lembre-se de tratar a divisão por zero!
        Exemplo de saída esperada:
        Digite o primeiro numero: 10
        Digite o segundo número: 5
        Escolha a operação (+, -, *, /): *
        Resultado: 50
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int num1 = input.nextInt();
        System.out.println("Digite o segundo número:");
        int num2 = input.nextInt();
        System.out.println("Qual operação deseja realizar: (+,-,*,/) ");
        String operacao = input.next();
        int resultado;
        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado= " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado= " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado= " + resultado);
                break;
            case "/":
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Erro: Divisão por zero");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado= " + resultado);
                }
                break;
            default:
                System.out.println("Input incorreto");

        }
    }

}
