package my.swing;

import javax.swing.*;
import java.awt.*;

public class HelloWorld extends JFrame {
    JButton button = new JButton();
    JTextField text1 = new JTextField();

    public HelloWorld() {
//        this.setLayout(new GridLayout(2,1));
        this.setLayout(null);
        button.setText("Click me!");
        button.setBounds(5,40,200,20);
        button.addActionListener(e->{button.setText("Hello!"+text1.getText());});
        text1.setBounds(5,5,200,20);
        this.add(text1);
        this.add(button);
        this.setBounds(0,0,900,700);
    }

    public static void main(String[] args) {
        HelloWorld frame = new HelloWorld();
        frame.setVisible(true);
    }
}
