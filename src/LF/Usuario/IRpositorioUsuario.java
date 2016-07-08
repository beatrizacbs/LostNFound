package LF.Usuario;

import java.util.Collection;

import LF.Excecoes.UsuarioInexistenteException;

public interface IRpositorioUsuario {
	
	
	public void addUsuario(String codigo, Usuario u);
	
	public void removeUsuario(String codigo);
	
	public Usuario procuraUsuario(String codigo) throws UsuarioInexistenteException;
	
	public void updateUsuario(String codigo, Usuario u);
	
	public Collection getUsuario();

}
