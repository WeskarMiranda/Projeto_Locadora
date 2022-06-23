package views;

import controllers.LocacaoController;
import models.Locacao;
import views.interfaces.IViews;

public class ListarLocacao implements IViews {
    
    @Override
    public void renderizar(){
        LocacaoController locacaoController = new LocacaoController();
        System.out.println("\n -- LISTAGEM DE LOCACAO -- \n");
        for (Locacao locacaoCadastrada : locacaoController.listar()) {
            System.out.println(locacaoCadastrada);
        }
    }

    @Override
	public void printClient() {}
}
