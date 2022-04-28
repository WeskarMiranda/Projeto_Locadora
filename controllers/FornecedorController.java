package controllers;

import java.util.ArrayList;

import models.Fornecedor;

public class FornecedorController {

    private static ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	
	public static ArrayList<Fornecedor> Listar(){
		return fornecedores;
	}
	
	public static boolean cadastrarForn(Fornecedor fornecedor){
		if( (buscarCnpj(fornecedor.getCnpj()) == null) && buscarId(fornecedor.getIdFornecedor()) == null)  {
			fornecedores.add(fornecedor);
			return true;
		}
		return false;
	}
	
	
	public static Fornecedor buscarCnpj(String cnpj) {
		for(Fornecedor fornecedorCad : fornecedores) {
			if(fornecedorCad.getCnpj().equals(cnpj)) {
				return fornecedorCad;
			}
		}
		return null;
	}

    public static Fornecedor buscarId(String idFornecedor) {
		for(Fornecedor fornecedorCad : fornecedores) {
			if(fornecedorCad.getIdFornecedor().equals(idFornecedor)) {
				return fornecedorCad;
			}
		}
		return null;
	}
	
	
}
