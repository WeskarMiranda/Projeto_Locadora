package views;

import controllers.ClienteController;
import models.Cliente;
import utils.Console;

public class CadastrarCliente {

	private static Cliente cliente;

	public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE CLIENTE **** \n");
		    cliente = new Cliente();

           
			cliente.setIdCliente(Console.readString("ID: "));

			cliente.setCpf(Console.readString("Cpf: "));

            if (ClienteController.cadastrarCli(cliente)) {
				cliente.setNome(Console.readString("Nome: "));
				cliente.setDataCad(Console.readString("Data de cadastro: "));
				cliente.setCidade(Console.readString("Cidade: "));
				cliente.setEstado(Console.readString("Estado: "));
				System.out.println("\nCLIENTE cadastrado com sucesso");

			} else {
				System.out.println("\nUm CLIENTE com o mesmo CPF ou ID ja existe!");
			}
		
		}
	}

