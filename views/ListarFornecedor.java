package views;

import controllers.FornecedorController;
import models.Fornecedor;
import views.interfaces.IViews;

public class ListarFornecedor implements IViews {

	@Override
    public void renderizar() {
		FornecedorController fornecedorController = new FornecedorController();
		System.out.println("\n **** LISTAGEM DE CLIENTES **** \n");
		for (Fornecedor fornecedorCad : fornecedorController.Listar()) {
			System.out.println(fornecedorCad);
		}
	}
	
	@Override
	public void printClient() {}
}