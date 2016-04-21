package LF.Ocorrencia;

public class Ocorrencia{
	
	private String tipo;
	private String caracteristicas;
	private String dataDeEntrada;
	private boolean devolvido;
	
	//Construtor
	//Passei tipo e caracteristicas no construtor, chamando elas das classes tipo e caract
	public Ocorrencia(Tipo tipo, Caract caracteristicas, String dataDeEntrada,
			boolean devolvido)
	{
		
		this.dataDeEntrada = dataDeEntrada;
		this.devolvido = false;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getDataDeEntrada() {
		return dataDeEntrada;
	}

	public void setDataDeEntrada(String dataDeEntrada) {
		this.dataDeEntrada = dataDeEntrada;
	}

	public boolean isDevolvido() {
		return devolvido;
	}

	public void setDevolvido(boolean devolvido) {
		this.devolvido = devolvido;
	}
}
