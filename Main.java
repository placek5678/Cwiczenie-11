package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame("Zmiana temperatury z °C na °F");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(500,160);
        window.setLocationRelativeTo(null);
        window.setLayout(null);

        JLabel num1 = new JLabel("Celcjusze");
        num1.setBounds(225, 0, 80, 20);
        window.add(num1);

        JTextField textnum1 = new JTextField();
        textnum1.setBounds(212, 30, 80, 20);
        window.add(textnum1);

        JButton button = new JButton("Konwertuj");
        button.setBounds(204, 60, 96, 20);
        window.add(button);

        JLabel num2 = new JLabel("Fahrenheity");
        num2.setBounds(220, 90, 80, 20);
        window.add(num2);

        JLabel wynik = new JLabel();
        wynik.setBounds(242, 104, 80, 20);
        window.add(wynik);

        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent actionEvent)
            {
             String num1 = textnum1.getText();
             Integer.parseInt(num1);
             int konwersja = ((Integer.parseInt(num1) * 9) / 5) + 32;
             wynik.setText(konwersja + "");
            }
        });
        window.setVisible(true);
    }
}
