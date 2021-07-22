package br.com.gustavo.revisao;

public class Programa {
	
    public static void main(String[] args) {
    	//String[] args = {"dividir", "2020-05-21", "21"};
        Integer divisao = 1;
        Integer soma = 0;
        Integer multiplicacao = 1;
        
        if (args.length == 3) {
            if ("dividir".equals(args[0])) {
            	divisao = Integer.valueOf(args[1]) / Integer.valueOf(args[2]);
            	System.out.println("Resultado da divisão: " + divisao);
            } else if ("somar".equals(args[0])) {
            	for (int i = 1; i < args.length; i++) {
            		soma += Integer.valueOf(args[i]);
            	}
            	System.out.println("Resultado da soma: " + soma);
            } else if ("multiplicar".equals(args[0])) {
            	for (int i = 1; i < args.length; i++) {
            		multiplicacao = multiplicacao * Integer.valueOf(args[i]);
            	}
            	System.out.println("Resultado da multiplicação: " + multiplicacao);
            }
        } else {
        	System.out.println("Erro! O array deve ter 3 argumentos!");
        }
    }
}