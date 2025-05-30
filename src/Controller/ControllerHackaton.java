package Controller;

import Model.*;

import java.util.ArrayList;

public class ControllerHackathon {

    public ArrayList<Team> listaSquadre;
    private final Piattaforma piattaforma;

    public boolean registraUtente(String nome, String password, String ruolo) {
        if (ruolo.equals(""))
            throw new NullPointerException("Ruolo non valido");

        return piattaforma.registraUtente(nome, password, ruolo);
    }

    private boolean login(String nome, String password) {
        return true;
    }

    public ControllerHackaton(Piattaforma piattaforma) {
        this.piattaforma = piattaforma;
        listaSquadre = new ArrayList<Team>();
    }

    public void addTeam(Team t) {
       this.listaSquadre.add(t);
    }
}
