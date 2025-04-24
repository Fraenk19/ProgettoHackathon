package Model;

public class Piattaforma {
    //attributi
    private String nomePiattaforma;

    //costruttore
    public Piattaforma(String nomePiattaforma) {
        this.nomePiattaforma = nomePiattaforma;
    }

    //metodi da implementare
    public void acquisisciVoti() {};
    public void pubblicaClassifica() {};

    //getter
    public String getNomePiattaforma() {
        return nomePiattaforma;
    }

    //setter
    public void setNomePiattaforma(String nomePiattaforma) {
        this.nomePiattaforma = nomePiattaforma;
    }
}
