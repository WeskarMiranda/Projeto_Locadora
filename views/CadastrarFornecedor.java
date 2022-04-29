package views;

import controllers.FornecedorController;
import models.Fornecedor;
import utils.Console;

public class CadastrarFornecedor {
    
    private static Fornecedor fornecedor;

    public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE FORNECEDOR **** \n");
            fornecedor = new Fornecedor();

			fornecedor.setIdFornecedor(Console.readString("ID: "));

			fornecedor.setCnpj(Console.readString("CNPJ: "));

            if (FornecedorController.cadastrarForn(fornecedor)) {

				fornecedor.setNome(Console.readString("Nome: "));
				fornecedor.setTelefone(Console.readString("Telefone: "));
				fornecedor.setCidade(Console.readString("Cidade: "));
				fornecedor.setEstado(Console.readString("Estado: "));
				fornecedor.setPais(Console.readString("País: "));
				System.out.println("\nFORNECEDOR cadastrado com sucesso");
                
			} else {
				System.out.println("\nUm FORNECEDOR com o mesmo CNPJ ou ID ja existe!");
			}
		
		}
	}

