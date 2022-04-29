package views;

import controllers.DvdController;
import models.Dvd;
import utils.Console;

public class CadastrarDvd {
    
    private static Dvd dvd;

    public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE DVD **** \n");
            dvd = new Dvd();

			dvd.setIdDvd(Console.readString("ID: "));

            if (DvdController.cadastrarDvd(dvd)) {

				dvd.setNome(Console.readString("Nome: "));
				dvd.setAno(Console.readString("Ano de lançamento: "));
				dvd.setCategoria(Console.readString("Categoria: "));
				dvd.setPreco(Console.readDouble("Preço: "));
				dvd.setDuracao(Console.readString("Duração: "));
				dvd.setEstoque(Console.readInt("Estoque: "));
				System.out.println("\nDVD cadastrado com sucesso");
                
			} else {
				System.out.println("\nUm DVD com o mesmo ID ja existe!");
			}
		
		}
	}
