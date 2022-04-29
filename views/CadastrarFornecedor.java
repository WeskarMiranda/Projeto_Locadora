package views;

import controllers.FornecedorController;
import models.Fornecedor;
import utils.Console;

public class CadastrarFornecedor {
    
    private static Fornecedor fornecedor;

    public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE FORNECEDOR **** \n");
            fornecedor = new Fornecedor();

            System.out.println("ID: ");
			fornecedor.setIdFornecedor(Console.readString());

			System.out.println("CNPJ: ");
			fornecedor.setCnpj(Console.readString());

            if (FornecedorController.cadastrarForn(fornecedor)) {

				System.out.println("Nome: ");
				fornecedor.setNome(Console.readString());
				System.out.println("Telefone: ");
				fornecedor.setTelefone(Console.readString());
				System.out.println("Cidade: ");
				fornecedor.setCidade(Console.readString());
                System.out.println("Estado: ");
				fornecedor.setEstado(Console.readString());
                System.out.println("País: ");
				fornecedor.setPais(Console.readString());
				System.out.println("\nFORNECEDOR cadastrado com sucesso");
                
			} else {
				System.out.println("\nUm FORNECEDOR com o mesmo CNPJ ou ID ja existe!");
			}
		
		}
	}

