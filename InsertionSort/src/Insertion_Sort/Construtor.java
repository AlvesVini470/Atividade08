package Insertion_Sort;

public class Construtor {
    public static void main(String[] args) {
        Modelo modelo = new Modelo();
        modelo.getVetor()[0] = 30;
        modelo.getVetor()[1] = 20;
        modelo.getVetor()[2] = 10;
        modelo.getVetor()[3] = 40;
        modelo.getVetor()[4] = 50;
        modelo.getVetor()[5] = 90;
        modelo.getVetor()[6] = 80;
        modelo.getVetor()[7] = 60;
        modelo.getVetor()[8] = 70;
        modelo.getVetor()[9] = 100;

        insertionSort(modelo.getVetor());

        Visao visao = new Visao();
        visao.exibirVetorOrdenado(modelo.getVetor());
    }

    public static void insertionSort(int[] vetor) {
        for (int j = 1; j < vetor.length; j++) {
            int key = vetor[j];
            int i = j - 1;
            while ((i >= 0) && (vetor[i] > key)) {
                vetor[i + 1] = vetor[i];
                i--;
            }
            vetor[i + 1] = key;
        }
    }
}