import java.util.Random;

public class App {
    public static void main(String[] args) {

        Bubble bubble = new Bubble();
        Insertion insertion = new Insertion();
        Merge merge = new Merge();
        Count count = new Count();

        System.out.println("Ola");

        System.out.println("------------------ Calculando vetor de 1000 posiçoes . . . ------------------");
        int[] vetor = new int[1000];
        int[] cobaia = new int[vetor.length];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < vetor.length; j++) {
                vetor[j] = j;
            }
            embaralhar(vetor);

            cobaia = vetor.clone();
            bubble.Ordenar(cobaia);

            cobaia = vetor.clone();
            insertion.Ordenar(cobaia);

            cobaia = vetor.clone();
            merge.Ordenar(cobaia);

            cobaia = vetor.clone();
            count.Ordenar(cobaia);
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);



        System.out.println("------------------ Calculando vetor de 5000 posiçoes . . . ------------------");
        vetor = new int[5000];
        cobaia = new int[vetor.length];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < vetor.length; j++) {
                vetor[j] = j;
            }
            embaralhar(vetor);
            cobaia = vetor;
            bubble.Ordenar(cobaia);
            cobaia = vetor;
            insertion.Ordenar(cobaia);
            cobaia = vetor;
            merge.Ordenar(cobaia);
            cobaia = vetor;
            count.Ordenar(cobaia);
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);


        System.out.println("------------------ Calculando vetor de 10000 posiçoes . . . ------------------");
        vetor = new int[10000];
        cobaia = new int[vetor.length];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < vetor.length; j++) {
                vetor[j] = j;
            }
            embaralhar(vetor);
            cobaia = vetor;
            bubble.Ordenar(cobaia);
            cobaia = vetor;
            insertion.Ordenar(cobaia);
            cobaia = vetor;
            merge.Ordenar(cobaia);
            cobaia = vetor;
            count.Ordenar(cobaia);
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);


        System.out.println("------------------ Calculando vetor de 50000 posiçoes . . . ------------------");
        vetor = new int[50000];
        cobaia = new int[vetor.length];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < vetor.length; j++) {
                vetor[j] = j;
            }
            embaralhar(vetor);
            cobaia = vetor;
            bubble.Ordenar(cobaia);
            cobaia = vetor;
            insertion.Ordenar(cobaia);
            cobaia = vetor;
            merge.Ordenar(cobaia);
            cobaia = vetor;
            count.Ordenar(cobaia);
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);



        System.out.println("------------------ Calculando vetor de 100000 posiçoes . . . ------------------");
        vetor = new int[100000];
        cobaia = new int[vetor.length];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < vetor.length; j++) {
                vetor[j] = j;
            }
            embaralhar(vetor);
            cobaia = vetor;
            bubble.Ordenar(cobaia);
            cobaia = vetor;
            insertion.Ordenar(cobaia);
            cobaia = vetor;
            merge.Ordenar(cobaia);
            cobaia = vetor;
            count.Ordenar(cobaia);
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);


        System.out.println("------------------ Calculando vetor de 500000 posiçoes . . . ------------------");
        vetor = new int[500000];
        cobaia = new int[vetor.length];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < vetor.length; j++) {
                vetor[j] = j;
            }
            embaralhar(vetor);
            cobaia = vetor;
            bubble.Ordenar(cobaia);
            cobaia = vetor;
            insertion.Ordenar(cobaia);
            cobaia = vetor;
            merge.Ordenar(cobaia);
            cobaia = vetor;
            count.Ordenar(cobaia);
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);


        System.out.println("------------------ Calculando vetor de 1000000 posiçoes . . . ------------------");
        vetor = new int[1000000];
        cobaia = new int[vetor.length];

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < vetor.length; j++) {
                vetor[j] = j;
            }
            embaralhar(vetor);
            cobaia = vetor;
            bubble.Ordenar(cobaia);
            cobaia = vetor;
            insertion.Ordenar(cobaia);
            cobaia = vetor;
            merge.Ordenar(cobaia);
            cobaia = vetor;
            count.Ordenar(cobaia);
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);

    }

    public static void embaralhar(int[] vetor) {

        Random random = new Random();

        for (int i = 0; i < (vetor.length - 1); i++) {

            // sorteia um índice
            int j = random.nextInt(vetor.length);

            // troca o conteúdo dos índices i e j do vetor
            int temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
        }

    }

    public static void mostraVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }

}