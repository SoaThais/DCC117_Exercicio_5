package dcc117.exercicio_5;

import java.util.List;

public class Filme {
    private String titulo;
    private int ano;
    private String produtora;
    private String paisOrigem;
    private String duracao;
    private List <Sessao> sessoes;
    private Genero genero;
    private List<Papel> papeis;

    public List<Papel> getPapeis() {
        return papeis;
    }

    public void setPapeis(List<Papel> papeis) {
        this.papeis = papeis;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Filme(String titulo, int ano, String produtora, String paisOrigem, String duracao, List<Sessao> sessoes) {
        this.titulo = titulo;
        this.ano = ano;
        this.produtora = produtora;
        this.paisOrigem = paisOrigem;
        this.duracao = duracao;
        this.sessoes = sessoes;
    }
    
    public List <Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List <Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getProdutora() {
        return produtora;
    }

    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public void addPapel(Papel papel) {
        papeis.add(papel);
    }
}
