package views;

import java.util.Scanner;

import controllers.FornecedorController;
import models.Fornecedor;

public class CadastrarFornecedor {
    
    private static Fornecedor fornecedor;
    private static Scanner ler = new Scanner(System.in);

    public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE FORNECEDOR **** \n");
            fornecedor = new Fornecedor();

            System.out.println("ID: ");
			fornecedor.setIdFornecedor(ler.next());

			System.out.println("CNPJ: ");
			fornecedor.setCnpj(ler.next());

            if (FornecedorController.cadastrarForn(fornecedor)) {

				System.out.println("Nome: ");
				fornecedor.setNome(ler.next());
				System.out.println("Telefone: ");
				fornecedor.setTelefone(ler.next());
				System.out.println("Cidade: ");
				fornecedor.setCidade(ler.next());
                System.out.println("Estado: ");
				fornecedor.setEstado(ler.next());
                System.out.println("País: ");
				fornecedor.setPais(ler.next());
				System.out.println("\nFORNECEDOR cadastrado com sucesso");
                
			} else {
				System.out.println("Um FORNECEDOR com o mesmo CNPJ ou ID ja existe!");
			}
		
		}
	}

