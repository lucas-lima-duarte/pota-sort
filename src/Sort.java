public class Sort {

    private int trocas;
    private int comparacoes;
    //*** Construtor ***
    public Sort() {
        this.trocas = 0;
        this.comparacoes = 0;
    }
    //*** Gets ***
    public int getComparacoes() {
        return comparacoes;
    }

    public int getTrocas() {
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

    public void mostraVetor(int [] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

    public void Ordenar(int [] vetor){}
    
}