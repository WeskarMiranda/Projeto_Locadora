package views;

import controllers.DvdController;
import models.Dvd;
import views.interfaces.IViews;

public class ListarDvd implements IViews {

    @Override
    public void renderizar() {
		DvdController dvdController = new DvdController();
		System.out.println("\n **** LISTAGEM DE DVD **** \n");
		for (Dvd dvdCad : dvdController.Listar()) {
			System.out.println(dvdCad);
		}
	}
	
	@Override
	public void printClient() {}
}