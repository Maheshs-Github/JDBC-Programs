//2
import java.sql.*;
import java.util.*;
import java.lang.ClassNotFoundException.*;

public class Q2 {
    public static void main(String[] args) throws SQLException,ClassNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection C1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahesh", "root", "");
        PreparedStatement P1=C1.prepareStatement("insert into Product(PId,PName,Price) values (?,?,?)");
        System.out.println("We are inserting 5 records so ");
        for(int i=0;i<5;i++)
        {
            System.out.println("Lets take "+i+1+" Product Info");
            System.out.println("Enter the Product Id");
            int Id=sc.nextInt();
            P1.setInt(i, Id);
            System.out.println("Enter the Product Name");
            String Name=sc.next();
            P1.setString(i, Name);
            System.out.println("Enter the Product Price");
            int Price=sc.nextInt();
            P1.setInt(i, Price);
        }
        ResultSet R1=P1.executeQuery();
        while(R1.next())
        {
            for(int i=0;i<5;i++)
            {
                System.out.println("Dispalying "+i+1+" Product Info");
                System.out.println("Product Id"+R1.getInt(1));
                System.out.println("Product Name"+R1.getString(2));
                System.out.println("Product Price"+R1.getInt(3));

            }
        }

        sc.close();
        C1.close();
        P1.close();
        R1.close();

        
    }
}
