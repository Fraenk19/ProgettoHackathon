package GUI;

import Controller.ControllerHackaton;
import Model.Piattaforma;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchermataRegistrazione {
    private JPanel panelRegistrazione;
    private JTextField textNome;
    private JPasswordField textPassword;
    private JComboBox ruoloComboBox;
    private JButton confermaButton;
    private JButton tornaIndietroButton;
    private ControllerHackaton controller;
    private Piattaforma piattaforma;
    public JFrame frameR;

    public SchermataRegistrazione(JFrame frameHome) {
        frameR = new JFrame("Registrazione");
        frameR.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameR.setContentPane(panelRegistrazione);
        frameR.pack();
        frameR.setVisible(true);



        this.ruoloComboBox.addItem((""));
        this.ruoloComboBox.addItem("Partecipante");
        this.ruoloComboBox.addItem("Giudice");
        this.ruoloComboBox.addItem("Organizzatore");


        confermaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.registraUtente(textNome.getText(), textPassword.getText(), (String) ruoloComboBox.getSelectedItem());
            }
        });
        tornaIndietroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frameHome.setVisible(true);
                frameR.dispose();
            }
        });
    }
}
