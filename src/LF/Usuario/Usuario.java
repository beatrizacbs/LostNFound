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
			// EXCEÇÃO DE LOGIN INVALIDO
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
			//EXCEÇÃO PRA SENHA INVALIDA
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
			//EXCEÇÃO
			
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
			//EXCEÇÃO
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
