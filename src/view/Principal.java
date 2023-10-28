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
		
		int menor = 0;
		int maior = 0;
		int tamanho = l.size();
		int cont = 0;
		
		do {
			int atual = l.get(0);
			if(maior == 0 && menor == 0) {
				maior = atual;
				menor = maior;
			}
			
			if(atual > maior) {
				maior = atual;
			} else if (atual < menor) {
				menor = atual;
			}
			
			l.removeFirst();
			l.addLast(atual);
			cont++;
		} while (cont < tamanho);
		
		System.out.println(maior);
		System.out.println(menor);
	}

}
