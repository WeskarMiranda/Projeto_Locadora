package views;

import java.util.Scanner;

import controllers.DvdController;
import models.Dvd;

public class CadastrarDvd {
    
    private static Dvd dvd;
    private static Scanner ler = new Scanner(System.in);

    public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE DVD **** \n");
            dvd = new Dvd();

            System.out.println("ID: ");
			dvd.setIdDvd(ler.next());

            if (DvdController.cadastrarDvd(dvd)) {

				System.out.println("Nome: ");
				dvd.setNome(ler.next());
				System.out.println("Ano de lançamento: ");
				dvd.setAno(ler.next());
				System.out.println("Categoria: ");
				dvd.setCategoria(ler.next());
                System.out.println("Preço: ");
				dvd.setPreco(ler.nextDouble());
                System.out.println("Duração: ");
				dvd.setDuracao(ler.next());
                System.out.println("Estoque: ");
				dvd.setEstoque(ler.nextInt());
				System.out.println("\nDVD cadastrado com sucesso");
                
			} else {
				System.out.println("Um DVD com o mesmo ID ja existe!");
			}
		
		}
	}
