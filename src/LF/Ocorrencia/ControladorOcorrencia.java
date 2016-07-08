package LF.Ocorrencia;

import java.util.Collections;

import LF.Excecoes.OcorrenciaInexistenteException;
import LF.Excecoes.OcorrenciaInvalidaException;

public class ControladorOcorrencia implements IControladorOcorrencia{
	
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

	public Collections listarOcorrencia()
	{
		return ocorrencias.getOcorrencias();
	}
}
