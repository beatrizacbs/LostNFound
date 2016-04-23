package LF.Administrador;

import java.util.ArrayList;
import java.util.List;

import excecao.CodigoInvalidoException;
import excecao.CpfInvalidoException;
import excecao.LoginInvalidoException;
import excecao.NomeInvalidoException;
import excecao.SenhaInvalidaException;


public class RepositorioAdm implements IRepositorioAdm {
	
	private Administrador[] adms;
	private int topo;
	private int tamanho;
	
	public RepositorioAdm(int tamanho)
	{
		this.adms = new Administrador[tamanho];
		this.topo = 0;
	}
	
	ArrayList<Administrador> listaAdm = new ArrayList<Administrador>();
	
	public void inserir(Administrador teste)
	{
		this.listaAdm.add(teste);
	}
	public List<Administrador> ListarAdministrador() {
		
		return listaAdm;
	}
	
	public boolean inserirAdm(Administrador a)
	{
		if(this.topo + 1 != this.tamanho)
		{
			boolean retorno = false;
			
			if(a != null)
			{
				this.adms[topo] = a;
				topo++;
				retorno = true;
			}
			else if(a == null)
			{
				//EXCEÇÃO DE ADM NULL (null pointer)
				retorno = false;
			}
			
			return retorno;
		}
		else
		{
			//EXCEÇÃO DE PILHA CHEIA
			return false;
		}
	}
	
	public boolean deletarAdm(String codigo)
	{
		if(this.topo - this.tamanho == this.tamanho)//VÊ SE A PILHA TA VAZIA
		{
			//EXCEÇÃO PRA PILHA VAZIA
			return false;
		}
		else
		{	
			if(procurarAdm(codigo) != null)//SE O ADM EXISTIR
			{
				Administrador adm = procurarAdm(codigo);
				adm = null;
				this.organizar();
				return true;
				
			}
			else
			{
				//EXCEÇAO PARA CLIENTE QUE NAO EXISTE
				return false;
			}
			
		}
	}
	
	private void organizar()
	{
		for(int i = 0; i < this.topo; i++)
		{
			if(this.adms[i] == null)
			{
				if(i == this.topo - 1)//SE FOR O ULTIMO OBJETO
				{
					this.topo --;
					return;
				}
				else//SE OUTRO OBJETO
				{
					this.adms[i] = this.adms[this.topo - 1];
					this.adms[this.topo - 1] = null;
					this.topo --;
					return;
				}
					
			}
		}
	}

	public Administrador procurarAdm(String codigo)
	{
		for(int i = 0; i < this.topo; )
		{
			if(this.adms[i].getCodigo() == codigo)
			{
				return this.adms[i];
			}
			else
			{
				//VAI PRA O PRÓXIMO
			}
		}
		
		return null;
		
	}

	public boolean atualizarAdm(String login, String senha, String codigo, String novoNome, String novoCpf) throws 
	LoginInvalidoException, CpfInvalidoException, NomeInvalidoException, SenhaInvalidaException,
	CodigoInvalidoException
	{
		Administrador a = procurarAdm(codigo);
		if(a != null)
		{
			a.setNome(novoNome);
			a.setCpf(novoCpf);

			return true;
		}
		else
		{	//DEPOIS PODE MUDAR ISSO SE QUISER TÁ AQUI SÓ POR ENQUANTO
			//this.inserirAdm(new Administrador(codigo, null, null, novoCpf, novoNome));
			return false;
		}
	}

}
