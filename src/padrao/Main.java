package padrao;

public class Main {

	public static void main(String[] args) {
		Arquivo file = new Arquivo("graph");
		Vertice[] v = new Vertice[file.getTamanho()];
		String[] aux;
		
		for (int i = 1, j = 0; i <= file.getTamanho(); i++, j++) {
			aux = file.getGrafo().get(i).split(" ");
			v[j] = new Vertice(aux[0], j);
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
			System.out.println(v[j]);
		}
		
//		Vertice a, b, c, d, e;
//		Grafo g;
//		
//		a = new Vertice("A");
//		b = new Vertice("B");
//		c = new Vertice("C");
//		d = new Vertice("D");
//		e = new Vertice("E");
//
//		a.adicionarArco(b);
//		a.adicionarArco(d);
//		a.adicionarArco(c);
//		
//		b.adicionarArco(a);
//		b.adicionarArco(e);
//		b.adicionarArco(d);
//		
//		c.adicionarArco(d);
//		c.adicionarArco(a);
//		
//		d.adicionarArco(a);
//		d.adicionarArco(b);
//		d.adicionarArco(e);
//		
//		e.adicionarArco(d);
//		e.adicionarArco(b);
//		
//		System.out.println(a.testarArco(e) + ", " + b.testarArco(d));
//		
//		System.out.println(a.getId());
//		System.out.println("A: " + a.getAdjacencias());
//		System.out.println("B: " + b.getAdjacencias());
//		System.out.println(a.getAdjacencias().get(0));
//		System.out.println(a.getAdjacencias().get(1));
//		System.out.println(b.getId());
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//
//		g = new Grafo(a);
//		g.adicionarVertice(b);
//		g.adicionarVertice(c);
//		g.adicionarVertice(d);
//		g.adicionarVertice(e);
//		
//		System.out.println(g);
		
	}

}
