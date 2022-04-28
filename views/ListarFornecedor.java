package views;

import controllers.FornecedorController;
import models.Fornecedor;

public class ListarFornecedor {

    public static void renderizar() {
		System.out.println("\n **** LISTAGEM DE CLIENTES **** \n");
		for (Fornecedor fornecedorCad : FornecedorController.Listar()) {
			System.out.println(fornecedorCad);
		}
	}
	
}