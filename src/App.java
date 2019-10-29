import java.util.Random;

public class App {
    public static void main(String[] args) {

        Random random = new Random();
        Bubble bubble = new Bubble();
        Insertion insertion = new Insertion();
        Merge merge = new Merge();
        Count count = new Count();
        double inicio, fim;
        System.out.println("------------------ Calculando vetor de 1000 posiçoes . . . ------------------");
        int[] vetor = new int[1000];
        int[] cobaia = new int[vetor.length];

        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = random.nextInt(1000000);
        }

        for (int i = 0; i <= 4; i++) {

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            bubble.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            bubble.setTempo(bubble.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            insertion.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            insertion.setTempo(insertion.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            merge.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            merge.setTempo(merge.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            count.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            count.setTempo(count.getTempo() + (fim - inicio));
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((bubble.getTempo() / 1000)), " segundos\n\n");
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((insertion.getTempo() / 1000)), " segundos\n\n");
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((merge.getTempo() / 1000))), " segundos\n\n");
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((count.getTempo() / 1000))), " segundos\n\n");

        bubble.zerar();
        insertion.zerar();
        merge.zerar();
        count.zerar();

        System.out.println("------------------ Calculando vetor de 5000 posiçoes . . . ------------------");
        vetor = new int[5000];
        cobaia = new int[vetor.length];
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = random.nextInt(1000000);
        }

        for (int i = 0; i <= 4; i++) {
            
            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            bubble.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            bubble.setTempo(bubble.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            insertion.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            insertion.setTempo(insertion.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            merge.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            merge.setTempo(merge.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            count.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            count.setTempo(count.getTempo() + (fim - inicio));
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((bubble.getTempo() / 1000)), " segundos\n\n");
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((insertion.getTempo() / 1000)), " segundos\n\n");
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((merge.getTempo() / 1000))), " segundos\n\n");
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((count.getTempo() / 1000))), " segundos\n\n");

        bubble.zerar();
        insertion.zerar();
        merge.zerar();
        count.zerar();

        System.out.println("------------------ Calculando vetor de 10000 posiçoes . . . ------------------");
        vetor = new int[10000];
        cobaia = new int[vetor.length];
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = random.nextInt(1000000);
        }

        for (int i = 0; i <= 4; i++) {

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            bubble.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            bubble.setTempo(bubble.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            insertion.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            insertion.setTempo(insertion.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            merge.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            merge.setTempo(merge.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            count.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            count.setTempo(count.getTempo() + (fim - inicio));
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((bubble.getTempo() / 1000)), " segundos\n\n");
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((insertion.getTempo() / 1000)), " segundos\n\n");
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((merge.getTempo() / 1000))), " segundos\n\n");
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((count.getTempo() / 1000))), " segundos\n\n");

        bubble.zerar();
        insertion.zerar();
        merge.zerar();
        count.zerar();

        System.out.println("------------------ Calculando vetor de 50000 posiçoes . . . ------------------");
        vetor = new int[50000];
        cobaia = new int[vetor.length];
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = random.nextInt(1000000);
        }

        for (int i = 0; i <= 4; i++) {
            
            

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            bubble.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            bubble.setTempo(bubble.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            insertion.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            insertion.setTempo(insertion.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            merge.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            merge.setTempo(merge.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            count.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            count.setTempo(count.getTempo() + (fim - inicio));
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((bubble.getTempo() / 1000)), " segundos\n\n");
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((insertion.getTempo() / 1000)), " segundos\n\n");
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((merge.getTempo() / 1000))), " segundos\n\n");
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((count.getTempo() / 1000))), " segundos\n\n");


        bubble.zerar();
        insertion.zerar();
        merge.zerar();
        count.zerar();

        System.out.println("------------------ Calculando vetor de 100000 posiçoes . . . ------------------");
        vetor = new int[100000];
        cobaia = new int[vetor.length];
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = random.nextInt(1000000);
        }

        for (int i = 0; i <= 4; i++) {
            
            

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            bubble.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            bubble.setTempo(bubble.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            insertion.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            insertion.setTempo(insertion.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            merge.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            merge.setTempo(merge.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            count.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            count.setTempo(count.getTempo() + (fim - inicio));
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((bubble.getTempo() / 1000)), " segundos\n\n");
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((insertion.getTempo() / 1000)), " segundos\n\n");
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((merge.getTempo() / 1000))), " segundos\n\n");
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((count.getTempo() / 1000))), " segundos\n\n");


        bubble.zerar();
        insertion.zerar();
        merge.zerar();
        count.zerar();

        System.out.println("------------------ Calculando vetor de 500000 posiçoes . . . ------------------");
        vetor = new int[500000];
        cobaia = new int[vetor.length];
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = random.nextInt(1000000);
        }

        for (int i = 0; i <= 4; i++) {
            
            
            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            bubble.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            bubble.setTempo(bubble.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            insertion.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            insertion.setTempo(insertion.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            merge.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            merge.setTempo(merge.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            count.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            count.setTempo(count.getTempo() + (fim - inicio));
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((bubble.getTempo() / 1000)), " segundos\n\n");
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((insertion.getTempo() / 1000)), " segundos\n\n");
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((merge.getTempo() / 1000))), " segundos\n\n");
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((count.getTempo() / 1000))), " segundos\n\n");


        bubble.zerar();
        insertion.zerar();
        merge.zerar();
        count.zerar();

        System.out.println("------------------ Calculando vetor de 1000000 posiçoes . . . ------------------");
        vetor = new int[1000000];
        cobaia = new int[vetor.length];
        for (int j = 0; j < vetor.length; j++) {
            vetor[j] = random.nextInt(1000000);
        }

        for (int i = 0; i <= 4; i++) {
            
            
            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            bubble.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            bubble.setTempo(bubble.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            insertion.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            insertion.setTempo(insertion.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            merge.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            merge.setTempo(merge.getTempo() + (fim - inicio));

            cobaia = vetor.clone();
            inicio = System.currentTimeMillis();
            count.Ordenar(cobaia);
            fim = System.currentTimeMillis();
            count.setTempo(count.getTempo() + (fim - inicio));
        }

        System.out.println("------------------ E S T A T I S T I C A S ------------------");
        System.out.println("BUBBLESORT:");
        System.out.println("Media das comparações = " + (bubble.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (bubble.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((bubble.getTempo() / 1000)), " segundos\n\n");
        System.out.println("INSERTIONSORT:");
        System.out.println("Media das comparações = " + (insertion.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (insertion.getTrocas()) / 5);
        System.out.printf("%.3f%s", ((insertion.getTempo() / 1000)), " segundos\n\n");
        System.out.println("MERGESORT:");
        System.out.println("Media das comparações = " + (merge.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (merge.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((merge.getTempo() / 1000))), " segundos\n\n");
        System.out.println("COUNTSORT:");
        System.out.println("Media das comparações = " + (count.getComparacoes()) / 5);
        System.out.println("Media das trocas = " + (count.getTrocas()) / 5);
        System.out.printf("%.3f%s", (((count.getTempo() / 1000))), " segundos\n\n");

    }

    public static void mostraVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}