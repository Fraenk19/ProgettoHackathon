package Model;

public class Utente {
    //Attributi
    private String nome;

    //costruttore
    public Utente(String nome) {
        this.nome = nome;
    }
    //metodi da implementare
    public void registrazione() {};

    //getter
    public String getNome() {
        return nome;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }
}
