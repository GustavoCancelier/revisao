package br.com.gustavo.revisao;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProgramaBissexto {
	
	public static void main (String args[]) {
		LocalDate anoBis = LocalDate.parse("2021-02-28", DateTimeFormatter.ISO_LOCAL_DATE);
		
		DayOfWeek diaSemana = anoBis.getDayOfWeek();
		Boolean isBix = anoBis.isLeapYear();
		System.out.println("Esse ano tem: " + anoBis.lengthOfYear() + " dias.");
		
		switch (diaSemana) {
		case MONDAY: {
			System.out.println("Dia da semana: Segunda-Feira");
		break;
		}
		case TUESDAY: {
			System.out.println("Dia da semana: Ter�a-Feira");
		break;
		}
		case WEDNESDAY: {
			System.out.println("Dia da semana: Quarta-Feira");
		break;
		}
		case THURSDAY: {
			System.out.println("Dia da semana: Quinta-Feira");
		break;
		}
		case FRIDAY: {
			System.out.println("Dia da semana: Sexta-Feira");
		break;
		}
		case SATURDAY: {
			System.out.println("Dia da semana: S�bado");
		break;
		}
		case SUNDAY: {
			System.out.println("Dia da semana: Domingo");
		break;
		}
		default:
			System.out.println("ERRO");
		}
		
		if (isBix) {
			System.out.println("Esse ano � Bissexto!");
		} else {
			System.out.println("Esse n�o � um ano Bissexto!");
			while (anoBis.lengthOfYear() < 366) {
				anoBis = anoBis.plusYears(1);
				//System.out.println(anoBis);
			}
			System.out.println("O pr�ximo ano Bissexto �: " + anoBis.getYear());
		}
	}
}
