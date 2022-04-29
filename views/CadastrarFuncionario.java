package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {

    private static Funcionario funcionario;


	public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE FUNCIONARIO **** \n");
		    funcionario = new Funcionario();

            System.out.println("ID: ");
			funcionario.setIdFuncionario(Console.readString());

			System.out.println("CPF: ");
			funcionario.setCpf(Console.readString());

            if (FuncionarioController.cadastrarFunc(funcionario)) {

				System.out.println("Nome: ");
				funcionario.setNome(Console.readString());
				System.out.println("Cargo: ");
				funcionario.setCargo(Console.readString());
                System.out.println("Data de cadastro: ");
				funcionario.setDataCad(Console.readString());
				System.out.println("Cidade: ");
				funcionario.setCidade(Console.readString());
                System.out.println("Estado: ");
				funcionario.setEstado(Console.readString());
				System.out.println("\nFUNCIONARIO cadastrado com sucesso");

			} else {
				System.out.println("\nUm FUNCIONARIO com o mesmo CPF ou ID ja existe!");
			}
		
		}
	}

