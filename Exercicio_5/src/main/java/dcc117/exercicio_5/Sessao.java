package dcc117.exercicio_5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Sessao {
    private Date dataSessao;
    private String horaSessao;
    private int ingressosSessao;
    private int ingressosComprados;
    private int ingressosRestantes;
    private String estadoSessao;
    private Filme filme;
    private Sala sala;

    public Sessao(Date dataSessao, String horaSessao, String estadoSessao, Filme filme, Sala sala) {
        this.dataSessao = dataSessao;
        this.horaSessao = horaSessao;
        this.setEstadoSessao(estadoSessao);
        this.filme = filme;
        this.sala = sala;
        this.ingressosSessao = sala.getCapacidade();
        this.ingressosRestantes = sala.getCapacidade();
        this.ingressosComprados = 0;
    }

    public void exibirSessao(){
        System.out.println("Sessao");
        System.out.println(" Data: " + dataSessao);
        System.out.println(" Hora: " + horaSessao);
        System.out.println(" Ingressos: " + ingressosSessao);
        System.out.println(" Ingressos Comprados: " + ingressosComprados);
        System.out.println(" Ingressos Restantes: " + ingressosRestantes);
        System.out.println(" Estado: " + estadoSessao);
        System.out.println(" Filme: ");
        System.out.println("    Titulo: " + filme.getTitulo());
        System.out.println("    Duracao: " + filme.getDuracao());
        System.out.println("    Produtora: " + filme.getProdutora());
        System.out.println("    Pais de Origem: " + filme.getPaisOrigem());
        System.out.println("    Ano: " + filme.getAno());
        System.out.println(" Sala: ");
        System.out.println("    Numero: " + sala.getNumeroSala());
        System.out.println("    Nome: " + sala.getNomeSala());
        System.out.println("    Capacidade: " + sala.getCapacidade());
        System.out.println("");

    }
    
    public void venderIngressos(Ingresso ingresso) {
        if (this.getIngressosRestantes() > 0){
            Date dataAtual = new Date();
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            String dataFormatada = dateFormat.format(dataAtual);
            ingresso.setDataHoraCompra(dataFormatada);
            this.setIngressosComprados(this.getIngressosComprados() + 1);
            this.setIngressosRestantes(this.getIngressosRestantes() - 1);
        }
        else {
            System.out.println("Nao ha mais ingressos disponiveis");
        }
    }

     public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
    
    public Date getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(Date dataSessao) {
        this.dataSessao = dataSessao;
    }

    public String getHoraSessao() {
        return horaSessao;
    }

    public void setHoraSessao(String horaSessao) {
        this.horaSessao = horaSessao;
    }

    public int getIngressosSessao() {
        return ingressosSessao;
    }

    public void setIngressosSessao(int ingressosSessao) {
        this.ingressosSessao = ingressosSessao;
    }

    public int getIngressosComprados() {
        return ingressosComprados;
    }

    public void setIngressosComprados(int ingressosComprados) {
        this.ingressosComprados = ingressosComprados;
    }

    public int getIngressosRestantes() {
        return ingressosRestantes;
    }

    public void setIngressosRestantes(int ingressosRestantes) {
        this.ingressosRestantes = ingressosRestantes;
    }

    public String getEstadoSessao() {
        return estadoSessao;
    }

    public void setEstadoSessao(String estadoSessao) {
        if (estadoSessao.equals("Aberta") || estadoSessao.equals("Em Andamento") || estadoSessao.equals("Encerrada"))
            this.estadoSessao = estadoSessao;
        else 
            System.out.println("Estado invalido");
    }
}
