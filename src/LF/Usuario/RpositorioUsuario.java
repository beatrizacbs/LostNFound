package LF.Usuario;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class RpositorioUsuario implements IRpositorioUsuario{
	
	private Map<String, Usuario> usuarios;
	private static RpositorioUsuario instance;
	
	private RpositorioUsuario()
	{
		usuarios = new HashMap<String, Usuario>();
	}
	
	public static RpositorioUsuario getInstance()
	{
		if(instance == null)
		{
			instance = new RpositorioUsuario();
		}
		
		return instance;
	}
	
	public void addUsuario(String codigo, Usuario u)
	{
		this.usuarios.put(codigo, u);
	}
	
	public void removeUsuario(String codigo)
	{
		this.usuarios.remove(codigo);
	}
	
	public Usuario procuraUsuario(String codigo)
	{
		return this.usuarios.get(codigo);
	}
	
	public void updateUsuario(String codigo, Usuario u)
	{
		this.usuarios.replace(codigo, u);
	}

	public Collection<Usuario> getUsuario()
	{
		return usuarios.values();
	}
}
