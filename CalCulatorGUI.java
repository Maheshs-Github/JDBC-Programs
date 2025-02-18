// package assignment6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class CalCulatorGUI extends JFrame implements ActionListener {
  private static final long serialVersionUID = 1L;
  JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, plus, mult, div, minus, equal, dot;
  JTextField tt;
  static double a = 0, b = 0, result = 0;
  int operator = 0;

  CalCulatorGUI() {
    // set frame
    setSize(250, 270);
    setLayout(null);
    setTitle("calulator");
    setLocation(10, 10);
   
    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b0 = new JButton("0");
    plus = new JButton("+");
    minus = new JButton("-");
    mult = new JButton("*");
    div = new JButton("%");
    equal = new JButton("=");
    tt = new JTextField();
    dot = new JButton("C");

    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    add(b0);
    add(plus);
    add(minus);
    add(div);
    add(mult);
    add(equal);
    add(tt);
    add(dot);
    // set bounds
    tt.setBounds(20, 2, 200, 30);
    b1.setBounds(20, 40, 45, 45);
    b4.setBounds(20, 90, 45, 45);
    b7.setBounds(20, 140, 45, 45);
    b0.setBounds(20, 190, 45, 45);
    b2.setBounds(70, 40, 45, 45);
    b5.setBounds(70, 90, 45, 45);
    b8.setBounds(70, 140, 45, 45);
    dot.setBounds(70, 190, 45, 45);
    b3.setBounds(120, 40, 45, 45);
    b6.setBounds(120, 90, 45, 45);
    b9.setBounds(120, 140, 45, 45);
    equal.setBounds(120, 190, 45, 45);
    plus.setBounds(170, 40, 45, 45);
    minus.setBounds(170, 90, 45, 45);
    mult.setBounds(170, 140, 45, 45);
    div.setBounds(170, 190, 45, 45);

    // add ActionListener
    b0.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    equal.addActionListener(this);
    dot.addActionListener(this);
    plus.addActionListener(this);
    minus.addActionListener(this);
    mult.addActionListener(this);
    div.addActionListener(this);
    // set frame
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);


  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == dot)
      tt.setText(" ");

    if (e.getSource() == b1)
      tt.setText(tt.getText().concat("1"));

    if (e.getSource() == b2)
      tt.setText(tt.getText().concat("2"));

    if (e.getSource() == b3)
      tt.setText(tt.getText().concat("3"));

    if (e.getSource() == b4)
      tt.setText(tt.getText().concat("4"));

    if (e.getSource() == b5)
      tt.setText(tt.getText().concat("5"));

    if (e.getSource() == b6)
      tt.setText(tt.getText().concat("6"));

    if (e.getSource() == b7)
      tt.setText(tt.getText().concat("7"));

    if (e.getSource() == b8)
      tt.setText(tt.getText().concat("8"));

    if (e.getSource() == b9)
      tt.setText(tt.getText().concat("9"));

    if (e.getSource() == b0)
      tt.setText(tt.getText().concat("0"));

    if (e.getSource() == plus) {
      a = Double.parseDouble(tt.getText());
      operator = 1;
      tt.setText(" ");
    }

    if (e.getSource() == minus) {
      a = Double.parseDouble(tt.getText());
      operator = 2;
      tt.setText(" ");
    }

    if (e.getSource() == mult) {
      a = Double.parseDouble(tt.getText());
      operator = 3;
      tt.setText(" ");
    }

    if (e.getSource() == div) {
      a = Double.parseDouble(tt.getText());
      operator = 4;
      tt.setText(" ");
    }

    if (e.getSource() == equal) {
      b = Double.parseDouble(tt.getText());
      switch (operator) {
        case 1:
          result = a + b;
          break;
        case 2:
          result = a - b;
          break;
        case 3:
          result = a * b;
          break;
        case 4:
          result = a / b;
          break;
        default:
          result = 0;
      }
      tt.setText("" + result);
    }

  }

  public static void main(String args[]) {
    new CalCulatorGUI();
  }
}