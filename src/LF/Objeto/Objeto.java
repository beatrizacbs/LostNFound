package LF.Objeto;

public class Objeto {
	
	private String tipo;
	private String caracteristicas;
	private String dataDeEntrada;
	private boolean devolvido;
	
	public Objeto(String tipo, String caracteristicas, String dataDeEntrada)
	{
		this.tipo = tipo;
		this.caracteristicas = caracteristicas;
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
