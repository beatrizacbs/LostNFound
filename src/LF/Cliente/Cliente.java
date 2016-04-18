package LF.Cliente;

import LF.Usuario.Usuario;

public class Cliente extends Usuario {

	private String email;
	private String endereco;
	private String telefone;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email == null)
		{
			//EXCESS�O
		}else
		{
			this.email = email;
		}
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		if(endereco == null)
		{
			//EXCESS�O
		}else
		{
			this.endereco = endereco;
		}
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		if(telefone == null)
		{
			//EXCESS�O
		}else
		{
			this.telefone = telefone;
		}
	}
	
	public Cliente(String login, String email, String senha, String endereco, String cpf, String telefone, String nome)
	{
		super(login, senha, cpf, nome);
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	
}
