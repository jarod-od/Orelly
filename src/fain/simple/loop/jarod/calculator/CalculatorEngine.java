package fain.simple.loop.jarod.calculator;


import javax.swing.*;
import java.awt.event.*;

public class CalculatorEngine implements ActionListener {

        Calculator parent;//ссылка на окно калькулятора

        char selectedAction = ' '; // +, -, /, or *
        double currentResult = 0;

    //Конструктор сохраняет ссылку на окно калькулятора в переменной экземпляра класса
    CalculatorEngine (Calculator parent){
        this.parent = parent;
    }

    public void actionPerformed(ActionEvent e){

        // Получаем источник действия
        JButton clickedButton = (JButton) e.getSource();

        String dispFieldText = parent.displayField.getText();

        double displayValue = 0;

        // Получить число из дисплея калькулятора, если он не пустой. Восклицательный знак – это оператор отрицания
        if (!"".equals(dispFieldText)){
            try {
                displayValue = Double.parseDouble(dispFieldText);
            } catch (NumberFormatException e1) {
                javax.swing.JOptionPane.showConfirmDialog(null,
                        "Пожалуйста, введите число", "Неправильный ввод",
                        javax.swing.JOptionPane.PLAIN_MESSAGE);
                return;            }
            }

        Object src = e.getSource();

        // Для каждой кнопки арифметического действия запомнить его: +, -, /, или *, сохранить текущее число
        // в переменной currentResult, и очистить дисплей для ввода нового числа
        if (src == parent.buttonPlus) {
            selectedAction = '+';
            currentResult = displayValue;
            parent.displayField.setText("");

        } else if (src == parent.buttonMinus){
            selectedAction = '-';
            currentResult = displayValue;
            parent.displayField.setText("");

        } else if (src == parent.buttonDivide) {
            selectedAction = '/';
            currentResult = displayValue;
            parent.displayField.setText("");

        } else if (src == parent.buttonMulti){
            selectedAction = '*';
            currentResult = displayValue;
            parent.displayField.setText("");

        } else if (src == parent.buttonEqual){
            // Совершить арифметическое действие, в зависимости от selectedAction, обновить переменную currentResult
            // и показать результат на дисплее
            if (selectedAction == '+'){
                currentResult += displayValue;
                // Сконвертировать результат в строку, добавляя его к пустой строке и показать его
                parent.displayField.setText("" + currentResult);

            } else if(selectedAction == '-'){
                currentResult -= displayValue;
                parent.displayField.setText("" + currentResult);

            }else if (selectedAction == '/'){
                currentResult /= displayValue;
                parent.displayField.setText("" + currentResult);

            }else if (selectedAction == '*'){
                currentResult *= displayValue;
                parent.displayField.setText("" + currentResult);

            } else {
                // Для всех цифровых кнопок присоединить надпись на кнопке к надписи в дисплее
                // Получаем надпись на кнопке
                String clickedButtonLabel = clickedButton.getText();
                parent.displayField.setText(dispFieldText + clickedButtonLabel);
            }
        }
    }
}
