package fain.simple.loop.jarod.calculator;


import javax.swing.*;
import java.awt.event.*;

public class CalculatorEngine implements ActionListener {

    public void actionPerformed(ActionEvent e){
        // Получаем источник события
        JButton clickedButton = (JButton) e.getSource();

        // Получаем надпись на кнопке
        String clickedButtonLabel = clickedButton.getText();

        // Добавляем надпись на кнопке к тексту окна сообщения
        JOptionPane.showConfirmDialog(null, "You pressed " + clickedButtonLabel, "Just a test", JOptionPane.PLAIN_MESSAGE);
    }
}
