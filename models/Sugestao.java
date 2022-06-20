package models;


public class Sugestao {
    
    private String Filme;
    private int Vezes;


    public String getFilme() {
        return Filme;
    }
    public void setFilme(String filme) {
        Filme = filme;
    }
    public int getVezes() {
        return Vezes;
    }
    public void setVezes(int vezes) {
        Vezes = vezes;
    }
    
    @Override
    public String toString() {
        return 
            " | Nome do filme: " +  Filme + 
            " | Vezes Sugerido: " + Vezes;
    }

}
