package Controller;

import Model.*;

import java.util.ArrayList;

public class ControllerHackathon {

    public ArrayList<Team> listaSquadre;


    public boolean registraUtente(String nome, String password) {

        return registraUtente(nome, password);
    }

    private boolean login(String nome, String password) {
        return true;
    }

    public ControllerHackathon() {
        listaSquadre = new ArrayList<Team>();
    }

    public void addTeam(Team t) {
        this.listaSquadre.add(t);
    }
}