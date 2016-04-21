package LF.Cliente;

public class Endereco {
	
		//Atributos da classe
		private String largadouro;
		private String bairro;
		private String cep;
		private String numero;
		private String complemento;
		private String cidade;
		private String estado;
		
		//Construtor da classe
		public Endereco(String largadouro, String bairro, String cep,
				String numero, String complemento, String cidade, String estado) {
			
			this.largadouro = largadouro;
			this.bairro = bairro;
			this.cep = cep;
			this.numero = numero;
			this.complemento = complemento;
			this.cidade = cidade;
			this.estado = estado;
		}

		//Metodos get e set
		public String getLargadouro() {
			return largadouro;
		}

		public void setLargadouro(String largadouro) {
			this.largadouro = largadouro;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getNumero() {
			return numero;
		}

		public void setNumero(String numero) {
			this.numero = numero;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}
}
