
// 3
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Q3 extends JFrame implements ActionListener {
    // setTitle("Swing-JDBC");
    Q3() {
        setTitle("JDBC");
        setLayout(new FlowLayout());
        JButton Save = new JButton("Click me");
        add(Save);
        save.addActionListener(this);
        setDefaultCloseOperation(ABORT);
        setSize(200, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == save) {
            // Class.forName(getName());
            Connection C1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/ employee", "root", "");
            Statement S1 = C1.createStatement();
            ResultSet R1 = S1.executeQuery("select * from Student where RNo=1");
            while (R1.next()) {
                System.out.println("Roll No:" + R1.getInt(1));
                System.out.println("Roll No:" + R1.getString(2));
                System.out.println("Roll No:" + R1.getDouble(3));
            }
            C1.close();
            R1.close();
            S1.close();
        }
    }

    public static void main(String[] args) {
        new Q3();

    }

}
