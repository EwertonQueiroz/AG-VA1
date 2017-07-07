package teste;
import java.util.HashMap;
import java.util.LinkedList;

import padrao.Vertice;

public class Grafo {

	private LinkedList<Vertice>[] adj;
	private HashMap<String, LinkedList<Vertice>> grafo;

	@SuppressWarnings("unchecked")
	public Grafo (int tamanho) {
		this.grafo = new HashMap<String, LinkedList<Vertice>>();
		this.adj = new LinkedList[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			this.adj[i] = new LinkedList<Vertice>();
		}
	}
	
	public LinkedList<Vertice> getAdjacencias (Vertice v) {
		return this.adj[v.getId()];
	}
	
	public void addVertice (Vertice v) {
		this.grafo.put(v.getNome(), this.adj[v.getId()]);
	}
	
	public void addAresta (Vertice x, Vertice y) {
		this.adj[x.getId()].add(y);
		this.adj[y.getId()].add(x);
	}
	
	public String toString () {		
		StringBuilder sb = new StringBuilder();
		
		sb.append("{");
		
		for (int i = 0; i < this.grafo.size(); i++) {
			sb.append(this.grafo.get("C"));
			
			if (i != this.grafo.size() - 1)
				sb.append("; ");
		}
		
		sb.append("}");
		
		return sb.toString();
	}
	
}
