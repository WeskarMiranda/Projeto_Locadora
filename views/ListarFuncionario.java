package views;

import controllers.FuncionarioController;
import models.Funcionario;

public class ListarFuncionario {
    
    public static void renderizar() {
		System.out.println("\n **** LISTAGEM DE FUNCIONARIOS **** \n");
		for (Funcionario funcionarioCad : FuncionarioController.Listar()) {
			System.out.println(funcionarioCad);
		}
	}
	
}
