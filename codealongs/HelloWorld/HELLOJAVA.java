package codealongs.HelloWorld;

import javax.swing.*;

public class HELLOJAVA {
    public static void main(String[] args) {
        String message = "Hello World!";

        JFrame frame = new JFrame("Hello Window!");
        frame.setSize(350, 250);

        JLabel label = new JLabel(message, JLabel.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}