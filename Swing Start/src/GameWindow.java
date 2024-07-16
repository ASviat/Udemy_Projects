import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {


    public GameWindow() {
        setVisible(true);
        setSize(700, 400);
        setLocation(700, 150);
        setTitle("MyFrame");
        setBackground(Color.BLACK); // Why not working?
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JPanel jp1 = new JPanel(new GridLayout(1, 2));

        jp1.add(btn1);
        jp1.add(btn2);

        add(jp1, BorderLayout.SOUTH);
    }
}
