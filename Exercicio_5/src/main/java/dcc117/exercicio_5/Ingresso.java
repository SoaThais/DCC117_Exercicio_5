package dcc117.exercicio_5;

public class Ingresso {
    private long numero;
    private int assento;
    private String tipo;
    private float valor;
    private String data;
    private Sessao sessao;
    
    public Ingresso(long numero, int assento, String tipo, float valor, String data) {
        this.numero = numero;
        this.assento = assento;
        this.tipo = tipo;
        this.valor = valor;
        this.data = data;
    }
    public Sessao getSessao() {
        return sessao;
    }
    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
    public long getNumero() {
        return numero;
    }
    public void setNumero(long numero) {
        this.numero = numero;
    }
    public int getAssento() {
        return assento;
    }
    public void setAssento(int assento) {
        this.assento = assento;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public void ImprimirIngresso() {
        System.out.println("Valor: " + valor);
        System.out.println("Data: " + data);
        System.out.println("Tipo: " + tipo);
        System.out.println("Assento: " + assento);
        System.out.println("Filme: " + sessao.getFilme().getTitulo());
        System.out.println("Sala: " + sessao.getSala().getNumeroSala());
    }
}
