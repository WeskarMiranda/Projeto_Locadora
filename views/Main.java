package views;

import java.util.Scanner;
import models.ErroTipo;

public class Main {
	@SuppressWarnings("unused")
	private static Scanner ler = new Scanner(System.in);
	
	public static int Menu() {
		int opcao;
		
		System.out.println("\n **** MENU - LOCADORA DE VIDEOS **** \n");
		System.out.println("0 - Sair");
		System.out.println("1 - Cadastrar cliente");
		System.out.println("2 - Listar clientes");
		System.out.println("3 - Editar cliente");
		System.out.println("4 - Excluir cliente");
		System.out.println("5 - Cadastrar fornecedor");
		System.out.println("6 - Listar fornecedores");
		System.out.println("7 - Cadastrar DVD ");
		System.out.println("8 - Listar DVD");
		System.out.println("9 - Cadastrar funcionario");
		System.out.println("10 - Listar funcionarios");
		System.out.println("11 - Cadastrar locacao");
		System.out.println("12 - Listar locacoes");
		System.out.println("13 - Verificar quais DVDs estao fora de estoque");
		System.out.println("14 - Verificar clientes com multas");
		System.out.println("15 - Anotar uma Sugestao");
		System.out.println("16 - Listar sugestoes");
		System.out.println("17 - Avaliacao dos clientes");
		System.out.println("18 - listar avaliaçoes");


		
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

			case 3: EditarCliente.renderizar(); break;

			case 4: RemoverCliente.renderizar(); break;

			case 5: CadastrarFornecedor.renderizar(); break;
				
			case 6: ListarFornecedor.renderizar(); break;
				
			case 7: CadastrarDvd.renderizar(); break;
				
			case 8: ListarDvd.renderizar(); break;
			
			case 9: CadastrarFuncionario.renderizar(); break;
			
			case 10: ListarFuncionario.renderizar(); break;
			
			case 11: CadastrarLocacao.renderizar(); break;
			
			case 12: ListarLocacao listarLocacao = new ListarLocacao();
			listarLocacao.renderizar(); break;
			
			case 13: EstoqueDvd.renderizar(); break;
			
			case 14: Multas.renderizar(); break;

			case 15: CadastrarSugestao.renderizar(); break;
			
			case 16: ListarSugestao listarSugestao = new ListarSugestao();
			listarSugestao.renderizar(); break;

			case 17: CadastrarAvalicao.renderizar();; break;

			case 18: ListarAvaliacao listarAvaliacao = new ListarAvaliacao();
			listarAvaliacao.renderizar(); break;
				
			default:
				System.out.println("Opcao invalida...");
			}
		} while (op!=0);

	}
	
}
