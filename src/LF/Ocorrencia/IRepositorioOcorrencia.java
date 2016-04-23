package LF.Ocorrencia;

import java.util.List;

import excecao.IdInvalidoException;


public interface IRepositorioOcorrencia {
	
	public void inserirOcorrencia(Ocorrencia ocorrencia) throws IdInvalidoException;

	public boolean deletarOcorrencia(String id);

	public List<Ocorrencia> ListarOcorrencia();

	public boolean atualizarOcorrencia(Ocorrencia ocorrencia) throws IdInvalidoException;

	public Ocorrencia procurarOcorrencia(String id);
	
}
