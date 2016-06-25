package LF.Usuario;

import java.util.Collection;

public interface IRpositorioUsuario {
	
	
	public void addUsuario(String codigo, Usuario u);
	
	public void removeUsuario(String codigo);
	
	public Usuario procuraUsuario(String codigo);
	
	public void updateUsuario(String codigo, Usuario u);
	
	public Collection<Usuario> getUsuario();

}
