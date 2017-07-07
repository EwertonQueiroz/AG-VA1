package teste;

import padrao.Vertice;

public class Main {
	
	public static void main(String[] args) {
		
		Grafo g = new Grafo(5);
		Vertice[] v;
		v = new Vertice[5];
		
		v[0] = new Vertice("A");
		v[1] = new Vertice("B");
		v[2] = new Vertice("C");
		v[3] = new Vertice("D");
		v[4] = new Vertice("E");
		
		g.addVertice(v[0]);
		g.addVertice(v[1]);
		g.addVertice(v[2]);
		g.addVertice(v[3]);
		g.addVertice(v[4]);
		
		// A
		g.addAresta(v[0], v[1]);
		g.addAresta(v[0], v[2]);
		g.addAresta(v[0], v[3]);
		
		// B
		g.addAresta(v[1], v[0]);
		g.addAresta(v[1], v[3]);
		g.addAresta(v[1], v[4]);
		
		// C
		g.addAresta(v[2], v[0]);
		g.addAresta(v[2], v[3]);
		
		// D
		g.addAresta(v[3], v[0]);
		g.addAresta(v[3], v[1]);
		g.addAresta(v[3], v[2]);
		g.addAresta(v[3], v[4]);
		
		// E
		g.addAresta(v[4], v[1]);
		g.addAresta(v[4], v[3]);
		
		System.out.println(g);
		/**
		Arquivo file = new Arquivo("graph");
		
		
		Vertice[] v = new Vertice[file.getTamanho()];
		String[] aux;
		
		for (int i = 1, j = 0; i <= file.getTamanho(); i++, j++) {
			aux = file.getGrafo().get(i).split(" ");
//			System.out.println(aux[1]);
//			teste.put(aux[0], );
//			System.out.println(v[j].getId());
		}
		
		for (int i = 1, j = 0; i <= file.getTamanho(); i++, j++) {
			aux = file.getGrafo().get(i).split(" ");
			for (int k = 1; k < file.getGrafo().get(i).split(" ").length; k++) {
				int y = Integer.parseInt(aux[k]);
				v[j].adicionarArco(v[y - 1]);
//				System.out.println(y);
//				System.out.println(file.getGrafo().get(1));
//				System.out.println(v[k]);
//				System.out.println(v[0]);
			}
//			System.out.println(v[j]);
		} */

	}

}
