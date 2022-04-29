package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {

    private static Funcionario funcionario;


	public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE FUNCIONARIO **** \n");
		    funcionario = new Funcionario();

			funcionario.setIdFuncionario(Console.readString("ID: "));

			funcionario.setCpf(Console.readString("CPF: "));

            if (FuncionarioController.cadastrarFunc(funcionario)) {

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
	}

