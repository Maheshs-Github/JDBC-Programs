import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUI2 implements ActionListener
{
    JFrame f;
    JButton Button;
    // JTextField Field;
    GUI2()
    {
        f=new JFrame("No Idea");
        f.setSize(1500,1500);
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // setBounds();
        Button=new JButton();
        Button.setText("Save");
        Button.setBounds(442,291,447,39);
        // Field=new JTextField(20);
        // Field.setBounds(319,141,427,52);
        // f.add(Field);
        f.add(Button);
        Button.addActionListener((ActionListener) this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        Button.setText("Moshi Moshi");

    }
   
    public static void main(String[] a) 
    {
        new GUI2();
    }

    
}
