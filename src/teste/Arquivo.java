package teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Arquivo {
	
	private ArrayList<String> grafo;
	HashMap<String, Integer> teste;
	private Integer tamanho;
	
	public Arquivo (String path) {
		this.grafo = new ArrayList<String>();
		this.ler_arquivo(path);
		this.tamanho = Integer.parseInt(this.grafo.get(0));
		teste = new HashMap<String, Integer>(this.tamanho);
	}
	
	public ArrayList<String> getGrafo () {
		return this.grafo;
	}
	
	public Integer getTamanho () {
		return this.tamanho;
	}
	
	private void ler_arquivo (String path) {
		try {
			InputStream is = new FileInputStream(path);
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			String caracteres = s.split(" ").toString();
			
			while (s != null) {
				this.grafo.add(s);
				s = br.readLine();
//				caracteres = s.split(" ").toString();
			}
			
			System.out.println(caracteres + ", ");
			
//			teste.put(s[0], s[1]);
			
			br.close();
			isr.close();
			is.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
