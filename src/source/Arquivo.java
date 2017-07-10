package source;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Arquivo {
	
	private ArrayList<String> caracteres;
	private Integer tamanho;
	
	public Arquivo (String path) {
		this.caracteres = new ArrayList<String>();
		this.ler_arquivo(path);
		this.tamanho = Integer.parseInt(this.caracteres.get(0));
	}
	
	public ArrayList<String> getCaracteres () {
		return this.caracteres;
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
				this.caracteres.add(s);
				s = br.readLine();
			}
			
			br.close();
			isr.close();
			is.close();
		}
		
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	
}
