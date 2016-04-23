import java.util.Scanner;
import LF.Administrador.*;
import LF.Cliente.*;
import LF.Ocorrencia.*;
import excecao.CodigoInvalidoException;
import excecao.CpfInvalidoException;
import excecao.EmailInvalidoException;
import excecao.EnderecoInvalidoException;
import excecao.IdInvalidoException;
import excecao.LoginInvalidoException;
import excecao.NomeInvalidoException;
import excecao.SenhaInvalidaException;
import excecao.TelefoneInvalidoException;


public class AplicacaoLF {

	public static void main(String[] args){
		Fachada fachada = new Fachada();
		boolean continuar = true;
		
		while(continuar == true){
			char caracter;
			char a, b;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Bem vindo ao Lost&Found. O que você procura está aqui!");
			
			//Para cadastrar um Cliente:
			System.out.println("Escolha a opção desejada: \n a)Cadastrar Cliente \n b)Sair");
			caracter = entrada.nextLine().charAt(0);
			
			if(caracter == 'a'){
				System.out.println("Informe seu nome: ");
				String nome = entrada.nextLine();
				System.out.println("Informe seu CPF: ");
				String cpf = entrada.nextLine();
				//Pensei em por o login como sendo o cpf da pessoa.. menos trabalho! :)
				System.out.println("Crie seu Login:");
				String login = entrada.nextLine();
				System.out.println("Crie sua senha (de 4 a 6 dígitos): ");
				String senha = entrada.nextLine();
				System.out.println("Informe seu telefone (apenas 8 dígitos):");
				String telefone = entrada.nextLine();
				System.out.println("Informe seu email: ");
				String email = entrada.nextLine();
				System.out.println("Informe seu endereço: ");
				System.out.println("Logradouro: ");
				String logradouro = entrada.nextLine();
				System.out.println("Bairro: ");
				String bairro = entrada.nextLine();
				System.out.println("CEP: ");
				String cep = entrada.nextLine();
				System.out.println("Número: ");
				String numero = entrada.nextLine();
				System.out.println("Complemento : ");
				String complemento = entrada.nextLine();
				System.out.println("Cidade: ");
				String cidade = entrada.nextLine();
				System.out.println("Estado: ");
				String estado = entrada.nextLine();
				
				Endereco end = new Endereco(logradouro, bairro, cep, numero, complemento, cidade, estado);
				Cliente cliente = new Cliente(login, email, senha, end, cpf, telefone, nome);
				
				//TODO  Fazer as exceções depois!
				/*try{
					fachada.inserirCliente(cliente);
				}
				catch(LoginInvalidoException){
					System.out.println("Quantidade de dígidos do CPF inválido.");	
				}
				catch (NomeInvalidoException){
					System.out.println("Quantidade de dígitos inválido.");
				}
				catch... fazer os outros catchs depois!
				*/
			}
			else if (caracter == 'b')
			{
				System.out.println("Você saiu da aplicação.");
				
			}
			else
			{
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		
		//TODO Fazer mais tarde
		//Para cadastrar Administrador:v
		
	}
}
