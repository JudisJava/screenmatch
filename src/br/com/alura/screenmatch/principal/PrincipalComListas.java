package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 2023);
        Filme outroFilme = new Filme("Avatar", 2023);
        var filme2 = new Filme("Dogville", 2003);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(lost);
        for (Titulo item: listaDeFilmes) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
            System.out.println("Classificação " + filme.getClassificacao());
            }
        }

    }
}
