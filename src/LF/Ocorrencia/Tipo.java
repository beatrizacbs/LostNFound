package LF.Ocorrencia;

public enum Tipo {
	
	eletronic("Eletrônico"), 
	escritorio("Escritório"),
	adereco("Adereço"),
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