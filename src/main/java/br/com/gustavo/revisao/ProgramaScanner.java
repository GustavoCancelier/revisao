package br.com.gustavo.revisao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaScanner {
	
	public static void main (String[] args_) {
		
		try (Scanner ler = new Scanner(System.in)) {
	      	List<String> pessoas = new ArrayList<>();
	      	
	      	do {
	      		System.out.println("Informe o nome de uma pessoa: ");
	      		pessoas.add(ler.next());
	      	} while (!pessoas.contains("parar"));
	      	
	      	for (String people : pessoas) {
	      		if (!people.equals("parar")) {
	      			System.out.println(people);
	      		}
		    }
	 	}
	} 
}
