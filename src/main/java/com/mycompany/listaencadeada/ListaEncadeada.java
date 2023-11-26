/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaencadeada;
import java.util.LinkedList;
/**
 *
 * @author Nyta
 */
public class ListaEncadeada {

    public static void main(String[] args) {
        int[] vetor = new int[1000];
        LinkedList<Integer> lista = new LinkedList<>();

        preencherVetorAleatorio(vetor);

        System.out.println("Vetor gerado:");
        imprimirVetor(vetor);

        preencherListaOrdenada(lista, vetor);

        System.out.println("\nLista em ordem crescente:");
        imprimirLista(lista);

        removerNumerosPrimos(lista);

        System.out.println("\nLista após remover números primos:");
        imprimirLista(lista);
    }
    
    private static void preencherVetorAleatorio(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 19999) - 9999;
        }
     }
    
    private static void imprimirVetor(int[] vetor) {
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void preencherListaOrdenada(LinkedList<Integer> lista, int[] vetor) {
        for (int num : vetor) {
            Funcoes.inserirNaListaOrdenada(lista, num);
        }
    }

    private static void imprimirLista(LinkedList<Integer> lista) {
        Funcoes.imprimirLista(lista);
    }

    private static void removerNumerosPrimos(LinkedList<Integer> lista) {
        Funcoes.removerNumerosPrimos(lista);
    }
}
