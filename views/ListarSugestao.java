package views;

import controllers.SugestaoController;
import models.Sugestao;
import views.interfaces.IViews;

public class ListarSugestao implements IViews {
    
    @Override
    public void renderizar(){
        SugestaoController sugestaoController = new SugestaoController();
        System.out.println("\n -- LISTAGEM DE SUGESTAO -- \n");
        for (Sugestao sugestaoCadastrada : sugestaoController.listar()) {
            System.out.println(sugestaoCadastrada);
        }
    }
    
    @Override
	public void printClient() {}
}
