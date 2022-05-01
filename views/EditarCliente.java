package views;

import controllers.ClienteController;
import models.Cliente;
import models.ErroTipo;
import utils.Console;

public class EditarCliente {

	private static String DADOS_FORMAT ="\n* OS DADOS ATUAIS DO CLIENTE COM O CPF %s SÃO:\n";

	private static Cliente cliente;

	public static void renderizar() {
		
		System.out.println("\n **** EDIÇÃO DE CLIENTE **** \n");
		String cpf = Console.readString("Digite o CPF do cliente: ");
		cliente = ClienteController.buscarCpf(cpf);

		if (cliente == null) {
			ErroTipo.erroBusca("cliente", "CPF: ", cpf);
		} else {
			EditarCliente.printClient();
			cliente.setNome(
				Console.readString(
					String.format("Nome: ")
				)
			);
			cliente.setDataCad(
				Console.readString(
					String.format("Data de cadastro: ")
				)
			);
			cliente.setCidade(
				Console.readString(
					String.format("Cidade: ")
				)
			);
			cliente.setEstado(
				Console.readString(
					String.format("Estado: ")
				)
			);
			ClienteController.atualizar(cliente);
			System.out.println("\nCLIENTE cadastrado com sucesso");
		}
	}

	public static void printClient() {
		System.out.println(String.format(DADOS_FORMAT, cliente.getCpf()));
		System.out.println("ID: " + cliente.getIdCliente());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Cadastrado em: " + cliente.getDataCad());
		System.out.println("Cidade: " + cliente.getCidade());
		System.out.println("Estado: " + cliente.getEstado() + "\n");
	}

}