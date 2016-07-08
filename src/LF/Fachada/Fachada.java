package LF.Fachada;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import LF.Administrador.Administrador;
import LF.Cliente.Cliente;
import LF.Cliente.Endereco;
import LF.Excecoes.AlgoEstaFaltandoException;
import LF.Excecoes.CodigoInvalidoException;
import LF.Excecoes.OcorrenciaInexistenteException;
import LF.Excecoes.OcorrenciaInvalidaException;
import LF.Excecoes.UsuarioInexistenteException;
import LF.Excecoes.UsuarioInvalidoException;
import LF.Ocorrencia.*;
import LF.Usuario.*;

public class Fachada {
	
	private ControladorUsuario usuario;
	private ControladorOcorrencia ocorrencia;
	private static Fachada instance;
	
	// SINGLETON
	private Fachada()
	{
		usuario = ControladorUsuario.getInstance();
		ocorrencia = ControladorOcorrencia.getInstance();
	}
	
	public static Fachada getInstance() {
		if(instance == null)
		{
			instance = new Fachada();
		}
		
		return instance;
	}

	
	//METODOS USUARIO
	
	/*public Collection listarUsuario()	{
		return this.usuario.listarUsuario();
	}*/
	
	//Metodo de verificação de login (se eh Adm ou cliente)
		public Usuario verificadorLogin(String login, String senha) throws UsuarioInexistenteException{
			Usuario aux;
			try {
				aux = usuario.buscarUsuario(login);
				
				if(aux.getSenha().equals(senha))
				{
					if(aux instanceof Cliente)
					{
						return aux;
					}
					else if(aux instanceof Administrador)
					{
						return aux;
					}
				}
				
			} catch (UsuarioInexistenteException e) {
				
				throw new UsuarioInexistenteException();
			}
			return null;
			
		}
	
	public void inserirUsuario(String nome, String cpf, String email, String codigo, String telefone, String login, String senha,
			String logradouro, String bairro, String cep, String numero, String complemento, String cidade, String estado)
	throws AlgoEstaFaltandoException, UsuarioInvalidoException
	{
		if(!codigo.equals(""))
		{
			if(login.equals("") || senha.equals("") || cpf.equals("") || nome.equals(""))
			{
				throw new AlgoEstaFaltandoException();
				
			}
			else
			{
				try {
					
					usuario.inseirUsuario(new Administrador(codigo, login, senha, cpf, nome));
				} catch (UsuarioInvalidoException e) {
					
					throw new UsuarioInvalidoException();
				}
			}
		}
		else
		{
			if(login.equals("") || senha.equals("") || cpf.equals("") || nome.equals(""))
			{
				throw new AlgoEstaFaltandoException();
			}
			else
			{
				// TODO: EU ACHO QUE AQUI DEPOIS A GENTE VAI TER QUE COLOCAR UM TRY/CATCH
				usuario.inseirUsuario(new Cliente(login, email, senha, cpf, telefone, nome, this.novoEndereco(logradouro,
				bairro, cep, numero, complemento, cidade, estado)));
			}
			
		}
	}

	private Endereco novoEndereco(String logradouro, String bairro, String cep,
			String numero, String complemento, String cidade, String estado) throws AlgoEstaFaltandoException {
		
		if(logradouro == null || bairro == null || cep == null || numero == null || complemento == null || cidade == null || estado
				== null)
		{
			throw new AlgoEstaFaltandoException();
		}
		return new Endereco(logradouro, bairro, cep, numero, complemento, cidade, estado);
		
	}
	
	public void removerUsuario(String codigo) throws UsuarioInexistenteException, CodigoInvalidoException
	{
		if(codigo.length() != 4)
		{
			try {
				usuario.removerUsuario(null);
			} catch (UsuarioInexistenteException e) {
				
				throw new UsuarioInexistenteException();
				
			} catch (CodigoInvalidoException e) {
				
				throw new CodigoInvalidoException();
			}
		}
		else
		{
			usuario.removerUsuario(codigo);
		}
	}
	
	//TODO: TEM QUE FAZER AQUI AINDA
	public void atualizarUsuario(String nome, String cpf, String email, String codigo, String telefone, String login, String senha)
	{
		
	}
	
	public void atualizarEndereco(String logradouro, String bairro, String cep, String numero, String complemento, String cidade, String estado)
	{
		
		
	}
	
	public Usuario buscarUsuario(String codigo) throws UsuarioInexistenteException, CodigoInvalidoException
	{
		if(codigo.length() == 4 || codigo.length() == 11)
		{
			try {
				return usuario.buscarUsuario(codigo);
			} catch (UsuarioInexistenteException e) {
				throw new UsuarioInexistenteException();
			}
		}
		else
		{
			try
			{
				return usuario.buscarUsuario(null);
			} 
			catch(UsuarioInexistenteException e)
			{
				throw new CodigoInvalidoException();
			}
			
			
		}
	}
	
	//METODOS OCORRENCIA
	
	public void inserirOcorrencia(Tipo tipo, Caract caracteristica, String dataEntrada, boolean devolvido, String id) 
	throws OcorrenciaInvalidaException
	{
		if(caracteristica != null)
		{
			try {
				ocorrencia.inserirOcorrencia(new Ocorrencia(tipo, caracteristica, dataEntrada, false, id));
			} catch (OcorrenciaInvalidaException e) {
				throw new OcorrenciaInvalidaException();
			}
		}
	}

	public void removerOcorrencia(String id) throws OcorrenciaInvalidaException, OcorrenciaInexistenteException
	{
		if(id != null)
		{
			try {
				ocorrencia.removerOcorrencia(id);
				
			} catch (OcorrenciaInvalidaException e) {
				
				throw new OcorrenciaInvalidaException();
				
			} catch (OcorrenciaInexistenteException e) {
				
				throw new OcorrenciaInexistenteException();
			}
		}
		else
		{
			throw new OcorrenciaInvalidaException();
		}
	}

	//TODO: TEM QUE FAZER ESSE TAMBEM
	public void atualizarOcorrencia(Tipo tipo, Caract caracteristica, String dataEntrada, boolean devolvido, String id)
	{
		
	}
	
	public Ocorrencia buscarOcorrencia(String id) throws OcorrenciaInvalidaException, OcorrenciaInexistenteException
	{
		if(id != null)
		{
			try {
				return ocorrencia.buscarOcorrencia(id);
			} catch (OcorrenciaInexistenteException e) {
				throw new OcorrenciaInexistenteException();
			}
		}
		else
		{
			throw new OcorrenciaInvalidaException();
		}
	}
	
	//TODO: ESSE AQUI AINDA NAO DESCOBRIR COMO VOU FAZER MAS VAI TÁ PRONTO
	
	public Collections listarOcorrencia()
	{
		return  ocorrencia.listarOcorrencia();
	}
	
	
	
	
}
