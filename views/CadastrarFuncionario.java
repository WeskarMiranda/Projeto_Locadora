package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;
import views.interfaces.IViews;

public class CadastrarFuncionario implements IViews {

	@Override
	public void renderizar() {
		
		System.out.println("\n **** CADASTRO DE FUNCIONARIO **** \n");
		    Funcionario funcionario = new Funcionario();
			FuncionarioController funcionarioController = new FuncionarioController();

			funcionario.setIdFuncionario(Console.readString("ID: "));

			funcionario.setCpf(Console.readString("CPF: "));

            if (funcionarioController.cadastrarFunc(funcionario)) {

				funcionario.setNome(Console.readString("Nome: "));
				funcionario.setCargo(Console.readString("Cargo: "));
				funcionario.setDataCad(Console.readString("Data de cadastro: "));
				funcionario.setCidade(Console.readString("Cidade: "));
				funcionario.setEstado(Console.readString("Estado: "));
				System.out.println("\nFUNCIONARIO cadastrado com sucesso");

			} else {
				System.out.println("\nUm FUNCIONARIO com o mesmo CPF ou ID ja existe!");
			}
		
		}

	@Override
	public void printClient() {}	
	}

