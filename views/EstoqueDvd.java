package views;

import controllers.DvdController;
import models.Dvd;
import views.interfaces.IViews;

public class EstoqueDvd implements IViews {

	@Override
    public void renderizar() {
		DvdController dvdController = new DvdController();
		System.out.println("\n **** DVDs FORA DE ESTOQUE **** \n");
		for (Dvd dvdCad : dvdController.Listar()) {
            // verifica se o estoque de DVD é diferente de 0
            if(dvdCad.getEstoque() == 0){
			System.out.println(dvdCad);
            }
		}
	}

	@Override
	public void printClient() {}
}
