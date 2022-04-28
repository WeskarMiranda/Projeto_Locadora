package views;

import java.util.Scanner;
import models.ErroTipo;

public class Main {
	@SuppressWarnings("unused")
	private static Scanner ler = new Scanner(System.in);
	
	public static int Menu() {
		int opcao;
		
		System.out.println("\n **** MENU - Locadora de Videos **** \n");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Listar clientes");
		System.out.println("3 - Cadastrar fornecedor");
		System.out.println("4 - Listar fornecedores");
		System.out.println("5 - Cadastrar DVD ");
		System.out.println("6 - Listar DVD");
		System.out.println("7 - Cadastrar funcionario");
		System.out.println("8 - Listar funcionarios");
		System.out.println("9 - Cadastrar locacao");
		System.out.println("10 - Listar locacoes");
		System.out.println("11 - Editar locacao");
		System.out.println("12 - Retornar locacao\n");
		opcao = ErroTipo.lerNum("Digite a opcao a ser executada: ");
		return opcao;
	}

	public static void main(String[] args) {
		int op;
		
		System.out.println("**** Bem-vindo a Locadora de Videos ****");
		do {
			op = Menu();
			switch (op) 
			{
			case 0: System.out.println("Programa encerrado");break;
			
			case 1: CadastrarCliente.renderizar(); break;
			
			case 2: ListarCliente.renderizar(); break;
			
			case 3: CadastrarFornecedor.renderizar(); break;
				
			case 4: ListarFornecedor.renderizar(); break;
				
			case 5: CadastrarDvd.renderizar(); break;
				
			case 6: ListarDvd.renderizar(); break;
			
			case 7: CadastrarFuncionario.renderizar(); break;
			
			case 8: ListarFuncionario.renderizar(); break;
			
//			case 9: CadastrarLocacao.renderizar(); break;
			
//			case 10: ListarLocacao.renderizar(); break;
			
//			case 11: EditarLocacao.renderizar(); break;
			
//			case 12: RetornarLocacao.renderizar(); break;
			
				
			default:
				System.out.println("Opcao invalida...");
			}
		} while (op!=0);

	}
	
}
