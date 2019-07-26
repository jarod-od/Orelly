package fain.simple.loop.jarod.calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator {

    // Объявление всех компонентов калькулятора
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");

    JButton buttonPoint = new JButton(".");
    JButton buttonEqual = new JButton("=");

    JButton buttonPlus = new JButton("+");
    JButton buttonMinus = new JButton("-");
    JButton buttonMulti = new JButton("*");
    JButton buttonDivide = new JButton("/");

    JPanel windowContent = new JPanel();
    JTextField displayField = new JTextField(30);

    // В конструкторе создаются все компоненты
    // и добавляются на фрейм с помощью комбинации Borderlayout и Gridlayout
    Calculator() {

        // Задаём схему для этой панели
        BorderLayout b1 = new BorderLayout();
        windowContent.setLayout(b1);

        // Создаём и отображаем поле Добавляем его в Северную область окна
//        displayField = new JTextField(30);
        windowContent.add("North", displayField);

        // Создаём кнопки, используя конструктор класса JButton, который принимает текст
        // кнопки в качестве параметра

        // JButton numButtons [] = new JButton [10];
        // for (int i = 0; i < numButtons.length; i++)



        // Создаём панель с GridLayout которая содержит 12 кнопок - 10 кнопок с числами и кнопки с точкой и знаком равно
        JPanel p1 = new JPanel();
        GridLayout gl = new GridLayout(4, 3);
        p1.setLayout(gl);

        // Добавляем кнопки на панель p1
        p1.add(button1);
        p1.add(button2);
        p1.add(button3);
        p1.add(button4);
        p1.add(button5);
        p1.add(button6);
        p1.add(button7);
        p1.add(button8);
        p1.add(button9);
        p1.add(button0);
        p1.add(buttonPoint);
        p1.add(buttonEqual);

        // Помещаем панель p1 в центральную область окна
        windowContent.add("Center", p1);

        // Создаем вторую панель
        JPanel p2 = new JPanel();
        GridLayout g2 = new GridLayout(4, 1);
        p2.setLayout(g2);

        p2.add(buttonPlus);
        p2.add(buttonMinus);
        p2.add(buttonMulti);
        p2.add(buttonDivide);

        windowContent.add("East", p2);

        //Создаём фрейм и задаём его основную панель
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);

        // делаем размер окна достаточным для того, чтобы вместить все компоненты
        frame.pack();

        // Наконец, отображаем окно
        frame.setVisible(true);

//        Связываем КалькуляторЭнджайн с этим классом, что бы окно попапилось
        CalculatorEngine calcEngine = new CalculatorEngine(this);

        button0.addActionListener(calcEngine);
        button1.addActionListener(calcEngine);
        button2.addActionListener(calcEngine);
        button3.addActionListener(calcEngine);
        button4.addActionListener(calcEngine);
        button5.addActionListener(calcEngine);
        button6.addActionListener(calcEngine);
        button7.addActionListener(calcEngine);
        button8.addActionListener(calcEngine);
        button9.addActionListener(calcEngine);

        buttonPoint.addActionListener(calcEngine);
        buttonPlus.addActionListener(calcEngine);
        buttonMinus.addActionListener(calcEngine);
        buttonMulti.addActionListener(calcEngine);
        buttonDivide.addActionListener(calcEngine);
        buttonEqual.addActionListener(calcEngine);
    }

    public static void main(String[] args) {
        // Создаем экземпляр класса “Калькулятор”
        Calculator calc = new Calculator();
    }
}
