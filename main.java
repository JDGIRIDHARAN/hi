package pack;
import java.sql.SQLException;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	       while(true) {
	           try {
	       System.out.println("1.Insert");
	       System.out.println("2.Select");
	       System.out.println("3.Update");
	       System.out.println("4.Delete");
	       System.out.println("5.Exit");
	       int n=sc.nextInt();
	       if(n==1)
	       {
	           Insert i=new Insert();
	           System.out.println("Enter a ID");
	           int Id=sc.nextInt();
	           System.out.println("Enter a Name");
	           String Name=sc.next();
	           System.out.println("Enter a Salary");
	           long Salary=sc.nextLong();
	           int result=i.insert(Id,Name,Salary);
	           if(result!=0)
	           {
	               System.out.println("Inserted");
	           }else
	           {
	        	   System.out.println("Not Inserted");
	           }
	           System.out.println("-------------------");   
	           }else if(n==2)
	           {
	           System.out.println("Enter a Id");
	           int id=sc.nextInt();
	           Select s=new Select();
	           s.select(id);
	           System.out.println("-------------------");    
       	       }else if(n==3)
	           {
	           System.out.println("Enter a id");
	           int id=sc.nextInt();
	           System.out.println("Enter A NEW Id");
	           String name=sc.next();
	           Update u=new Update();
	           u.update(id, name);
	           System.out.println("-------------------");    
     	       }else if(n==4)
     	       {
	           System.out.println("Enter a Id to Delete");
	           int id=sc.nextInt();
	           Delete d=new Delete();
	           d.delete(id);
	           System.out.println("-------------------");    
     	       }else if(n==5)
	           {
	           System.out.println("5.Exit");
	           System.out.println("-------------------");
	           break;
	           }else
	           {
	           System.out.println("Invalid Option");
	           System.out.println("-------------------");    
	           }
	           }catch(ClassNotFoundException | SQLException e)
	           {
	           System.out.println(e);
	           }
	           }
	       sc.close();
	   }
}