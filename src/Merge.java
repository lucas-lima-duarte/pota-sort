public class Merge extends Sort {

    public Merge() {
        super();
    }

    public void merge(int[] vetor, int low, int middle, int high) {
        int[] helper = new int[vetor.length];
        for (int i = low; i <= high; i++) {
            helper[i] = vetor[i];
            incrementaTrocas();
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            incrementaComparacoes();
            ;
            incrementaTrocas();
            ;
            if (helper[helperLeft] <= helper[helperRight]) {
                vetor[current] = helper[helperLeft];
                helperLeft++;
            } else {
                vetor[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }
        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            vetor[current + i] = helper[helperLeft + i];
        }

    }

    public void mergeSort(int[] vetor, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(vetor, low, middle);
            mergeSort(vetor, middle + 1, high);
            merge(vetor, low, middle, high);
        }
    }

    @Override
    public void Ordenar(int[] vetor) {
        mergeSort(vetor, 0, vetor.length - 1);
    }
}