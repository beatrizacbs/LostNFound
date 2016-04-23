package LF.Ocorrencia;

import java.util.ArrayList;
import java.util.List;

import excecao.IdInvalidoException;


public class RepositorioOcorrencia implements IRepositorioOcorrencia
{

	ArrayList<Ocorrencia> listaDeOcorrencia = new ArrayList<Ocorrencia>();
	
	public void inserir(Ocorrencia teste)
	{
		this.listaDeOcorrencia.add(teste);
	}
	
	public List<Ocorrencia> ListarOcorrencia() {
		
		return listaDeOcorrencia;
	}
	
	public String toString()
	{
		String st = "";
		
		for(Ocorrencia p : this.listaDeOcorrencia)
		{
			st = st + p.toString() + "\n";
		}
		return st;
	}
	
	public void inserirOcorrencia(Ocorrencia ocorrencia) throws IdInvalidoException
	{
		
		Ocorrencia p = this.procurarOcorrencia(ocorrencia.getId());
		if(p.equals(null))
		{
			 listaDeOcorrencia.add(ocorrencia);
		}
		else
		{
			throw new IdInvalidoException();
		}
			
	}
	

	public boolean deletarOcorrencia(String id)
	{	
		boolean retorno = false;
		for(Ocorrencia ocorrencia : listaDeOcorrencia)
		{
			if(ocorrencia.getId().equals(id))
			{
				int indice = listaDeOcorrencia.indexOf(ocorrencia);
				listaDeOcorrencia.remove(indice);
				retorno = true;
			}
		}
		return retorno;
	}

	public boolean atualizarOcorrencia(Ocorrencia ocorrencia)
	{
		
		for(Ocorrencia p : listaDeOcorrencia)
		{
			if(p.getId().equals(ocorrencia.getId()))
			{
				int indice = listaDeOcorrencia.indexOf(p);
				listaDeOcorrencia.remove(indice);
				listaDeOcorrencia.add(ocorrencia);
			}
		}
		return false;
	}

	public Ocorrencia procurarOcorrencia(String id)
	{
		Ocorrencia retorno = null;
		for(Ocorrencia ocorrencia : listaDeOcorrencia)
		{
			if(ocorrencia.getId().equals(id));
			retorno = ocorrencia;
			break;
		}
		return retorno;
	}
	
}