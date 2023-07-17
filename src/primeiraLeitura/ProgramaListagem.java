package primeiraLeitura;

import java.io.File;
import java.util.Scanner;

public class ProgramaListagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual o diretorio: ");
		
		String strPath = sc.nextLine();
		File path = new File(strPath);
		
		File[] pastas = path.listFiles(File::isDirectory);
		
		System.out.println("FOLDERS:");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		File[] arquivos = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File arquivo : arquivos) {
			System.out.println(arquivo);
		}
		boolean successo = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directorio criado com successo: " + successo);
		sc.close();
	}

}
