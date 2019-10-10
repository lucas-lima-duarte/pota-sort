/**
 * Bubble_Sort
 */
public class InsertionSort {
    // *** Atributos
    private int contador;

    // *** Construtor
    public InsertionSort(){
        contador = 0;
    }
    // *** Get
    public int getContador() {
        return contador;
    }

    // *** Métodos
    private void Incrementa(){
        contador++;
    }

    private void TrocaElementos(int p1, int p2, int [] vetor) {

        int t = vetor[p1];
        vetor[p1] = vetor[p2];
        vetor[p2] = t;

    }

    public void Ordenar(int [] vetor){

        int primeiro = 0;
        int ultimo = (vetor.length - 1);

        for (int i = (ultimo - 1); i >= primeiro; i--) {
            for (int j = primeiro; j <= i; j++) {
                Incrementa();
                if (vetor[j] > vetor[j+1]) {
                    TrocaElementos(j, (j+1), vetor);
                }
            }
        }
    }
}