package main;

public class pesquisaBinaria {

	public static void main(String[] args) {
		int[] lista = { 0, 2, 4, 6, 8, 10, 16 };

		System.out.println(pesquisaBinaria(lista, 16));

	}

	private static int pesquisaBinaria(int[] lista, int i) {
		int baixo = 0;
		int alto = lista.length - 1;

		while (baixo <= alto) {
			int meio = (baixo + alto) / 2;
			int chute = lista[meio];

			if (chute == i) {
				System.out.print("A posição do número " + i + " encontra-se na posição ");
				return meio;
			} else if (chute > i) {
				alto = meio - 1;
			} else if (chute < i) {
				baixo = meio + 1;
			}
		}
		return -1;

	}

}
