package br.com.gustavo.revisao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaBissexto {
	
	public static void main (String args[]) {
		LocalDate anoBis = LocalDate.parse("2021-07-22", DateTimeFormatter.ISO_LOCAL_DATE);
		
		DayOfWeek diaSemana = anoBis.getDayOfWeek();
		Boolean isBix = anoBis.isLeapYear();
		System.out.println(anoBis.lengthOfYear());
		
		System.out.println(diaSemana);
		
		if (isBix) {
			System.out.println("Esse ano � Bissexto!");
		} else {
			System.out.println("Esse n�o � um ano Bissexto!");
			while (anoBis.lengthOfYear() < 366) {
				anoBis = anoBis.plusYears(1);
				System.out.println(anoBis);
			}
			System.out.println("O pr�ximo ano Bissexto �: " + anoBis.getYear());
		}
	}
}
