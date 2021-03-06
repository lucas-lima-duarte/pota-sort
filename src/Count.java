public class Count extends Sort {

    public Count() {
        super();
    }

    public int indiceMaiorValor(int[] vetor) {
        int m = 0;
        for (int i = 0; i < vetor.length; i++) {
            incrementaComparacoes();
            if (vetor[i] > vetor[m]) {
                m = i;
            }
        }
        return m;
    }

    public void countSort(int vetor[]) {
        int maior = indiceMaiorValor(vetor);// retorna o indice de maior valor
        int[] aux = new int[vetor[maior] + 1];// cria um vetor auxiliar com o tamanho do valor do maior elemento+1
        int[] resposta = new int[vetor.length];
        for (int i = 0; i < vetor.length; i++) {// percorre vetor e conta o numero de ocorrencias correspondente em aux
                                                // . "quantos X tem no vetor?" e incrementa aux[X].
            aux[vetor[i]] += 1;
            incrementaTrocas();
            incrementaComparacoes();
        }
        incrementaComparacoes();
        for (int i = 1; i < aux.length; i++) {//
            aux[i] += aux[i - 1];
            incrementaTrocas();
        }
        for (int i = 0; i < vetor.length; i++) {
            resposta[aux[vetor[i]]-- - 1] = vetor[i];
            incrementaTrocas();
        }
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = resposta[i];
            incrementaTrocas();
        }
    }

    @Override
    public void Ordenar(int[] vetor) {
        countSort(vetor);
    }
}