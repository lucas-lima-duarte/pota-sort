public class App {
    public static void main(String[] args) {
        int[] vetor = { 10, 9, 7, 8, 5, 2, 1 };
        Insertion i = new Insertion();

        i.Ordenar(vetor);

        i.mostraVetor(vetor);

        System.out.println(i.getComparacoes());
        System.out.println(i.getTrocas());

    }

}