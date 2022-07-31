package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelecaoOrdenada {
	public static void main(String[] args) {
		
		List<Integer> listaOriginal = new ArrayList<>(Arrays.asList(1, 21, 8, 0, 50, 0, 2)); //Arrays.asList - retorna uma lista que pode ser modificada, mas só consigo mudar os valores das posições já existentes.
		System.out.println(selecaoOrdenada(listaOriginal));
		
	}

	private static List<Integer> selecaoOrdenada(List<Integer> listaOriginal) {
		//Declaração de uma lista que será a ordenada
		List<Integer> novaLista = new ArrayList<>();
		
		//variável que terá o mesmo tamanho do array original
		int tamanhoDaLista = listaOriginal.size();
		
		//Iteração para encontrar o menor número com o método encontrandoMenor
		for (int i = 0; i < tamanhoDaLista; i++) {
			int menor = encontrandoMenor(listaOriginal);
			
			//Adicionando o menor numero à nova lista
			novaLista.add(listaOriginal.get(menor));
			
			//Removendo o menor numero do laço da lista original para diminuir comparação nos próximos laços
			listaOriginal.remove(menor);
		}
		
		return novaLista;
	}

	//compara os elementos do array e retorna o menor numero encontrado
	private static int encontrandoMenor(List<Integer> listaOriginal) {
		//numero na posição zero do array
		int menor = listaOriginal.get(0);
		//zero para definir o menor número possível que pode ter - nada menor que isso terá na comparação
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
