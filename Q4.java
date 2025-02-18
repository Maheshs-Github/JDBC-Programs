import java.sql.*;
import java.util.*;
// import java.lang.ClassNotFoundException.*;

public class Q4 {
    public static void main(String[] args) throws SQLException,ClassNotFoundException
    {
        Scanner sc=new Scanner(System.in);
        Class.forName("com.mysql.jdbc.Driver");
        Connection C1=DriverManager.getConnection("jdbc:mysql://localhost:3306/mahesh", "root", "");
        Statement S1=C1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        ResultSet R1=S1.executeQuery("select * from Product");
        ResultSetMetaData RM1=R1.getMetaData();

        int NCol=RM1.getColumnCount();
        System.out.println("Column Count in the Table is: "+NCol);
        for(int i=0;i<NCol;i++)
        {
        System.out.println("Column Number is: "+i);
        System.out.println("Column Name is: "+RM1.getColumnName(NCol));
        System.out.println("Column Type is: "+RM1.getColumnType(NCol));
        }
        sc.close();
        C1.close();
        P1.close();
        R1.close();;
    }
}
