import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class ScannerToJFrameExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scanner to JFrame Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();
        JLabel intLabel = new JLabel("Enter an integer:");
        JTextField intField = new JTextField(10);
        JLabel line1Label = new JLabel("Enter line 1:");
        JTextField line1Field = new JTextField(20);
        JLabel line2Label = new JLabel("Enter line 2:");
        JTextField line2Field = new JTextField(20);
        JButton button = new JButton("Submit");

        panel.add(intLabel);
        panel.add(intField);
        panel.add(line1Label);
        panel.add(line1Field);
        panel.add(line2Label);
        panel.add(line2Field);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String intInput = intField.getText();
                String line1Input = line1Field.getText();
                String line2Input = line2Field.getText();

                // Display the inputs in a message dialog
                JOptionPane.showMessageDialog(frame, "Integer: " + intInput + "\nLine 1: " + line1Input + "\nLine 2: " + line2Input);
            }
        });
    }
}
