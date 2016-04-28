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
			char caracter, a, b, c, d;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Bem vindo ao Lost&Found. O que você procura está aqui!");
			
			System.out.println("Escolha a opção desejada:\n a)Atualizar\n b)Buscar\n c)Cadastrar\n d)Deletar\n\n");
			caracter = entrada.nextLine().charAt(0);
			
			if(caracter == 'c'){
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
				
				/*
			} else if(caracter == 'a'){
				
				System.out.println("Digite seu nome: \n");
				String nome = entrada.nextLine();
				System.out.println("Digite seu cpf: \n");
				String cpf = entrada.nextLine();
				System.out.println("Crie sua senha (de 6 digitos!): \n");
				String senha = entrada.nextLine();
				System.out.println("Digite seu email: \n");
				String email = entrada.nextLine();
				System.out.println("Digite seu telefone(apenas 8 digitos): \n");
				String telefone = entrada.nextLine();
				
				Cliente cliente = new Cliente(nome, cpf, senha, email, telefone);
				
				try {
					fachada.atualizar(cliente);
				} catch (CpfInvalidoException e) {
					System.out.println("Quantidade de digitos do CPF invalida");
				} catch (TelefoneInvalidoException e) {
					System.out.println("Quantidade de digitos do telefone invalida");
				} catch (SenhaInvalidaException e) {
					System.out.println("Quantidade de digitos insuficiente");
				} catch (NomeInvalidoException e) {
					System.out.println("Quantidade de digitos da senha invalida");
				}
				
			}else if(caracter == 'd'){
				System.out.println("Informe o CPF a ser deletado: \n");
				String cpf = entrada.nextLine();
				
				fachada.deletarCliente(cpf);
				
				
			}else if (caracter == 'b'){
				System.out.println("Informe o CPF: \n");
				String cpf = entrada.nextLine();
				
				Cliente clie =fachada.buscar(cpf);
				System.out.println(clie);
				
			}else
			
				System.out.println("Opcao invalida. Tente novamente.");
		}
		
		
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
