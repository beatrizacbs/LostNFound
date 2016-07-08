package LF.Excecoes;

public class SenhaInvalidaException extends Exception {
	
	public SenhaInvalidaException(){
		
		super("Senha com quantidade de dígitos invalida!");
	}

}

