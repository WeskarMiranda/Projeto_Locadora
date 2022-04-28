package controllers;

import java.util.ArrayList;
import models.Cliente;

public class ClienteController {
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	
	public static ArrayList<Cliente> listar(){
		return clientes;
	}
	
	public static boolean cadastrarCli(Cliente cliente){
		if( (buscarCpf(cliente.getCpf()) == null) && buscarId(cliente.getIdCliente()) == null)  {
			clientes.add(cliente);
			return true;
		}
		return false;
	}
	
	
	public static Cliente buscarCpf(String cpf) {
		for(Cliente cliCad : clientes) {
			if(cliCad.getCpf().equals(cpf)) {
				return cliCad;
			}
		}
		return null;
	}

    public static Cliente buscarId(String idCliente) {
		for(Cliente cliCad : clientes) {
			if(cliCad.getIdCliente().equals(idCliente)) {
				return cliCad;
			}
		}
		return null;
	}
	
	
}
