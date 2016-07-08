package LF.Ocorrencia;

public enum Tipo {
	
	eletronic("Eletronico"), 
	escritorio("Escritorio"),
	adereco("Adereco"),
	vestimenta("Vesimenta"),
	outro("Outros");
	
	private String nome;
	
	Tipo(String nome)
	{
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
	
}