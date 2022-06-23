package views;

import controllers.ClienteController;
import models.Cliente;
import utils.Console;
import views.interfaces.IViews;

public class CadastrarCliente implements IViews {

	@Override
	public void renderizar() {
		
		System.out.println("\n **** CADASTRO DE CLIENTE **** \n");
		    Cliente cliente = new Cliente();
			ClienteController clienteController = new ClienteController();

           
			cliente.setIdCliente(Console.readString("ID: "));

			cliente.setCpf(Console.readString("Cpf: "));

            if (clienteController.cadastrarCli(cliente)) {
				cliente.setNome(Console.readString("Nome: "));
				cliente.setDataCad(Console.readString("Data de cadastro: "));
				cliente.setCidade(Console.readString("Cidade: "));
				cliente.setEstado(Console.readString("Estado: "));
				System.out.println("\nCLIENTE cadastrado com sucesso");

			} else {
				System.out.println("\nUm CLIENTE com o mesmo CPF ou ID ja existe!");
			}
		
		}

	@Override
	public void printClient() {}
	}

