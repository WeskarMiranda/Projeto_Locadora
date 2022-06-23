package views;

import controllers.SugestaoController;
import models.Sugestao;
import utils.Console;
import views.interfaces.IViews;

public class CadastrarSugestao implements IViews {

    @Override
    public void renderizar() {
        
    Sugestao sugestao = new Sugestao();
    SugestaoController sugestaoController = new SugestaoController();

    sugestao.setFilme(Console.readString("Filme: "));

    if (sugestaoController.CadastrarSugestao(sugestao)) {

        sugestao.setVezes(sugestao.getVezes());

        int i = sugestao.getVezes() + 1;

        sugestao.setVezes((i + 1));
	

    }else{

        sugestao.setVezes(1);
  
    }
    
    sugestaoController.cadastrar(sugestao);
    
    System.out.println("Obrigado pela Sugestao!!");


}

@Override
public void printClient() {}
}
