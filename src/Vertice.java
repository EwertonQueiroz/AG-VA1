import java.util.ArrayList;

public class Vertice {
	
	private String nome;
	private ArrayList<Vertice> adj;
	
	public Vertice (String nome) {
		this.adj = new ArrayList<Vertice>();
		this.nome = nome;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public ArrayList<Vertice> getAdjacencias () {
		return this.adj;
	}
	
	public void adicionarArco (Vertice y) {
		this.adj.add(y);
	}
/**	
	public void adicionarAresta (Vertice y) {
		this.adicionarArco(y);
//		y.adj.add(// Adicionar objeto que chamou o m�todo);
	}
*/
	
	public String toString () {		
		int a = 0;
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getNome() + ": [");
		
		for (Vertice v : this.adj) {
			sb.append(v.getNome());
			a++;
			
			if (a < this.adj.size())
				sb.append(", ");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
}