package LF.Usuario;

import java.util.Collections;

import LF.Administrador.Administrador;
import LF.Cliente.Cliente;
import LF.Excecoes.CodigoInvalidoException;
import LF.Excecoes.UsuarioInexistenteException;
import LF.Excecoes.UsuarioInvalidoException;

public class ControladorUsuario implements IControladorUsuario{
	
	private RpositorioUsuario usuarios;
	private static ControladorUsuario instance;
	
	private ControladorUsuario()
	{
		usuarios = RpositorioUsuario.getInstance();
	}
	
	public static ControladorUsuario getInstance()
	{
		if(instance == null)
		{
			instance = new ControladorUsuario();
		}
		
		return instance;
	}
	
	public void inseirUsuario(Usuario u)throws UsuarioInvalidoException
	{
		System.out.println("Entrou no metodo de inserir usuario do controlador");
		if(u != null)
		{
			if(u instanceof Cliente)
			{
				System.out.println("");
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
		if(!codigo.equals(""))
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
	public Collections listarUsuario()
	{
		return (Collections) this.usuarios.getUsuario();
	}
}
