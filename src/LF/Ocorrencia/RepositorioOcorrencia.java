package LF.Ocorrencia;

import java.util.HashMap;
import java.util.Map;

public class RepositorioOcorrencia {

	private Map<String, Ocorrencia> ocorrencias;
	private static RepositorioOcorrencia instance = null;
	
	private RepositorioOcorrencia()
	{
		ocorrencias = new HashMap<String, Ocorrencia>();
	}
	
	public static RepositorioOcorrencia getInstance()
	{
		if(instance == null)
		{
			instance = new RepositorioOcorrencia();
		}
		
		return instance;
	}
	
	public void addOcorrencia(Ocorrencia o)
	{
		this.ocorrencias.put(o.getId(), o);
	}
	
	public void removeOcorrencia(String id)
	{
		this.ocorrencias.remove(id);
	}

	public void updateOcorrencia(Ocorrencia o)
	{
		this.ocorrencias.replace(o.getId(), o);
	}
	
	public Ocorrencia procuraOcorrencia(String id)
	{
		return this.ocorrencias.get(id);
	}
	
}