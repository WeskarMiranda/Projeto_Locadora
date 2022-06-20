package views;

import controllers.AvaliacaoController;
import models.Avaliacao;

public class ListarAvaliacao {

    public  void renderizar(){
        AvaliacaoController sugestaoController = new AvaliacaoController();
        System.out.println("\n -- LISTAGEM DE SUGESTAO -- \n");
        for (Avaliacao avaliacaoCadastrada : sugestaoController.listar()) {
            System.out.println(avaliacaoCadastrada);
        }
    }
}
