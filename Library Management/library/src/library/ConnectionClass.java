package library;
import java.sql.*;


public class ConnectionClass 
{
  Connection con;
  Statement stm;
  ConnectionClass()
  {
      try
      {
          Class.forName("com.mysql.cj.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql:///librarymanagement","root","12345678");
          stm=con.createStatement();
          
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
  }
  public static void main(String[] args)
  {
      new ConnectionClass();
  }
         
   
}
