package org.example.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen extends JFrame{
    private JPanel mainJPanel;
    private JButton buttonEnterText;
    private JTextField textFieldEnterText;
    private JTextField labelTextOutput;
    private JLabel label1;
    private JLabel label2;
    private JButton buttonClear;

    String textCopy ;

    public Screen(){

        setContentPane(mainJPanel);
        setTitle("Screen");
        setVisible(true);
        setSize(450,300);

        buttonEnterText.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textCopy = textFieldEnterText.getText();

                labelTextOutput.setText(textCopy);
            }
        });

        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                labelTextOutput.setText("");
            }
        });

    }
}
