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
	 * Este método recebe a lista de caracteres lida do arquivo e a quantidade de vértices
	 * que deverão ser criados.
	 * Então ele cria uma lista de vértices a partir da quantidade recebida e depois faz o
	 * split em cada linha do arquivo a partir do contador "i" que vai de 1 (pois conteúdo
	 * do índice 0 é a quantidade de vértices) até o tamanho da lista recebida por paramêtros
	 * e atribui o vetor obtido a um vetor de String denominado "aux".
	 * 
	 * Só utilizamos o índice 0 do vetor "aux" em cada linha, pois é nele que está o nome do
	 * vértice.
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
			System.out.println("Lista inválida.");
		
		return vertices;
	}
}
