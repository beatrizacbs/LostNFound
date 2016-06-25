package LF.Usuario;

import excecao.CodigoInvalidoException;
import excecao.UsuarioInexistenteException;
import excecao.UsuarioInvalidoException;
import LF.Administrador.Administrador;
import LF.Cliente.Cliente;

public class ControladorUsuario {
	
	private RpositorioUsuario usuarios;
	private ControladorUsuario instance;
	
	private ControladorUsuario()
	{
		usuarios = usuarios.getInstance();
	}
	
	public ControladorUsuario getInstance()
	{
		if(instance == null)
		{
			instance = new ControladorUsuario();
		}
		
		return instance;
	}
	
	public void inseirUsuario(Usuario u)throws UsuarioInvalidoException
	{
		if(u != null)
		{
			if(u instanceof Cliente)
			{
				usuarios.addUsuario(u.getCpf(), u);
			}
			else if(u instanceof Administrador)
			{
				usuarios.addUsuario(((Administrador) u).getCodigo(), u);
			}
			else
			{
				throw new UsuarioInvalidoException();
			}
		}
		else
		{
			throw new UsuarioInvalidoException();
		}
		
	}
	
	public void removerUsuario(String codigo)throws UsuarioInexistenteException, CodigoInvalidoException
	{
		if(codigo != null)
		{
			if(usuarios.procuraUsuario(codigo) != null)
			{
				usuarios.removeUsuario(codigo);
			}
			else
			{
				throw new UsuarioInexistenteException();
			}
		}
		else
		{
			throw new CodigoInvalidoException();
		}
	}
	
	public void atualizarUsuario(Usuario u)throws UsuarioInexistenteException, UsuarioInvalidoException
	{
		if(u != null)
		{
			if(u instanceof Cliente)
			{
				if(usuarios.procuraUsuario(u.getCpf()) != null)
				{
					usuarios.updateUsuario(u.getCpf(), u);
				}
				else
				{
					throw new UsuarioInexistenteException();
				}

			}
			else if(u instanceof Administrador)
			{
				if(usuarios.procuraUsuario(((Administrador)u).getCodigo()) != null)
				{
					usuarios.updateUsuario(((Administrador)u).getCodigo(), u);
				}
				else
				{
					throw new UsuarioInexistenteException();
				}
			}
			else
			{
				throw new UsuarioInvalidoException();
			}
		}
	}
	
	public Usuario buscarUsuario(String codigo)throws UsuarioInexistenteException
	{
		if(codigo != null)
		{
			return usuarios.procuraUsuario(codigo);
		}
		else
		{
			throw new UsuarioInexistenteException();
		}
	}
	
	//TODO: Depois tem que ajeitar isso aqui.
	public String listarUsuario()
	{
		return this.usuarios.getUsuario().toString();
	}
}
