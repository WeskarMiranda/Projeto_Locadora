package models;

public class Pessoa {

    private String cpf;
	private String nome;
	private String dataCad;
	private String cidade;
	private String estado;
    
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataCad() {
        return dataCad;
    }
    public void setDataCad(String dataCad) {
        this.dataCad = dataCad;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    
}
