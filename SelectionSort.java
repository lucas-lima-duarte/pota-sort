
public class SelectionSort {

  // *** Atributos
  private int contador;

  // *** Construtor
  public BubbleSort(){
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

    for (int i = primeiro; i < (ultimo ); i++) {
        int minIndex = i;
        for (int j = i + 1; j <= ultimo ; j++) {
            Incrementa();
            if (vetor[j] < vetor[minIndex]) {
                minIndex = j;
            }
        }
        TrocaElementos(i, minIndex, vetor);
    }
      
}


}