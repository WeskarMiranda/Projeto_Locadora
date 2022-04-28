package views;

import controllers.ClienteController;
import models.Cliente;


public class ListarCliente {	
	
	public static void renderizar() {
		System.out.println("\n **** LISTAGEM DE CLIENTES **** \n");
		for (Cliente cliCad : ClienteController.listar()) {
			System.out.println(cliCad);
		}
	}
	
}
