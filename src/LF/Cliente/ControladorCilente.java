package LF.Cliente;

import excecao.ClienteInexistenteException;

public class ControladorCilente {
	
	private RepositorioCliente reposditorioCliente;
	
	public boolean atualizarEndereco(String cpf, Endereco end)
	{
		if(this.reposditorioCliente.procurarCliente(cpf) != null)
		{
			
			// TODO: tem que colocar pra atualizar aqui mas eu ainda nao sei como
			return true;
			
		} else
		{
			try {
				throw new ClienteInexistenteException();
			} catch (ClienteInexistenteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return false;
		}
			
			
	}

}
