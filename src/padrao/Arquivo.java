package padrao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Arquivo {
	
	private ArrayList<String> grafo;
	private Integer tamanho;
	
	public Arquivo (String path) {
		this.grafo = new ArrayList<String>();
		this.ler_arquivo(path);
		this.tamanho = Integer.parseInt(this.grafo.get(0));
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
			
			while (s != null) {
				this.grafo.add(s);
				s = br.readLine();
			}
			
			br.close();
			isr.close();
			is.close();
		}
		
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
