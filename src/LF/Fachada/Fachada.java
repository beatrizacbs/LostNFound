package LF.Fachada;
import excecao.CodigoInvalidoException;
import excecao.CpfInvalidoException;
import excecao.EmailInvalidoException;
import excecao.EnderecoInvalidoException;
import excecao.IdInvalidoException;
import excecao.LoginInvalidoException;
import excecao.NomeInvalidoException;
import excecao.SenhaInvalidaException;
import excecao.TelefoneInvalidoException;
import LF.Administrador.*;
import LF.Cliente.*;
import LF.Ocorrencia.*;
import LF.Usuario.*;

public class Fachada {
	
	private RpositorioUsuario repUser;
	private RepositorioOcorrencia repOc;
	private static Fachada fachada;
	
	private Fachada()
	{
		repUser.getInstance();
		repOc.getInstance();
	}

	//METODOS ADM
	public void inserirAdm(Administrador adm) throws LoginInvalidoException, CpfInvalidoException,
	NomeInvalidoException, SenhaInvalidaException, CodigoInvalidoException
	{
		repAdm.inserirAdm(adm);
	}
	
	public boolean deletarAdm(String codigo)
	{
		return repAdm.deletarAdm(codigo);
	}
	
	public Administrador procurarAdm(String codigo)
	{
		return repAdm.procurarAdm(codigo);
	}
	
	public boolean atualizarAdm(String login, String senha, String codigo, String novoNome, String novoCpf)
            throws LoginInvalidoException, CpfInvalidoException, NomeInvalidoException, 
            SenhaInvalidaException, CodigoInvalidoException
        {
            return repAdm.atualizarAdm(login, senha,codigo, novoNome, novoCpf);
        }

        //Metodos do Cliente
        public void inserirCliente(Cliente c) throws CpfInvalidoException, TelefoneInvalidoException,
        NomeInvalidoException, SenhaInvalidaException, EmailInvalidoException, EnderecoInvalidoException
        {
            repCli.inserirCliente(c);
	}
	
	public boolean deletarCliente(String cpf)
	{
		return repCli.deletarCliente(cpf);
	}
	
	public boolean atualizarCliente(String login, String cpf, String novoNome, String novoEmail,
            String novoTelefone, String novoEndereco, String senha) throws CpfInvalidoException,
            TelefoneInvalidoException, NomeInvalidoException, SenhaInvalidaException,
            EmailInvalidoException, EnderecoInvalidoException, LoginInvalidoException
	{
            return repCli.atualizarCliente(login, cpf, novoNome, novoEmail, novoTelefone, novoEndereco, senha);
	}
	
	public Cliente procurarCliente(String cpf)
	{
            return repCli.procurarCliente(cpf);
	}
	
	//Metodos da Ocorrencia
	public void inserirOcorrencia(Ocorrencia ocorrencia) throws IdInvalidoException
	{
		repOc.inserirOcorrencia(ocorrencia);
	}
	
	public boolean deletarOcorrencia(String id)
	{
		return repOc.deletarOcorrencia(id);
	}
	
	public boolean atualizarOcorrencia(Ocorrencia ocorrencia) throws IdInvalidoException
	{
		return repOc.atualizarOcorrencia(ocorrencia);
	}
	
	public Ocorrencia procurarOcorrencia(String id)
	{
		return repOc.procurarOcorrencia(id);
	}


	public static Fachada getInstance() {
		if(fachada == null)
		{
			fachada = new Fachada();
		}
		
		return fachada;
	}
}
