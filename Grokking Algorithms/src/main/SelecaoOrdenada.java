package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelecaoOrdenada {
	public static void main(String[] args) {
		
		List<Integer> listaOriginal = new ArrayList<>(Arrays.asList(1, 21, 8, 0, 50, 0, 2)); //Arrays.asList - retorna uma lista que pode ser modificada, mas s� consigo mudar os valores das posi��es j� existentes.
		System.out.println(selecaoOrdenada(listaOriginal));
		
	}

	private static List<Integer> selecaoOrdenada(List<Integer> listaOriginal) {
		//Declara��o de uma lista que ser� a ordenada
		List<Integer> novaLista = new ArrayList<>();
		
		//vari�vel que ter� o mesmo tamanho do array original
		int tamanhoDaLista = listaOriginal.size();
		
		//Itera��o para encontrar o menor n�mero com o m�todo encontrandoMenor
		for (int i = 0; i < tamanhoDaLista; i++) {
			int menor = encontrandoMenor(listaOriginal);
			
			//Adicionando o menor numero � nova lista
			novaLista.add(listaOriginal.get(menor));
			
			//Removendo o menor numero do la�o da lista original para diminuir compara��o nos pr�ximos la�os
			listaOriginal.remove(menor);
		}
		
		return novaLista;
	}

	//compara os elementos do array e retorna o menor numero encontrado
	private static int encontrandoMenor(List<Integer> listaOriginal) {
		//numero na posi��o zero do array
		int menor = listaOriginal.get(0);
		//zero para definir o menor n�mero poss�vel que pode ter - nada menor que isso ter� na compara��o
		int menorIndice = 0;
		for (int i = 0; i < listaOriginal.size(); i++) {
			if (listaOriginal.get(i) < menor) {
				menor = listaOriginal.get(i);
				menorIndice = i;
			}
		}
		
		return menorIndice;
	}
}
