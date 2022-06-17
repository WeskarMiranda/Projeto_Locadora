package models;

public class Cliente extends Pessoa {
    
    private String idCliente;


    
    public String getIdCliente() {
        return idCliente;
    }
    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    @Override
	public String toString() {
		return "ID: "+getIdCliente()+ "| CPF "+getCpf()+ "| Nome: "+ getNome()+ "| Data de cadastro: "+ getDataCad()+ 
				"| Cidade: "+ getCidade()+ "| Estado: "+ getEstado();
	}

}
