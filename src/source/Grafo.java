package source;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

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
		return this.grafo.get(v.getNome());
	}
	
	public void addVertice (Vertice v) {
		if (v != null)
			this.grafo.put(v.getNome(), this.adj[v.getId()]);
		else
			System.out.println("V�rtice inv�lido.");
	}
	
	public void addArco (Vertice x, Vertice y) {
		if (y != null) {
			this.adj[x.getId()].add(y);
			this.grafo.put(x.getNome(), this.adj[x.getId()]);
		}
		
		else
			System.out.println("V�rtice inv�lido.");
	}
	
	public void addAresta (Vertice x, Vertice y) {
		this.addArco(x, y);
		this.addArco(y, x);
	}
	
	public boolean testarAresta (Vertice x, Vertice y) {
		boolean result = false;
		
		if (x != null && y != null)
			result = this.getAdjacencias(x).contains(y);
		
		else if (x == null)
			System.out.println("O v�rtice " + x.getNome() + " � inv�lido.");
		
		else
			System.out.println("O v�rtice " + y.getNome() + " � inv�lido.");
		
		return result;
	}
	
	public String getNome (Vertice x) {
		return x.getNome();
	}
	
	public boolean testarLoop (Grafo g) {
		boolean result = false;
		
		if (g != null) {
			Set<String> keys = g.grafo.keySet();
			Collection<LinkedList<Vertice>> values = g.grafo.values();
			
			for (int i = 0; i < values.size(); i++)
				if (values.toArray()[i].toString().contains(keys.toArray()[i].toString()))
					result = true;
		}
		
		else
			System.out.println("Grafo inv�lido.");
		
		return result;
	}
	
//	public boolean testarArcosParalelos (Grafo g) {
//		boolean result = false;
//		
//		if (g != null) {
//			Set<String> keys = g.grafo.keySet();
//			Collection<LinkedList<Vertice>> values = g.grafo.values();
//			
//			for (int i = 0; i < values.size(); i++)
//				if (values.toArray()[i].toString().contains(keys.toArray()[i].toString()))
//					result = true;
//		}
//		
//		else
//			System.out.println("Grafo inv�lido.");
//		
//		return result;
//	}
//	
//	public Grafo transporGrafo (Grafo g) {
//		Grafo novo = new Grafo(g.grafo.size());
//		Vertice[] v = new Vertice[g.grafo.size()];
//		
//		Set<String> keys = g.grafo.keySet();
//		Collection<LinkedList<Vertice>> values = g.grafo.values();
//		
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0, k = 0; j < 5; j++) {
//				if (values.toArray()[i].toString().indexOf(keys.toArray()[j].toString()) != -1) {
//					System.out.println(values.toArray()[i].toString() + " = " + keys.toArray()[j].toString());
//					
//					if (v[k] == null) {
//						for (int l = 0; l < k; l++) {
//							if (v[l].getNome() != keys.toArray()[j].toString()) {
//								v[k] = new Vertice(keys.toArray()[j].toString());
//								k++;
//							}
//						}
//					}
//				}
//			}
//		}
//		
//		return novo;
//	}
	
	/**
	 * Este m�todo recebe um vetor de v�rtices e a lista de caracteres lida do arquivo.
	 * Ent�o ele faz o split em cada linha do arquivo atribuindo o vetor obtido a um vetor
	 * de String denominado "aux".
	 * 
	 * O �ndice 0 desse vetor "aux" � ignorado pois � o nome do v�rtice.
	 * Do �ndice 1 ao N - 1 s�o as adjac�ncias lidas no arquivo.
	 * 
	 * O segundo for � utilizado para criar as adjac�ncias.
	 * Ele percorre os �ndices do vetor "aux" a partir do contador "k", parando no
	 * tamanho do vetor obtido pelo m�todo split para a linha no contador "i".
	 */
	public void preencher (Vertice[] v, ArrayList<String> caracteres) {
		String[] aux;
		
		if (caracteres != null) {
			for (int i = 1, j = 0; i < caracteres.size(); i++, j++) {
				aux = caracteres.get(i).split(" ");
				
				for (int k = 1; k < caracteres.get(i).split(" ").length; k++)
					this.addArco(v[j], v[Integer.parseInt(aux[k])]);
			}
		}
		
		else
			System.out.println("Lista inv�lida.");
	}
	
	public String toString () {		
		return this.grafo.toString();
	}
	
}
