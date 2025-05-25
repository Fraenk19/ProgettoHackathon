package Model;

import java.util.Scanner;

public class Utente {
    //Attributi
    private String nome;
    private String password;

    //costruttore
    public Utente(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    //metodi da implementare
    public void registrazione() {

    };

    //getter
    public String getNome() {
        return nome;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }
}
