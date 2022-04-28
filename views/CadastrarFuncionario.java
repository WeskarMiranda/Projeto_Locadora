package views;

import java.util.Scanner;

import controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFuncionario {

    private static Funcionario funcionario;
	private static Scanner ler = new Scanner(System.in);


	public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE FUNCIONARIO **** \n");
		    funcionario = new Funcionario();

            System.out.println("ID: ");
			funcionario.setIdFuncionario(ler.next());

			System.out.println("CPF: ");
			funcionario.setCpf(ler.next());

            if (FuncionarioController.cadastrarFunc(funcionario)) {

				System.out.println("Nome: ");
				funcionario.setNome(ler.next());
				System.out.println("Cargo: ");
				funcionario.setCargo(ler.next());
                System.out.println("Data de cadastro: ");
				funcionario.setDataCad(ler.next());
				System.out.println("Cidade: ");
				funcionario.setCidade(ler.next());
                System.out.println("Estado: ");
				funcionario.setEstado(ler.next());
				System.out.println("\nFUNCIONARIO cadastrado com sucesso");

			} else {
				System.out.println("\nUm FUNCIONARIO com o mesmo CPF ou ID ja existe!");
			}
		
		}
	}

