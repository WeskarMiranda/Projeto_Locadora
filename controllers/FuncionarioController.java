package controllers;

import java.util.ArrayList;

import controllers.interfaces.IFuncionarioController;
import models.Funcionario;

public class FuncionarioController implements IFuncionarioController {
    
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	@Override
	public ArrayList<Funcionario> Listar(){
		return funcionarios;
	}
	
	@Override
	public boolean cadastrarFunc(Funcionario funcionario){
		if( (buscarCpf(funcionario.getCpf()) == null) && buscarIdFuncionario(funcionario.getIdFuncionario()) == null)  {
			funcionarios.add(funcionario);
			return true;
		}
		return false;
	}
	
	@Override
	public Funcionario buscarCpf(String cpf) {
		for(Funcionario funcionarioCad : funcionarios) {
			if(funcionarioCad.getCpf().equals(cpf)) {
				return funcionarioCad;
			}
		}
		return null;
	}

	@Override
    public Funcionario buscarIdFuncionario(String idFuncionario) {
		for(Funcionario funcionarioCad : funcionarios) {
			if(funcionarioCad.getIdFuncionario().equals(idFuncionario)) {
				return funcionarioCad;
			}
		}
		return null;
	}
	
}