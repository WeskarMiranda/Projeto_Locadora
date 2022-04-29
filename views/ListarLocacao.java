package views;

import controllers.LocacaoController;
import models.Locacao;

public class ListarLocacao {
    
    public  void renderizar(){
        System.out.println("\n -- LISTAGEM DE LOCACAO -- \n");
        for (Locacao locacaoCadastrada : LocacaoController.listar()) {
            System.out.println(locacaoCadastrada);
        }
    }

}
