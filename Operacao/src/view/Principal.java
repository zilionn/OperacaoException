package view;

import controller.OperacaoController;

public class Principal {

	public static void main(String[] args) {
		OperacaoController operacaoController = new OperacaoController();
		
		try {
			int resultadoPar = operacaoController.operacaoValor(4);
	        System.out.println("Resultado para número par: " + resultadoPar);
	    } catch (ArithmeticException e) {
	        System.out.println("Erro: " + e.getMessage());
	    }  
		
		try {
	        int resultadoImpar = operacaoController.operacaoValor(3);
	        System.out.println("Resultado para número ímpar: " + resultadoImpar);
	    } catch (ArithmeticException e) {
	        System.out.println("Erro: " + e.getMessage());
	    }
		
		try {
	        int resultadoNegativo = operacaoController.operacaoValor(-5);
	        System.out.println("Resultado para número negativo: " + resultadoNegativo);
	    } catch (ArithmeticException e) {
	        System.out.println("Oops, achamos um erro: " + e.getMessage());
	    }

	}

}
