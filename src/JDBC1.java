import java.sql.*;

public class JDBC1{
    public static void main(String[] args) throws SQLException {
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "");

        Statement s= conn.createStatement() ;

        ResultSet r = s.executeQuery("Select * from student_info");

        while(r.next()){

            System.out.println("roll_num= "+r.getInt(1));
            System.out.println("name= "+r.getString(2));
            System.out.println("percenatge= "+r.getInt(3));

        }


        }catch(Exception e){
            System.out.println(e);
        }


        
    }
}