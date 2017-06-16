package padrao;
import java.util.ArrayList;

public class Grafo {
	private ArrayList<ArrayList<Vertice>> listasAdj;
	private ArrayList<String> nomes = new ArrayList<String>();

	public Grafo (Vertice v) {
		this.listasAdj = new ArrayList<ArrayList<Vertice>>();
		this.listasAdj.add(v.getAdjacencias());
		this.nomes.add(v.getNome());
	}
	
	public void adicionarVertice (Vertice v) {
		this.listasAdj.add(v.getAdjacencias());
		this.nomes.add(v.getNome());
	}
	
	public String toString () {		
		int a = 0;
		StringBuilder sb = new StringBuilder();
		
		sb.append("G = {");
		
//		for (ArrayList<Vertice> v : this.listasAdj) {
		for (int i = 0; i < this.listasAdj.size(); i++) {
			sb.append(this.nomes.get(i));
			a++;
			
			if (a < this.listasAdj.size())
				sb.append("; ");
		}
		
		sb.append("}");
		
		return sb.toString();
	}
	
}
