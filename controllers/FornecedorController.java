package controllers;

import java.util.ArrayList;

import controllers.interfaces.IFornecedorController;
import models.Fornecedor;

public class FornecedorController implements IFornecedorController {

    private static ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	@Override
	public ArrayList<Fornecedor> Listar(){
		return fornecedores;
	}
	
	@Override
	public boolean cadastrarForn(Fornecedor fornecedor){
		if( (buscarCnpj(fornecedor.getCnpj()) == null) && buscarId(fornecedor.getIdFornecedor()) == null)  {
			fornecedores.add(fornecedor);
			return true;
		}
		return false;
	}
	
	@Override
	public Fornecedor buscarCnpj(String cnpj) {
		for(Fornecedor fornecedorCad : fornecedores) {
			if(fornecedorCad.getCnpj().equals(cnpj)) {
				return fornecedorCad;
			}
		}
		return null;
	}

	@Override
    public Fornecedor buscarId(String idFornecedor) {
		for(Fornecedor fornecedorCad : fornecedores) {
			if(fornecedorCad.getIdFornecedor().equals(idFornecedor)) {
				return fornecedorCad;
			}
		}
		return null;
	}
	
}
