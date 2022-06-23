package views;

import controllers.AvaliacaoController;
import models.Avaliacao;
import views.interfaces.IViews;

public class ListarAvaliacao implements IViews {

    @Override
    public  void renderizar(){
        AvaliacaoController sugestaoController = new AvaliacaoController();
        System.out.println("\n -- LISTAGEM DE SUGESTAO -- \n");
        for (Avaliacao avaliacaoCadastrada : sugestaoController.listar()) {
            System.out.println(avaliacaoCadastrada);
        }
    }

    @Override
	public void printClient() {}
}
