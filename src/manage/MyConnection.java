 package manage;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Scanner;
public class MyConnection {
    static Connection con=null;
    String oIdPass=null;
  static
  {
    try
    {
     Class.forName("oracle.jdbc.driver.OracleDriver");
    }
    catch(Exception e){System.out.println("Problem in OracleDriver to Load "+e);}
  }
    public MyConnection(){}
    
    public static String getOidPass()
    {
      Scanner Sc1= null;
		FileInputStream fis=null;
		try
		{
		    FileInputStream FI=new FileInputStream("mkfile.txt");
		    Sc1=new Scanner(FI);
		    
		    // this will read data till the end of data.
                    if(Sc1.hasNext()){
		    	String data=Sc1.nextLine();
		    	 return(data);
                    }
                    else{ 
                       return(null);
                    }
		}
		catch(IOException e)
		{
			System.out.println(e);
                        return(null);
		}
    }
    
     public static Connection getConnection()
     {
       try
       {
        String oIdPass=new String();
        oIdPass=MyConnection.getOidPass();
        
         String arr[]=oIdPass.split(" ");
                       
         if(con==null)
         {
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",arr[0],arr[1]);
         }
           return con;
       }
           catch(SQLException ee)
           {
            System.out.println(ee);
            return null;
           }
     }
}
