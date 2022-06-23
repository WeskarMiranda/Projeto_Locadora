package views;

import controllers.ClienteController;
import models.Cliente;
import models.ErroTipo;
import utils.Console;
import views.interfaces.IViews;

public class EditarCliente implements IViews {

	private static String DADOS_FORMAT ="\n* OS DADOS ATUAIS DO CLIENTE COM O CPF %s SÃO:\n";

	private static Cliente cliente;

	@Override
	public void renderizar() {

		EditarCliente editarCliente = new EditarCliente(); 
		ClienteController clienteController = new ClienteController();
		
		System.out.println("\n **** EDIÇÃO DE CLIENTE **** \n");
		String cpf = Console.readString("Digite o CPF do cliente: ");
		cliente = clienteController.buscarCpf(cpf);


		if (cliente == null) {
			ErroTipo.erroBusca("cliente", "CPF: ", cpf);
		} else {
			editarCliente.printClient();
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
			clienteController.atualizar(cliente);
			System.out.println("\nCLIENTE cadastrado com sucesso");
		}
	}

	@Override
	public void printClient() {
		System.out.println(String.format(DADOS_FORMAT, cliente.getCpf()));
		System.out.println("ID: " + cliente.getIdCliente());
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Cadastrado em: " + cliente.getDataCad());
		System.out.println("Cidade: " + cliente.getCidade());
		System.out.println("Estado: " + cliente.getEstado() + "\n");
	}

}