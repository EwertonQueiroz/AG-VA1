import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Vertice a, b, c, d, e;
		Grafo g;
		
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
		
//		System.out.println(a);
		System.out.println("A: " + a.getAdjacencias());
		System.out.println("B: " + b.getAdjacencias());
//		System.out.println(a.getAdjacencias().get(0));
//		System.out.println(a.getAdjacencias().get(1));
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);

		g = new Grafo(a.getAdjacencias());
		g.adicionarVertice(b.getAdjacencias());
		
		System.out.println(g);
	}

}
