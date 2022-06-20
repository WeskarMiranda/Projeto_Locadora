package views;

import controllers.SugestaoController;
import models.Sugestao;
import utils.Console;

public class CadastrarSugestao {

    private static Sugestao sugestao;

    public static void renderizar() {
        
    sugestao = new Sugestao();

    sugestao.setFilme(Console.readString("Filme: "));

    if (SugestaoController.CadastrarSugestao(sugestao)) {

        sugestao.setVezes(sugestao.getVezes());

        int i = sugestao.getVezes() + 1;

        sugestao.setVezes((i + 1));
	

    }else{

        sugestao.setVezes(1);
  
    }
    
    SugestaoController.cadastrar(sugestao);
    
    System.out.println("Obrigado pela Sugestao!!");


}
}
