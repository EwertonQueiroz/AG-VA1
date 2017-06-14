import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arquivo {
	public void ler_arquivo (String path) {
		try {
			Scanner scanner = new Scanner(new FileReader(path)).useDelimiter("\\x20\\n");
			while (scanner.hasNext()) {
				String tamanho = scanner.next();
				String index = scanner.next();
				String nome = scanner.next();
				
				int[] adj = new int[7];
				int i = 0;
				
				while (scanner.hasNextInt()) {
					adj[i] = scanner.nextInt();
					i++;
				}
				
				System.out.println("[Tamanho: " + tamanho + ", Nome/Index: " + nome + "/" + index);
			}
			
			scanner.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void ler (String path) {
		try {
			BufferedReader buffRead = new BufferedReader(new FileReader(path));
			String nome = "", linha = "";
			int tamanho = 0, index = 0;
			List lista = new ArrayList();
			
			while (true) {
				linha = buffRead.readLine();
				
				if (linha != null)
					lista.add(linha.split(" "));
				
				else
					break;
				
			}
			//System.out.println("[Tamanho: " + tamanho + ", Nome/Index: " + nome + "/" + index);
			buffRead.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public void le (String path) {
		try{
		Scanner leitor = new Scanner(new FileReader(path));
		List<String> linhas = new ArrayList<>();
		while (leitor.hasNextLine()) {
		    linhas.add(leitor.nextLine());
		}
		leitor.close();
		
		System.out.println(linhas);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
