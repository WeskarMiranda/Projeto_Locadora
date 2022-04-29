package views;

import controllers.DvdController;
import models.Dvd;

public class EstoqueDvd {
    public static void renderizar() {
		System.out.println("\n **** DVDs FORA DE ESTOQUE **** \n");
		for (Dvd dvdCad : DvdController.Listar()) {
            // verifica se o estoque de DVD é diferente de 0
            if(dvdCad.getEstoque() == 0){
			System.out.println(dvdCad);
            }
		}
	}
}
