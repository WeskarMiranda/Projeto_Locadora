package views;

import controllers.DvdController;
import models.Dvd;

public class ListarDvd {
    
    public static void renderizar() {
		System.out.println("\n **** LISTAGEM DE DVD **** \n");
		for (Dvd dvdCad : DvdController.Listar()) {
			System.out.println(dvdCad);
		}
	}
	
}