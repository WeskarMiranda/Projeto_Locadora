package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Locacao {
    
    private Cliente cliente;
    private Dvd dvd;
    public String Data_locacao; 
    public String Data_entrega;
    public  Date Dataconvertida1;
    public int Idlocacao;


    public int getIdlocacao() {
        return Idlocacao;
    }
    public void setIdlocacao(int Idlocacao) {
        this.Idlocacao = Idlocacao;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Dvd getDvd() {
        return dvd;
    }
    public void setDvd(Dvd dvd) {
        this.dvd = dvd;
    }
    public String getData_locacao(){
        return Data_locacao;
    }
    public void setData_locacao(String Data_locacao) {
        this.Data_locacao = Data_locacao;
    }
    public Date getDataconvertida1(Date Dataconvertida1){
        return Dataconvertida1;
    }
    public void setDataconvertida1(String Data_entrega) {
        // try aqui foi usado para poder usar a expressao de parse 
        try{
            // converte a string de Data_entrega para o formato Date e ja formata ela no padrao brasileiro para datas "dias/mes/ano"
        Date Dataconvertida1 = new SimpleDateFormat("dd/MM/yyyy").parse(Data_entrega);  
        this.Dataconvertida1 = Dataconvertida1;
    } catch (java.text.ParseException e) {
        e.printStackTrace();
    }
    }

    @Override
    public String toString() {
        return 
            "ID da Locacao: " + Idlocacao +
            " | Nome do cliente: " + cliente.getNome() + 
            " | Nome do filme: " + dvd.getNome() + 
            " | Data de locacao: " + Data_locacao +
            " | Data para entrega: " + Dataconvertida1;
    }
    
}
