package views;

import controllers.ClienteController;
import models.Cliente;
import utils.Console;

public class CadastrarCliente {

	private static Cliente cliente;

	public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE CLIENTE **** \n");
		    cliente = new Cliente();

            System.out.println("ID: ");
			cliente.setIdCliente(Console.readString());

			System.out.println("Cpf: ");
			cliente.setCpf(Console.readString());

            if (ClienteController.cadastrarCli(cliente)) {

				System.out.println("Nome: ");
				cliente.setNome(Console.readString());
				System.out.println("Data de cadastro: ");
				cliente.setDataCad(Console.readString());
				System.out.println("Cidade: ");
				cliente.setCidade(Console.readString());
                System.out.println("Estado: ");
				cliente.setEstado(Console.readString());
				System.out.println("\nCLIENTE cadastrado com sucesso");

			} else {
				System.out.println("\nUm CLIENTE com o mesmo CPF ou ID ja existe!");
			}
		
		}
	}

