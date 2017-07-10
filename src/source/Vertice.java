package source;

import java.util.ArrayList;

public class Vertice {
	
	private static int count = 0;
	private int id;
	private String nome;
	
	public Vertice (String nome) {
		this.nome = nome;
		this.id = Vertice.count++;
	}
	
	public int getId () {
		return this.id;
	}
	
	public String getNome () {
		return this.nome;
	}
	
	public String toString () {		
		return this.getNome();
	}
	
	/**
	 * Este m�todo recebe a lista de caracteres lida do arquivo e a quantidade de v�rtices
	 * que dever�o ser criados.
	 * Ent�o ele cria uma lista de v�rtices a partir da quantidade recebida e depois faz o
	 * split em cada linha do arquivo a partir do contador "i" que vai de 1 (pois conte�do
	 * do �ndice 0 � a quantidade de v�rtices) at� o tamanho da lista recebida por param�tros
	 * e atribui o vetor obtido a um vetor de String denominado "aux".
	 * 
	 * S� utilizamos o �ndice 0 do vetor "aux" em cada linha, pois � nele que est� o nome do
	 * v�rtice.
	 */
	static public Vertice[] criarVertices (ArrayList<String> caracteres, int tamanho) {
		Vertice[] vertices = new Vertice[tamanho];
		String[] aux;
		
		if (caracteres != null)
			for (int i = 1, j = 0; i < caracteres.size(); i++, j++) {
				aux = caracteres.get(i).split(" ");
				vertices[j] = new Vertice(aux[0]);
			}

		else
			System.out.println("Lista inv�lida.");
		
		return vertices;
	}
}
