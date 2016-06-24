package LF.Ocorrencia;

public interface IRepositorioOcorrencia {
	
	public RepositorioOcorrencia getInstance();
	
	public void addOcorrencia(Ocorrencia o);
	
	public void removeOcorrencia(String id);
	
	public void updateOcorrencia(Ocorrencia o);
	
	public Ocorrencia procuraOcorrencia(String id);

}
