package LF.Cliente;

public class RepositorioCliente {
	
	private Cliente[] clientes;
	private int tamanho;
	private int topo;
	
	public RepositorioCliente(int tamanho)
	{
		this.clientes = new Cliente[tamanho];
	}

	public int getTamanho() {
		return this.tamanho;
	}

	public int getTopo() {
		return this.topo;
	}
	
	public String toString()
	{
		String resultado = new String();
		
		for(int i = 0; i < this.getTopo(); i++)
		{
			resultado = resultado + "\nNome:" + this.clientes[i].getNome() + "\nCpf: " + this.clientes[i].getCpf()
					+ "\nEmail: " + this.clientes[i].getEmail() + "\nTelefone: " + this.clientes[i].getTelefone() +
					"\n==========================================================================";
		}
		
		return resultado;
			
	}

	public boolean inserirCliente(Cliente c)
	{
		if(this.topo + 1 != this.tamanho)
		{
			boolean retorno = false;
			
			if(c != null)
			{
				this.clientes[topo] = c;
				topo++;
				retorno = true;
			}
			else if(c == null)
			{
				//EXCESSÃO DE CLIENTE NULL (null pointer)
				retorno = false;
			}
			
			return retorno;
		}
		else
		{
			//EXCESSÃO DE PILHA CHEIA
			return false;
		}
	}

	public boolean deletarCliente(String cpf)
	{
		if(this.topo - this.tamanho == this.tamanho)//VÊ SE A PILHA TA VAZIA
		{
			//EXCESSÃO PRA PILHA VAZIA
			return false;
		}
		else
		{	
			if(procurarCliente(cpf) != null)//SE O CLIENTE EXISTIR
			{
				Cliente cliente = procurarCliente(cpf);
				cliente = null;
				this.organizar();
				return true;
				
			}
			else
			{
				//EXCESSAO PARA CLIENTE QUE NAO EXISTE
				return false;
			}
			
		}
	}
	
	public Cliente procurarCliente(String cpf)
	{
		for(int i = 0; i < this.topo; )
		{
			if(this.clientes[i].getCpf() == cpf)
			{
				return this.clientes[i];
			}
			else
			{
				//VAI PRA O PRÓXIMO
			}
		}
		
		return null;
		
	}

	public void organizar()
	{
		for(int i = 0; i < this.topo; i++)
		{
			if(this.clientes[i] == null)
			{
				if(i == this.topo - 1)//SE FOR O ULTIMO OBJETO
				{
					this.topo --;
					return;
				}
				else//SE OUTRO OBJETO
				{
					this.clientes[i] = this.clientes[this.topo - 1];
					this.clientes[this.topo - 1] = null;
					this.topo --;
					return;
				}
					
			}
		}
	}

	public boolean atualizarCliente(String cpf, String novoNome, String novoEmail ,String novoTelefone, String novoEndereco)
	{
		Cliente c = procurarCliente(cpf);
		if(c != null)
		{
			c.setNome(novoNome);
			c.setEmail(novoEmail);
			c.setTelefone(novoTelefone);
			c.setEndereco(novoEndereco);
			return true;
		}
		else
		{	//DEPOIS PODE MUDAR ISSO SE QUISER TÁ AQUI SÓ POR ENQUANTO
			this.inserirCliente(new Cliente(null, novoEmail, null, novoEndereco, cpf, novoTelefone, novoNome));
			return true;
		}
			
				
	}

	




}
