/*8)  java JDBC program to perform operations on employee table  insert,update,delete,display,exit*/

import java.util.*;
import java.sql.*;
import java.io.*;



public class Emp {
    public static void main(String[] args) throws SQLException,ClassNotFoundException
    {
        Scanner sc= new  Scanner(System.in);
        int e_num , salary,choice;
        String e_name;

        //Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ employee","root","");
        
        Statement s1;// for display operation
        PreparedStatement p1;// for insert operation
        PreparedStatement p2;//  for update operation
        PreparedStatement p3;//  for update operation
        
        ResultSet r; // to display the result of execute query 
        
        p1=conn.prepareStatement("insert into employee_info values(?,?,?)");
        p2=conn.prepareStatement("update employee_info set e_name=? where e_num=?");
        p3=conn.prepareStatement("update employee_info set salary=? where e_num=?");
        s1=conn.createStatement();
        
        do{
            System.out.println("1.display");
            System.out.println("2.insert");
            System.out.println("3.delete");
            System.out.println("4.update");
            System.out.println("5.search");
            System.out.println("6.exit");

            System.out.println("Enter your choice");
            choice=sc.nextInt();

            switch( choice){
                case 1:
                System.out.println("the records are:");
                r=s1.executeQuery("select * from employee_info");
                while (r.next()) {
                    System.out.println("employee num="+r.getInt(1));
                    System.out.println("employee name="+r.getString(2));
                    System.out.println("employee salary="+r.getInt(3));
                    
                }
                break;

                case 2:
                System.out.println("enter the employee num ");
                e_num=sc.nextInt();

                System.out.println("enter the employee name ");
                e_name=sc.next();

                System.out.println("enter the employee salary ");
                salary=sc.nextInt();

                p1.setInt(1,e_num);
                p1.setString(2,e_name);
                p1.setInt(3,salary);
                int insert=p1.executeUpdate();

                if(insert>0)
                System.out.println("record inserted sucessfully");
                else
                System.out.println("record not inserted");
                break;
                
                case 3 :
                System.out.println("enter the employee num ");
                 e_num=sc.nextInt();
                int d= s1.executeUpdate("delete from employee_info where e_num="+e_num);
                
                if(d>0)
                System.out.println("record deleted sucessfully");
                else
                System.out.println("record deletion failed");

                break;

                case 4:
                System.out.println("enter the employee num to be updated");
                e_num=sc.nextInt();
                System.out.println("enter new name");
                e_name=sc.next();
                System.out.println("enter the salary");
                salary=sc.nextInt();

                p2.setString(1, e_name);
                p2.setInt(2,e_num);

                p3.setInt(1,salary);
                p3.setInt(2,e_num);
                int e = p2.executeUpdate();
                int f= p3.executeUpdate();


                if (e>0 && f>0) {
                    System.out.println("updation complete");   
                }
                else
                System.out.println("updation failed");  
                break;
                
                case 5:
                System.out.println("enter the employee num to be searched");
                e_num=sc.nextInt();

                r=s1.executeQuery("select *from employee_info where e_num="+e_num);
                if(r.next()){
                    System.out.println("employee num="+r.getInt(1));
                    System.out.println("employee name="+r.getString(2));
                    System.out.println("employee salary="+r.getInt(3));

                }             
                else
                System.out.println("record not found");
                break;





            }




            

        }while(choice!=6);
        sc.close();

    }
    
}
