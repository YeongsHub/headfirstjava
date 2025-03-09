import javax.swing.*;
import java.awt.*;

public class Panel1 {
    public static void main(String[] args){
        Panel1 gui = new Panel1();
        gui.go();
    }
    public void go(){
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("shock me");
        JButton buttonTwo = new JButton("bliss");

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.add(button);
        panel.add(buttonTwo);
        panel.setBackground(Color.DARK_GRAY);
        frame.getContentPane().add(BorderLayout.EAST, panel);

        frame.setSize(250, 200);
        frame.setVisible(true);
    }
}
