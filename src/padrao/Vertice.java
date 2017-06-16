package padrao;
import java.util.ArrayList;

public class Vertice {
	
	private int id = 0;
	private String nome;
	private ArrayList<Vertice> adj;
	
	public Vertice (String nome) {
		this.adj = new ArrayList<Vertice>();
		this.nome = nome;
		this.id += this.id + 1;
	}
	
	public int getId () {
		return this.id;
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
	
	public boolean testarArco (Vertice y) {
		return this.adj.contains(y);
	}
/**	
	public void adicionarAresta (Vertice y) {
		this.adicionarArco(y);
//		y.adj.add(// Adicionar objeto que chamou o método);
	}
*/
	
	public String toString () {		
		int a = 0;
		StringBuilder sb = new StringBuilder();
		
		sb.append(this.getNome() + ": [");
		
//		for (Vertice v : this.adj) {
		for (int i = 0; i < this.adj.size(); i++) {
			sb.append(this.adj.get(i).getNome());
			a++;
			
			if (a < this.adj.size())
				sb.append(", ");
		}
		
		sb.append("]");
		
		return sb.toString();
	}
}
