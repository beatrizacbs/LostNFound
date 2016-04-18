package LF.Objeto;

public class RepositorioObjeto {
  
  private Objeto[] obj;
	private int topo;
	private int tamanho;
	
	
	//Construtor da classe
	public RepositorioObj(int tamanho)
	{
		this.obj = new Objeto[tamanho];
		this.topo = 0;
	}
	
	
	//CRUD
	public boolean inserirObj(Objeto b)
	{
		if(b.equals(null))
	  {
			return false;
		}
		else 
		{
			for(topo = 0; topo < this.tamanho; topo ++)
			{
				if(b.getCaracteristica() == obj[topo].getCaracteristica())
				{
					return false;
				}
			}
			if(tamanho < obj.length - 1)
			{
				obj[tamanho] = b;
				tamanho = tamanho + 1;
				return true;
			}
		}
			
		this.obj[this.tamanho] = b;
		this.tamanho = this.tamanho + 1;
		return true;
		
	}

	
	public boolean deletarObj(boolean devolvido)
	{
	
		boolean achou = false;
		while ((!achou) && (topo < this.tamanho)) {
			if (devolvido == this.obj[topo].isDevolvido()){
				achou = true;
			} else {
				topo = topo + 1;
				}
			}
		if(topo != this.tamanho)
		{
			this.obj[topo] = this.obj[this.tamanho -1];
			this.obj[this.tamanho -1] = null;
			this.tamanho = this.tamanho -1;
			System.out.println("Objeto " + devolvido + "removido");
			return true;
		}
		else 
		{
			System.out.println("Objeto nao encontrado.");
			return false;
		}
	}
	
	public void organizar()
	{
		for(int i = 0; i < this.topo; i++)
		{
			if(this.obj[i] == null)
			{
				if(i == this.topo - 1)//SE FOR O ULTIMO OBJETO
				{
					this.topo --;
					return;
				}
				else//SE OUTRO OBJETO
				{
					this.obj[i] = this.obj[this.topo - 1];
					this.obj[this.topo - 1] = null;
					this.topo --;
					return;
				}
					
			}
		}
	}

	public Objeto procurarObj(String tipo)
	{
		int i = 0;
		boolean achou = false;
		while ((!achou) && (i < this.tamanho))
		{
			if (tipo == this.obj[i].getTipo())
			{
				achou = true;
			}
			else 
			  {
				i = i + 1;
				}
			}
		
			Objeto resultado = null;
			if (i != this.tamanho) {
				resultado = this.obj[i];
			}
		return resultado;

	}
	
	//public Objeto atualizarObj(Objeto novoObjeto){
	// TERMINAR O METODO ATUALIZAR
	//}
}
