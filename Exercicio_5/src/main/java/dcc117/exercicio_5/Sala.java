package dcc117.exercicio_5;

import java.util.List;

public class Sala {
    private int numeroSala;
    private String nomeSala;
    private int Capacidade;
    private List<Sala> salas;

    public Sala(int numeroSala, String nomeSala, int Capacidade, List<Sala> salas) {
        this.numeroSala = numeroSala;
        this.nomeSala = nomeSala;
        this.Capacidade = Capacidade;
        this.salas = salas;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public int getCapacidade() {
        return Capacidade;
    }

    public void setCapacidade(int Capacidade) {
        this.Capacidade = Capacidade;
    }    
}
