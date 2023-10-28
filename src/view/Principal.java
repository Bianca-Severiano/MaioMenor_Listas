package view;

import bilbioteca.fila.dinamica.generica.model.Lista;

public class Principal {

	public static void main(String[] args) throws Exception {
		Lista<Integer> l = new Lista<Integer>();
		l.addFirst(3);
		l.addLast(5);
		l.addLast(8);
		l.addLast(12);
		l.addLast(9);
		l.addLast(7);
		l.addLast(6);
		l.addLast(2);
		l.addLast(3);
		l.addLast(7);
		l.addLast(16);

		int maior = 0;
		int cont = 0;

		for (int i = 0; i < 2; i++) {
			int tamanho = l.size();
			do {
				int atual = l.get(0);

				if (maior == 0) {
					maior = atual;
				}

				if (atual > maior) {
					maior = atual;
				}

				l.removeFirst();
				l.addLast(atual);
				
				cont++;

			} while (cont < tamanho);

			System.out.println(maior);
			
			for (int j = 0; j < l.size(); j++) {
				if (maior == l.get(j)) {
					l.remove(j);
				}
			}
			
			maior = 0;
			cont = 0;
		}

	}

}
