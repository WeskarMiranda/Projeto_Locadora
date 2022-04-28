package controllers;

import java.util.ArrayList;

import models.Funcionario;

public class FuncionarioController {
    
    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	
	public static ArrayList<Funcionario> Listar(){
		return funcionarios;
	}
	
	public static boolean cadastrarFunc(Funcionario funcionario){
		if( (buscarCpf(funcionario.getCpf()) == null) && buscarIdFuncionario(funcionario.getIdFuncionario()) == null)  {
			funcionarios.add(funcionario);
			return true;
		}
		return false;
	}
	
	
	public static Funcionario buscarCpf(String cpf) {
		for(Funcionario funcionarioCad : funcionarios) {
			if(funcionarioCad.getCpf().equals(cpf)) {
				return funcionarioCad;
			}
		}
		return null;
	}

    public static Funcionario buscarIdFuncionario(String idFuncionario) {
		for(Funcionario funcionarioCad : funcionarios) {
			if(funcionarioCad.getIdFuncionario().equals(idFuncionario)) {
				return funcionarioCad;
			}
		}
		return null;
	}
	
	
}