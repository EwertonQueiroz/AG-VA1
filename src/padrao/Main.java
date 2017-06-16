package padrao;

public class Main {

	public static void main(String[] args) {
		Vertice a, b, c, d, e;
		Grafo g;

		Arquivo file = new Arquivo("graph");
		Vertice[] v = new Vertice[file.getTamanho()];
		
		for (int i = 1, j = 0; i <= file.getTamanho(); i++, j++) {
			String[] x = file.getGrafo().get(i).split(" ");
			v[j] = new Vertice(x[0]);
			System.out.println(v[j].getId());
		}
		
		for (int k = 1; k < file.getGrafo().get(k).split(" ").length; k++) {
//			v[j].adicionarArco(v[2]);
		}
		
		
		a = new Vertice("A");
		b = new Vertice("B");
		c = new Vertice("C");
		d = new Vertice("D");
		e = new Vertice("E");

		a.adicionarArco(b);
		a.adicionarArco(d);
		a.adicionarArco(c);
		
		b.adicionarArco(a);
		b.adicionarArco(e);
		b.adicionarArco(d);
		
		c.adicionarArco(d);
		c.adicionarArco(a);
		
		d.adicionarArco(a);
		d.adicionarArco(b);
		d.adicionarArco(e);
		
		e.adicionarArco(d);
		e.adicionarArco(b);
		
//		System.out.println(a.testarArco(e) + ", " + b.testarArco(d));
		
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
