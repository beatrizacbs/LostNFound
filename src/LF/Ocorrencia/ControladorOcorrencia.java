package LF.Ocorrencia;

import excecao.OcorrenciaInexistenteException;
import excecao.OcorrenciaInvalidaException;

public class ControladorOcorrencia {
	
	private RepositorioOcorrencia ocorrencias;
	private static ControladorOcorrencia instance;
	
	private ControladorOcorrencia()
	{
		ocorrencias = RepositorioOcorrencia.getInstance();
	}
	
	public static ControladorOcorrencia getInstance() 
	{
		if(instance == null)
		{
			instance = new ControladorOcorrencia();
		}
		
		return instance;
	}
	
	public void inserirOcorrencia(Ocorrencia o)throws OcorrenciaInvalidaException
	{
		if(o != null)
		{
			ocorrencias.addOcorrencia(o);
		}
		else
		{
			throw new OcorrenciaInvalidaException();
		}
	}
	
	public void removerOcorrencia(String codigo)throws OcorrenciaInvalidaException, OcorrenciaInexistenteException 
	{
		if(codigo != null)
		{
			if(ocorrencias.procuraOcorrencia(codigo) != null)
			{
				ocorrencias.removeOcorrencia(codigo);
			}
			else
			{
				throw new OcorrenciaInexistenteException();
			}
			
		}
		else
		{
			throw new OcorrenciaInvalidaException();
		}
		
	}
	
	public void atualizarOcorrencia(Ocorrencia o)throws OcorrenciaInvalidaException
	{
		if(o != null)
		{
			if(ocorrencias.procuraOcorrencia(o.getId()) != null)
			{
				ocorrencias.updateOcorrencia(o);
			}
			else
			{
				throw new OcorrenciaInvalidaException();
			}
		}
		else
		{
			throw new OcorrenciaInvalidaException();
		}
		
	}
	
	public Ocorrencia buscarOcorrencia(String id)throws OcorrenciaInexistenteException
	{
		if(id != null)
		{
			return ocorrencias.procuraOcorrencia(id);
		}
		else
		{
			throw new OcorrenciaInexistenteException();
		}
	}

}
