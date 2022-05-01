package views;

import controllers.ClienteController;
import models.Cliente;
import models.ErroTipo;
import utils.Console;

public class RemoverCliente {

	private static Cliente cliente;

	public static void renderizar() {
		
		System.out.println("\n **** EXCLUIR CLIENTE **** \n");
		String cpf = Console.readString("Digite o CPF do cliente: ");
		cliente = ClienteController.buscarCpf(cpf);
		
            if (cliente == null) {
				ErroTipo.erroBusca("cliente", "CPF: ", cpf);			
			} else {
                ClienteController.excluirCliente(cliente);
                System.out.println("\nCLIENTE excluido com sucesso");
        }
			
	}

}