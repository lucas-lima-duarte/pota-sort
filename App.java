
public class App {
    public static void main(String[] args) {

        int [] vetorTeste = {1,2,3,4,5,6,9,8};
        SelectionSort s1 = new SelectionSort();
        s1.Ordenar(vetorTeste);
        for (int e : vetorTeste) {
            System.out.println(e);
            System.out.println("Fodase");
        }

     System.out.println("Contabilizadas " + s1.getContador() + " comparação(ções)");
    }
}