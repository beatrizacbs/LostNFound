package LF.Cliente;

import java.util.List;

import excecao.CpfInvalidoException;
import excecao.EmailInvalidoException;
import excecao.EnderecoInvalidoException;
import excecao.LoginInvalidoException;
import excecao.NomeInvalidoException;
import excecao.SenhaInvalidaException;
import excecao.TelefoneInvalidoException;

public interface IRepositorioCliente {
	
	public boolean inserirCliente(Cliente c) throws CpfInvalidoException, TelefoneInvalidoException,
	NomeInvalidoException, SenhaInvalidaException, EmailInvalidoException, EnderecoInvalidoException;
	
	public boolean deletarCliente(String cpf);
	
	public List<Cliente> ListarCliente();
	
	public boolean atualizarCliente(String login, String cpf, String novoNome, String novoEmail,
			String novoTelefone, String novoEndereco, String senha) throws CpfInvalidoException,
			TelefoneInvalidoException, NomeInvalidoException, SenhaInvalidaException,
			EmailInvalidoException, EnderecoInvalidoException, LoginInvalidoException;
	
	public Cliente procurarCliente(String cpf);
	
}
