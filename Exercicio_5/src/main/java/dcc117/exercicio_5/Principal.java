package dcc117.exercicio_5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Principal {
    private Filme filme;
    private Ator ator1;
    private Ator ator2;
    private Direcao direcao;
    private Producao produtor1;
    private Producao produtor2;
    private Genero genero;
    private Sala sala;
    private Ingresso meia;
    private Ingresso inteira;
    private Sessao sessao;
    public static void main(String[] args) throws ParseException {
        new Principal();
    }

    public Principal() throws ParseException {
        List<Sessao> sessoes = new ArrayList<>();
        filme = new Filme(
            "Homem aranha no metaverso", 2025, "Sony", "Republica dominicana", 
            "3 horas e meia", null);
        sala = new Sala(4, "Sala da Thais", 87, null);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy",  Locale.ENGLISH);
        Date date = formatter.parse("7-Jun-2013");
        sessao = new Sessao(date, "4 horas", "MG", filme, sala);
        sessoes.add(sessao);
        filme.setSessoes(sessoes);
        Long i = 555L;
        meia = new Ingresso(i, 67, "Meia", 27.90F, "27/09/2019");
        inteira = new Ingresso(i, 67, "Inteira", 55.80F, "27/09/2019");
        meia.setSessao(sessao);
        inteira.setSessao(sessao);
        sessao.exibirSessao();
        sessao.venderIngressos(meia);
        sessao.venderIngressos(inteira);
        meia.ImprimirIngresso();
        inteira.ImprimirIngresso();
        sessao.exibirSessao();
    }
}
