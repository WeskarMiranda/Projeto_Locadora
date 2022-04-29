package views;

import controllers.DvdController;
import models.Dvd;
import utils.Console;

public class CadastrarDvd {
    
    private static Dvd dvd;

    public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE DVD **** \n");
            dvd = new Dvd();

            System.out.println("ID: ");
			dvd.setIdDvd(Console.readString());

            if (DvdController.cadastrarDvd(dvd)) {

				System.out.println("Nome: ");
				dvd.setNome(Console.readString());
				System.out.println("Ano de lançamento: ");
				dvd.setAno(Console.readString());
				System.out.println("Categoria: ");
				dvd.setCategoria(Console.readString());
                System.out.println("Preço: ");
				dvd.setPreco(Console.readDouble());
                System.out.println("Duração: ");
				dvd.setDuracao(Console.readString());
                System.out.println("Estoque: ");
				dvd.setEstoque(Console.readInt());
				System.out.println("\nDVD cadastrado com sucesso");
                
			} else {
				System.out.println("\nUm DVD com o mesmo ID ja existe!");
			}
		
		}
	}
