package models;

public class Cliente {
    
    private String idCliente;
    private String cpf;
	private String nome;
	private String dataCad;
	private String cidade;
	private String estado;

    
    public String getIdCliente() {
        return idCliente;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getDataCad() {
        return dataCad;
    }
    public void setDataCad(String dataCad) {
        this.dataCad = dataCad;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
