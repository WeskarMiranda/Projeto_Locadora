package views;

import controllers.FuncionarioController;
import models.Funcionario;
import views.interfaces.IViews;

public class ListarFuncionario implements IViews {
    
	@Override
    public void renderizar() {
		FuncionarioController funcionarioController = new FuncionarioController();
		System.out.println("\n **** LISTAGEM DE FUNCIONARIOS **** \n");
		for (Funcionario funcionarioCad : funcionarioController.Listar()) {
			System.out.println(funcionarioCad);
		}
	}
	
	@Override
	public void printClient() {}
}
