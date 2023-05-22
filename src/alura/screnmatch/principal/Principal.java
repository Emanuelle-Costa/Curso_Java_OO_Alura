package alura.screnmatch.principal;

import alura.screnmatch.calculos.CalculadoraDeTempo;
import alura.screnmatch.calculos.FiltroRecomendacao;
import alura.screnmatch.modelos.Episodio;
import alura.screnmatch.modelos.Serie;
import alura.screnmatch.modelos.Filme;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7);
        meuFilme.avalia(9);
        meuFilme.avalia(8.5);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost",2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        Filme filmeDaManu = new Filme("Guardiões da Galáxia vol.3", 2023);
        filmeDaManu.setDuracaoEmMinutos(200);
        filmeDaManu.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDaManu);
        listaDeFilmes.add(meuFilme);
        System.out.println(listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes.size());

        System.out.println(listaDeFilmes);
    }
}
