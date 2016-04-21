package LF.Ocorrencia;

public class Tipo {
	
	private boolean eletronico;
	private boolean escritorio;
	private boolean adereco;
	private boolean vestimenta;
	private String outro;
	
	//Construtor da classe Tipo
	public Tipo(boolean eletronico, boolean escritorio, boolean adereco,
			boolean vestimenta, String outro) {
		
		this.eletronico = eletronico;
		this.escritorio = escritorio;
		this.adereco = adereco;
		this.vestimenta = vestimenta;
		this.outro = outro;
	}

	
	//Metodos get e set
	public boolean isEletronico() {
		return eletronico;
	}

	public void setEletronico(boolean eletronico) {
		this.eletronico = eletronico;
	}

	public boolean isEscritorio() {
		return escritorio;
	}

	public void setEscritorio(boolean escritorio) {
		this.escritorio = escritorio;
	}

	public boolean isAdereco() {
		return adereco;
	}

	public void setAdereco(boolean adereco) {
		this.adereco = adereco;
	}

	public boolean isVestimenta() {
		return vestimenta;
	}

	public void setVestimenta(boolean vestimenta) {
		this.vestimenta = vestimenta;
	}

	public String getOutro() {
		return outro;
	}

	public void setOutro(String outro) {
		this.outro = outro;
	}
	
}
