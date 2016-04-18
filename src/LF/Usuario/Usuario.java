package LF.Usuario;

public class Usuario {
	
	private String login;
	private String senha;
	private String cpf;
	private String nome;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		if(login == null)
		{
			// EXCESS�O DE LOGIN INVALIDO
		}
		else
		{
			this.login = login;
		}
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		if(senha == null)
		{
			//EXCESS�O PRA SENHA INVALIDA
		}
		else
		{
			this.senha = senha;
		}
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		
		if(cpf == null)
		{
			//EXCESS�O
			
		}
		else
		{
			this.cpf = cpf;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		if(nome == null)
		{
			//EXCESS�O
		}else
		{
			this.nome = nome;
		}
	}

	public Usuario(String login, String senha, String cpf, String nome)
	{
		this.login = login;
		this.senha = senha;
		this.cpf = cpf;
		this.nome = nome;
	}
}
