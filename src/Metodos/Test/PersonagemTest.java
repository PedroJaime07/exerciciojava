package Metodos.Test;

import Metodos.Dominio.Personagem;

public class PersonagemTest {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        personagem1.nome = "Hércules";
        personagem1.nivel = 2;
        personagem1.forca = 16;

        personagem2.nome = "Goku";
        personagem2.nivel = 10;
        personagem2.forca = 100;
        personagem2.habilidade = "";
        personagem2.danoHabilidade = personagem2.dano();

        personagem1.mostrarStatus();
        personagem2.mostrarStatus();
        personagem2.atacar(personagem1.nome, personagem2.habilidade);
    }
}
