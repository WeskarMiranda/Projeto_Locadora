package views;

import java.util.Date;
import controllers.LocacaoController;
import models.Locacao;
import views.interfaces.IViews;

public class Multas implements IViews {
	
	@Override
    public void renderizar() { 
		// Cria a variavel de data com a data atual 
		Date dataatual = new Date();
		LocacaoController locacaoController = new LocacaoController();
		
		for (Locacao locacaoCadastrada : locacaoController.listar()){
			//Faz a verificacao se a data prevista para entrega é  menor que a data atual
        if(locacaoCadastrada.Dataconvertida1.before(dataatual) ){
		System.out.println("\n **** LISTAGEM DE CLIENTES COM MULTA **** \n");
		
			System.out.println(locacaoCadastrada);
		}
	}
  
    
}

@Override
public void printClient() {}
}

