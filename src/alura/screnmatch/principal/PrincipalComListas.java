package alura.screnmatch.principal;

import alura.screnmatch.modelos.Filme;
import alura.screnmatch.modelos.Serie;
import alura.screnmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(7);
        Filme filmeDaManu = new Filme("Guardiões da Galáxia vol.3", 2023);
        filmeDaManu.avalia(10);
        Filme novo = new Filme("Avatar", 2003);
        novo.avalia(9);
        Serie lost = new Serie("Lost", 2000);
        lost.avalia(8);


        List<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(filmeDaManu);
        lista.add(novo);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println("Nome: " + item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        Collections.sort(lista);
        System.out.println("Lista de titulos ordenados: ");
        System.out.println(lista);


        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}