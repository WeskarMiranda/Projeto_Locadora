package views;

import java.util.Scanner;

import controllers.ClienteController;
import models.Cliente;

public class CadastrarCliente {

	private static Cliente cliente;
	private static Scanner ler = new Scanner(System.in);


	public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE CLIENTE **** \n");
		    cliente = new Cliente();

            System.out.println("ID: ");
			cliente.setIdCliente(ler.next());

			System.out.println("Cpf: ");
			cliente.setCpf(ler.next());

            if (ClienteController.cadastrarCli(cliente)) {

				System.out.println("Nome: ");
				cliente.setNome(ler.next());
				System.out.println("Data de cadastro: ");
				cliente.setDataCad(ler.next());
				System.out.println("Cidade: ");
				cliente.setCidade(ler.next());
                System.out.println("Estado: ");
				cliente.setEstado(ler.next());
				System.out.println("\nCLIENTE cadastrado com sucesso");

			} else {
				System.out.println("Um CLIENTE com o mesmo CPF ou ID ja existe!");
			}
		
		}
	}

