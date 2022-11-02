package dcc117.exercicio_5;

import java.util.List;

public class Genero {
    private String name;
    private List<Filme> filmes;

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addFilme(Filme filme) {
        filmes.add(filme);
    }

}
