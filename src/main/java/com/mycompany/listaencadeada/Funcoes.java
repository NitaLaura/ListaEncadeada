/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaencadeada;
import java.util.LinkedList;
/**
 *
 * @author Nyta
 */
public class Funcoes {
    public static void inserirNaListaOrdenada(LinkedList<Integer> lista, int numero) {
        int index = 0;
        while (index < lista.size() && numero > lista.get(index)) {
            index++;
        }
        lista.add(index, numero);
    }

    public static void imprimirLista(LinkedList<Integer> lista) {
        for (int num : lista) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void removerNumerosPrimos(LinkedList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (ehPrimo(lista.get(i))) {
                lista.remove(i);
                i--;
            }
        }
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
