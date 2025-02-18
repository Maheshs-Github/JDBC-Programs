//Actually its the 6th Question 
import java.sql.*;
import java.util.*;
// import java.lang.ClassNotFoundException.*;

public class Q5 {
    public static void main(String[] args) throws SQLException,ClassNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");
        Connection C1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahesh", "root", "");
       // Statement S1=C1.createStatement();
        DatabaseMetaData BM1=C1.getMetaData();
        
        System.out.println("Driver Name is: "+BM1.getDriverName());
        System.out.println("Driver Version is: "+BM1.getDriverVersion());
        System.out.println("UserName is: "+BM1.getUserName());
        System.out.println("Database Product Name: "+BM1.getDatabaseProductName());
        System.out.println("Database Product Version is: "+BM1.getDatabaseProductVersion());
        

        ResultSet R1=BM1.getTables(null, null, "%", args);
        while(R1.next())
        {
            String TName=R1.getString("TABLE_NAME");
            System.out.println(TName);
        }
        
        
        C1.close();
        P1.close();
        R1.close();;
    }
}
