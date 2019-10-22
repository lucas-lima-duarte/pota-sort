public class App {
    public static void main(String[] args) {
        int [] vetor = { 10, 9, 7, 8, 5, 2, 1 };        

        Merge teste = new Merge();

        teste.Ordenar(vetor, 0, (vetor.length - 1));;

        teste.mostraVetor(vetor);

        System.out.println(teste.getComparacoes());

        


    }

}