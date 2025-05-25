package GUI;

import Controller.ControllerHackaton;
import Model.Piattaforma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeHackathon {

    private JPanel panel1;

    private JButton mostraTeamInGaraButton;

    private JButton loginButton;

    private JButton registrarsiButton;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JLabel pswLabel;
    private JLabel nomeLabel;


    private final ControllerHackaton controller;
    private final Piattaforma piattaforma;



    public static void main(String[] args) {

        JFrame frame = new JFrame("Home Hackaton");
        frame.setContentPane(new HomeHackathon(frame).panel1);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    public HomeHackathon(JFrame frame) {

        piattaforma = new Piattaforma("Hackaton");
        controller = new ControllerHackaton(piattaforma);

        JFrame frameHome = new JFrame("Home Hackaton");

        registrarsiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SchermataRegistrazione reg = new SchermataRegistrazione(frame);
                reg.frameR.setVisible(true);
                frame.setVisible(false);
            }
        });
    }
}
