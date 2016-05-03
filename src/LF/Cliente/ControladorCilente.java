package LF.Cliente;

public class ControladorCilente {
	
	private RepositorioCliente reposditorioCliente;
	
	public boolean atualizarEndereco(Endereco end)
	{
		this.reposditorioCliente.atualizarEndereco(end);
		return true;
	}

}
