public class Merge extends Sort {

    public Merge() {
        super();
    }

    public void MergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int meio = (inicio + fim) / 2;
            MergeSort(vetor, inicio, meio);
            MergeSort(vetor, meio + 1, fim);
            Intercala(vetor, inicio, meio, fim);
        }
    }

    public void Intercala(int[] vetor, int p, int q, int r) {
        int helper[] = new int[vetor.length];
        for (int k = p; k <= r; k++) {
            helper[k] = vetor[k];
            incrementaTrocas();
        }
        int i = p;
        int j = q + 1;
        for (int k = p; k <= r; k++) {
            incrementaComparacoes();
            if (i > q) {
                vetor[k] = helper[j++];
                incrementaTrocas();
            } 
            else incrementaComparacoes(); 
            if (j > r) {
                vetor[k] = helper[i++];
                incrementaTrocas();
            } 
            else incrementaComparacoes(); 
            if (helper[i] < helper[j]) {
                vetor[k] = helper[i++];
                incrementaTrocas();
            } else {
                vetor[k] = helper[j++];
                incrementaTrocas();
            }
        }
    }
    
    @Override
    public void Ordenar(int[] vetor) {
        MergeSort(vetor, 0, vetor.length - 1);
    }
}