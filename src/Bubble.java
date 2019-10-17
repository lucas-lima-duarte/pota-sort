public class Bubble extends Sort {

    public Bubble() {
        super();
    }
    
    @Override
    public void Ordenar(int[] v) {
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < (v.length - 1); j++) {
                incrementaComparacoes();
                if (v[j + 1] < v[j]) {
                    TrocaElementos((j), (j + 1), v);
                }
            }
        }
    }
}