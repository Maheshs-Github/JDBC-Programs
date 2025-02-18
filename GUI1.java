import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI1  implements ActionListener
{
    JFrame F1;
    JButton Button;
    GUI1()
    {
        F1=new JFrame("Frame 1");
        Button=new JButton("Click Me");
        F1.setSize(1000,1000);
        F1.setVisible(true);
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        F1.setLayout(new FlowLayout());
        // JButton Button=new JButton("Click Me");
        Button.setBounds(57, 62, 450, 60);
        Button.addActionListener((ActionListener) this);
        F1.add(Button);
    }
    public void actionPerformed(ActionEvent e)
    {
        Button.setText("Moshi Moshi");
    }
    public static void main(String[] ab)
    {
        new GUI1();
        
    }
    


}