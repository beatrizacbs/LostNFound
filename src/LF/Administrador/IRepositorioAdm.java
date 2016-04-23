package LF.Administrador;

import java.util.List;

import excecao.CodigoInvalidoException;
import excecao.CpfInvalidoException;
import excecao.LoginInvalidoException;
import excecao.NomeInvalidoException;
import excecao.SenhaInvalidaException;


public interface IRepositorioAdm
{
	public boolean inserirAdm(Administrador adm) throws LoginInvalidoException, CpfInvalidoException,
	NomeInvalidoException, SenhaInvalidaException, CodigoInvalidoException;

	public boolean deletarAdm(String codigo);

	public List<Administrador> ListarAdministrador();

	public boolean atualizarAdm(String login, String novocpf, String novoNome, String senha, String codigo)
		throws LoginInvalidoException, CpfInvalidoException, NomeInvalidoException, 
		SenhaInvalidaException, CodigoInvalidoException;

	public Administrador procurarAdm(String codigo);

}
