package LF.Ocorrencia;

public class Ocorrencia{
	
	private String tipo;
	private Caract caracteristicas;
	private String dataDeEntrada;
	private boolean devolvido;
	private String id;
	
	//Construtor
	public Ocorrencia(Tipo tipo, Caract caracteristicas, String dataDeEntrada,
			boolean devolvido, String id)
	{
		this.dataDeEntrada = dataDeEntrada;
		this.devolvido = false;
		this.id = id;
		
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Caract getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(Caract caracteristicas) {
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
	public String getId(){
		return id;
	}
	public void setId(String id){
		this.id = id;
	}

	@Override
	public String toString() {
		return "Ocorrencia [tipo = " + tipo + ", caracteristicas = "
				+ caracteristicas + ", dataDeEntrada = " + dataDeEntrada
				+ ", devolvido = " + devolvido + ", id = " + id + "]";
	}
	
	
}
