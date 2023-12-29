package SyllabusOOPS.Assignment;

import java.awt.*;
import java.awt.event.*;
public class RestaurantBillingSystem {
}

class Calculator extends Frame implements ActionListener {
    private TextField display;
    private double operand1, operand2, result;
    private String operator;

    public Calculator() {
        setLayout(new BorderLayout());

        display = new TextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        Panel buttonPanel = new Panel();
        buttonPanel.setLayout(new GridLayout(4, 4));

        addButton(buttonPanel, "7");
        addButton(buttonPanel, "8");
        addButton(buttonPanel, "9");
        addButton(buttonPanel, "/");
        addButton(buttonPanel, "4");
        addButton(buttonPanel, "5");
        addButton(buttonPanel, "6");
        addButton(buttonPanel, "*");
        addButton(buttonPanel, "1");
        addButton(buttonPanel, "2");
        addButton(buttonPanel, "3");
        addButton(buttonPanel, "-");
        addButton(buttonPanel, "0");
        addButton(buttonPanel, ".");
        addButton(buttonPanel, "=");
        addButton(buttonPanel, "+");

        add(buttonPanel, BorderLayout.CENTER);

        setTitle("Calculator");
        setSize(300, 300);
        setVisible(true);
    }

    private void addButton(Container container, String text) {
        Button button = new Button(text);
        button.addActionListener(this);
        container.add(button);
    }

    public void actionPerformed(ActionEvent ae) {
        String command = ae.getActionCommand();
        if (command.matches("[0-9.]")) {
            if (operator == null) {
                operand1 = Double.parseDouble(display.getText() + command);
                display.setText(Double.toString(operand1));
            } else {
                operand2 = Double.parseDouble(display.getText() + command);
                display.setText(Double.toString(operand2));
            }
        } else if (command.matches("[+\\-*/=]")) {
            if (operator == null) {
                operator = command;
            } else {
                operand1 = performCalculation();
                display.setText(Double.toString(operand1));
                operand2 = 0;
                operator = command;
            }
        } else if (command.equals("C")) {
            operand1 = 0;
            operand2 = 0;
            operator = null;
            display.setText("");
        }
    }

    private double performCalculation() {
        switch (operator) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
