package excecao;

public class IdInvalidoException extends Exception{

	public IdInvalidoException(){
		
		super("Id ja cadastrado!");
	}
}
