package padrao;

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
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		
		for (int i = 0; i < Vertice.count; i++) {
			sb.append("");
			
			if (i != Vertice.count - 1)
				sb.append(", ");
		}
		
		sb.append("]");
		
		return sb.toString();
	}

}
