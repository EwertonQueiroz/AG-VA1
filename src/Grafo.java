import java.util.ArrayList;

public class Grafo {
	private ArrayList<ArrayList<Vertice>> listasAdj;

	public Grafo (ArrayList<Vertice> v) {
		this.listasAdj = new ArrayList<ArrayList<Vertice>>();
		this.listasAdj.add(v);
	}
	
	public void adicionarVertice (ArrayList<Vertice> v) {
		this.listasAdj.add(v);
	}
	
	public String toString () {		
		int a = 0;
		StringBuilder sb = new StringBuilder();
		
		sb.append("{");
		
		for (ArrayList<Vertice> v : this.listasAdj) {
			sb.append(v);
			a++;
			
			if (a < this.listasAdj.size())
				sb.append("; ");
		}
		
		sb.append("}");
		
		return sb.toString();
	}
	
}
