package views;

import controllers.SugestaoController;
import models.Sugestao;

public class ListarSugestao {
    
    public  void renderizar(){
        SugestaoController sugestaoController = new SugestaoController();
        System.out.println("\n -- LISTAGEM DE SUGESTAO -- \n");
        for (Sugestao sugestaoCadastrada : sugestaoController.listar()) {
            System.out.println(sugestaoCadastrada);
        }
    }
}
