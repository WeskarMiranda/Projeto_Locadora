package views;

import controllers.ClienteController;
import models.Cliente;
import views.interfaces.IViews;

public class ListarCliente implements IViews {	

	@Override
	public void renderizar() {
		ClienteController clienteController = new ClienteController();
		System.out.println("\n **** LISTAGEM DE CLIENTES **** \n");
		for (Cliente cliCad : clienteController.listar()) {
			System.out.println(cliCad);
		}
	}
	
	@Override
	public void printClient() {}
}
