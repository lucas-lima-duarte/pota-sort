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

    public void Intercala(int[] A, int p, int q, int r) {
        int B[] = new int[A.length];
        for (int k = p; k <= r; k++) {
            B[k] = A[k];
            incrementaComparacoes();
        }
        int i = p;
        int j = q + 1;
        for (int k = p; k <= r; k++) {
            if (i > q) {
                A[k] = B[j++];
                incrementaComparacoes();
            } else if (j > r) {
                A[k] = B[i++];
                incrementaComparacoes();
            } else if (B[i] < B[j]) {
                A[k] = B[i++];
                incrementaComparacoes();
            } else {
                A[k] = B[j++];
                incrementaComparacoes();
            }
            incrementaComparacoes();
        }
    }
    
    @Override
    public void Ordenar(int[] vetor) {
        MergeSort(vetor, 0, vetor.length - 1);
    }
}