package views;

import controllers.ClienteController;
import models.Cliente;
import models.ErroTipo;
import utils.Console;
import views.interfaces.IViews;

public class RemoverCliente implements IViews {

	private static Cliente cliente;

	@Override
	public void renderizar() {
		ClienteController clienteController = new ClienteController();
		System.out.println("\n **** EXCLUIR CLIENTE **** \n");
		String cpf = Console.readString("Digite o CPF do cliente: ");
		cliente = clienteController.buscarCpf(cpf);
		
            if (cliente == null) {
				ErroTipo.erroBusca("cliente", "CPF: ", cpf);			
			} else {
                clienteController.excluirCliente(cliente);
                System.out.println("\nCLIENTE excluido com sucesso");
        }
			
	}

	@Override
	public void printClient() {}
}