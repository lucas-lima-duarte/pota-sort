public class Insertion extends Sort {

    public Insertion(){
        super();
    }
    
    @Override
    public void Ordenar(int [] vetor){
        for (int i = 1; i < vetor.length ; i++) {
            int key = vetor[i];
            int j = (i - 1);                        
            while (j >= 0 && key < vetor[j]) {
                incrementaComparacoes();
                TrocaElementos((j+1), j, vetor);
                j--;
            }
        }
    }
}