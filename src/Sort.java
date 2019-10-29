public class Sort {

    private long trocas;
    private long comparacoes;
    private double tempo;
    //*** Construtor ***
    public Sort() {
        this.trocas = 0;
        this.comparacoes = 0;
    }
    //*** Gets & Sets *** 
    public double getTempo() {
        return tempo;
    }

    public long getComparacoes() {
        return comparacoes;
    }

    public long getTrocas() {
        return trocas;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    //*** Metodos ***
    public void TrocaElementos(int p1, int p2, int [] vetor) {
        int t = vetor[p1];
        vetor[p1] = vetor[p2];
        vetor[p2] = t;
        incrementaTrocas();
    }

    public void incrementaTrocas(){
        trocas++;
    }

    public void incrementaComparacoes(){
        comparacoes++;
    }

    public void zerar(){
        this.comparacoes = 0;
        this.trocas = 0;
        this.tempo = 0;
    }

    public void Ordenar(int [] vetor){}
    
}