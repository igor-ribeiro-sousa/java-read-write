package primeiraLeitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramaArqEscritaELeitura {

	public static void main(String[] args) {
		String[] linhas = new String[] {"Igor Ribeiro", "Mirna Helena", "Virna Helena"};
		
		String path = "c:\\Dev\\testeEscritaeLeitura.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String linha : linhas) {
				bw.write(linha);
				bw.newLine();
			} 

		}catch (IOException e) {
			System.out.println("Error :" + e.getMessage());
		}
		
		
		String path2 = "c:\\Dev\\testeEscritaeLeitura.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path2))) {
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error :" + e.getMessage());
		}
		
		}
	}

