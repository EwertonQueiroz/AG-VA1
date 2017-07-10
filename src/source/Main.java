package source;

public class Main {
	
	public static void main(String[] args) {
		
		Arquivo file = new Arquivo("graph");
		
		Grafo g = new Grafo(file.getTamanho());
		Vertice[] v = new Vertice[file.getTamanho()];
		
		v = Vertice.criarVertices(file.getCaracteres(), file.getTamanho());
		
		g.preencher(v, file.getCaracteres());
		
//		System.out.println(g.testarAresta(v[], v[]));
//		System.out.println(g.getNome(v[]));
//		System.out.println(g.getAdjacencias(v[]));
//		System.out.println(g.testarLoop(g));
		
//		Em desenvolvimento...
//		System.out.println(g.transporGrafo(g));
	}

}
