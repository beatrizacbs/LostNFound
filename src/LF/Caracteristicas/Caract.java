package LF.Ocorrencia;

public class Caract {
	
	private String cor;
	private String tamanho;
	private boolean danoFisico;
	
	//Construtor da classe
	public Caract(String cor, String tamanho, boolean danoFisico) {
		
		this.cor = cor;
		this.tamanho = tamanho;
		this.danoFisico = danoFisico;
	}

	//Metodos get e set
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public boolean isDanoFisico() {
		return danoFisico;
	}

	public void setDanoFisico(boolean danoFisico) {
		this.danoFisico = danoFisico;
	}
	
}
