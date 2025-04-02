package Metodos.Dominio;

import java.util.Random;

public class Personagem {
    public String nome;
    public int nivel;
    public int forca;
    public int danoHabilidade;
    public String habilidade;

    public void mostrarStatus() {
        System.out.println("Personagem: " + nome + " (lvl " + nivel + ")" + " com " + forca + " de força");
    }

    public int dano() {
        Random dado = new Random();
        // nextInt começa com 0
        int dado20faces = 1 + dado.nextInt(19);
        int dano = forca + dado20faces;
        return dano;
    }

    public void atacar(String alvo, String habilidade) {
        //na String habilidade se "" o tamanho (.length) é igual a 0
        if (habilidade.length() == 0) {
            System.out.println(nome + " atacou " + alvo + " e causou " + forca + " de dano");
        } else {
            System.out.println(nome + " atacou com " + habilidade + " " + alvo + " e causou " + danoHabilidade + " de dano");
        }
    }


}
