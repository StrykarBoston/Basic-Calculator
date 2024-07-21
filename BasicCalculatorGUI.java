import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Basic Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new GridLayout(4, 2));

        JTextField num1Field = new JTextField(10);
        JTextField num2Field = new JTextField(10);

        /*JLabel resultLabel = new JLabel("Result:");*/

        panel.add(new JLabel("Number 1:"));
        panel.add(num1Field);
        panel.add(new JLabel("Number 2:"));
        panel.add(num2Field);

        JLabel resultLabel = new JLabel("Result:");

        String[] operators = {"+", "-", "*", "/"};
        JComboBox<String> operatorBox = new JComboBox<>(operators);
        panel.add(operatorBox);

        JButton calculateButton = new JButton("Calculate");
        panel.add(calculateButton);

        panel.add(resultLabel);

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(num1Field.getText());
                double num2 = Double.parseDouble(num2Field.getText());
                String operator = (String) operatorBox.getSelectedItem();
                double result = 0;

                switch (operator) {
                    case "+":
                        result = num1 + num2;
                        break;
                    case "-":
                        result = num1 - num2;
                        break;
                    case "*":
                        result = num1 * num2;
                        break;
                    case "/":
                        result = num1 / num2;
                        break;
                }

                resultLabel.setText("Result: " + result);
            }
        });

        frame.setVisible(true);
    }
}
