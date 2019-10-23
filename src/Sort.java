public class Sort {

    private long trocas;
    private long comparacoes;
    //*** Construtor ***
    public Sort() {
        this.trocas = 0;
        this.comparacoes = 0;
    }
    //*** Gets ***
    public long getComparacoes() {
        return comparacoes;
    }

    public long getTrocas() {
        return trocas;
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
    }

    public void Ordenar(int [] vetor){}
    
}