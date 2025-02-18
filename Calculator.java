import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator
{
    JFrame F1;
    JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,Add,Sub,Multi,Divi,Clear,Mod,Equal;
    JTextField TField;
    Calculator()
    {
        F1=new JFrame();
        F1.setSize(1500,1000);
        F1.setLocation(360, 30);
        F1.setLayout(null);
       
        F1.setTitle("CalCulator GUI Learning ");

        B1=new JButton("1");
        B2=new JButton("2");
        B3=new JButton("3");
        B4=new JButton("4");
        B5=new JButton("5");
        B6=new JButton("6");
        B7=new JButton("7");
        B8=new JButton("8");
        B9=new JButton("9");
        B0=new JButton("0");
        Add=new JButton("+");
        Sub=new JButton("-");
        Multi=new JButton("*");
        Divi=new JButton("/");
        Mod=new JButton("%");
        Equal=new JButton("=");
        Clear=new JButton("C");

        TField=new JTextField();

        B1.setBounds(420, 124, 110, 66);
        B2.setBounds(420, 225, 110, 66);
        B3.setBounds(420, 318, 110, 66);
        B4.setBounds(587, 124, 110, 66);
        B5.setBounds(587, 223, 110, 66);
        B6.setBounds(587, 321, 110, 66);
        B7.setBounds(747, 127, 110, 66);
        B8.setBounds(747, 220, 110, 66);
        B9.setBounds(747, 322, 110, 66);
        B0.setBounds(565, 430, 167, 74);
        Add.setBounds(890, 124, 166, 65);
        Sub.setBounds(890, 233, 166, 65);
        Multi.setBounds(890, 337, 166, 65);
        Divi.setBounds(890, 438,  166, 65);
        Mod.setBounds(890, 537, 166, 65);
        Clear.setBounds(645, 561, 191, 58);
        Equal.setBounds(420, 561, 191, 58);
        TField.setBounds(420, 44, 635, 58);

        F1.add(TField);
        F1.add(B1);
        F1.add(B2);
        F1.add(B3);
        F1.add(B4);
        F1.add(B5);
        F1.add(B6);
        F1.add(B7);
        F1.add(B8);
        F1.add(B9);
        F1.add(B0);
        F1.add(Add);
        F1.add(Sub);
        F1.add(Multi);
        F1.add(Divi);
        F1.add(Mod);
        F1.add(Equal);
        F1.add(Clear);

        F1.setVisible(true);
        F1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==B1)
        {
            TField.setText(TField.getText().concat("1"));

        }
        if(e.getSource()==B2)
        {
            TField.setText(TField.getText().concat("2"));
        }
    }

    public static void main(String[] ab)
    {
       Calculator C1= new Calculator();
        
    }

    
}
