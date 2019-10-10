
public class App {
    public static void main(String[] args) {

        int [] vetorTeste = {1,2,3,4,6,5};
        BubbleSort b1 = new BubbleSort();
        b1.Ordenar(vetorTeste);
        for (int e : vetorTeste) {
            System.out.println(e);
        }

     System.out.println(b1.getContador());
    }
}