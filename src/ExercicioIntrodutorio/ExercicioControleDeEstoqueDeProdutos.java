package ExercicioIntrodutorio;/*
Exercício: Controle de Estoque de Produtos
Descrição:
Você tem um array de preços de produtos em estoque.
O objetivo é percorrer esse array e, para cada produto, mostrar se ele está acima ou abaixo de um preço limite.

1. Crie um array de preços de produtos (use valores aleatórios).
2. Crie uma variável que armazene o preço limite para comparação.
3. Use um loop for para percorrer o array e, para cada preço, imprima se ele é acima ou abaixo do limite.

Requisitos:
Use um array de 5 preços de produtos.
O preço limite pode ser qualquer valor (por exemplo, 50).
Se o preço for maior ou igual ao limite, imprima "Produto caro".
Se o preço for menor que o limite, imprima "Produto barato".
 */

public class ExercicioControleDeEstoqueDeProdutos {
    public static void main(String[] args) {
        double[] precos = {15.50, 64, 68.1, 30.94, 50};
        double precoLimite = 50.00;
        for (int i = 0; i < precos.length; i++) {
            if (precos[i] >= precoLimite) {
                System.out.println("Produto caro");
            }
            else {
                System.out.println("Produto barato");
            }
        }

    }
}
