package br.com.gustavo.revisao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ProgramaHoras {
	
	public static void main (String[] args) {
		LocalDateTime agora = LocalDateTime.now();
		LocalDateTime prova = LocalDateTime.parse("2021-07-23T13:30:00.0", DateTimeFormatter.ISO_DATE_TIME);
		
		System.out.println(agora);
		System.out.println(prova);
		
		while (prova.isAfter(agora)) {
			agora = agora.plusSeconds(1);
			System.out.println(agora);
		}
	}
}
