package controller;

public class OperacaoController {

	public OperacaoController() {
		super();
	}
	public int operacaoValor(int numero) {
		
		if (numero < 0) {
			throw new ArithmeticException("O parâmetro não pode ser negativo.");
	        
		} if (numero % 2 == 0) {
	        return (int) Math.pow(numero, 2); 
	        } else {
	        return (int) Math.pow(numero, 3); 
	        }
	    }
	}


