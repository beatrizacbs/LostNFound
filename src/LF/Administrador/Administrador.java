package LF.Administrador;

import LF.Usuario.Usuario;

public class Administrador extends Usuario{

	private String codigo;
	
	public Administrador(String codigo, String login, String senha, String cpf, String nome)
	{
		super(login, senha, cpf, nome);
		this.codigo = codigo;
	}
	
	public String getCodigo()
	{
		return this.codigo;
	}
	
}
