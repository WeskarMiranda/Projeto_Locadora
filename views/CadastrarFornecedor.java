package views;

import controllers.FornecedorController;
import models.Fornecedor;
import utils.Console;
import views.interfaces.IViews;

public class CadastrarFornecedor implements IViews {
    
	@Override
    public void renderizar() {
		
		System.out.println("\n **** CADASTRO DE FORNECEDOR **** \n");
            Fornecedor fornecedor = new Fornecedor();
			FornecedorController fornecedorController = new FornecedorController();

			fornecedor.setIdFornecedor(Console.readString("ID: "));

			fornecedor.setCnpj(Console.readString("CNPJ: "));

            if (fornecedorController.cadastrarForn(fornecedor)) {

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
		
	@Override
	public void printClient() {}
	}

