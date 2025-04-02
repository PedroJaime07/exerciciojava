package Classes.Test;

import Classes.Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();

        funcionario.nome = "Pedro Jaime";
        funcionario.cargo = "Gerente";
        funcionario.salario = 2500;

        funcionario1.nome = "Gabriel";
        funcionario1.cargo = "Gerente";
        funcionario1.salario = 2500;

        funcionario2.nome = "Carlos Roberto";
        funcionario2.cargo = "Diretor";
        funcionario2.salario = 5000;

        System.out.println("O funcionário " + funcionario.nome + " com cargo de " + funcionario.cargo + " recebe sálario de R$" + funcionario.salario);
        System.out.println("O funcionário " + funcionario1.nome + " com cargo de " + funcionario1.cargo + " recebe sálario de R$" + funcionario1.salario);
        System.out.println("O funcionário " + funcionario2.nome + " com cargo de " + funcionario2.cargo + " recebe sálario de R$" + funcionario2.salario);
    }
}
