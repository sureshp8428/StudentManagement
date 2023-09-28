package project;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        try {
        while(true) {
        System.out.println("1. Insert");
        System.out.println("2. Read");
        System.out.println("3. Delete");
        System.out.println("4. Update");
        System.out.println("5. Exit");
       
        int op=sc.nextInt();
       
        if(op==1)
        {
            Insert a=new Insert();
            System.out.println("Enter a Id:");
            int id=sc.nextInt();
            System.out.println("Enter a Name");
            String name=sc.next();
            System.out.println("Enter a Date of Joining(yyyy-mm-dd)");
            String doj=sc.next();
            System.out.println("Enter a Average");
            float avg=sc.nextFloat();
            int res=a.insert(id, name, doj, avg);
            if(res!=0)
            {
                System.out.println("Register Successfully");
            }else
            {
                System.out.println("Register Unsuccssfully");
            }
            System.out.println("------------------------------------");
        }else if(op==2)
        {System.out.println("Enter a Id");
        int id=sc.nextInt();
        Read r=new Read();
        r.read(id);
        System.out.println("------------------------------------");
       
        }else if(op==3)
        {
            System.out.println("Enter a Id");
            int id=sc.nextInt();
            Delete d=new Delete();
            d.delete(id);
            System.out.println("------------------------------------");
           
        }else if(op==4)
        {
            System.out.println("Enter a Id");
            int id=sc.nextInt();
            System.out.println("Enter a New Name");
            String name=sc.next();
           
            Update u=new Update();
            u.update(id, name);
            System.out.println("------------------------------------");

        }
        else if(op==5)

                {

            System.out.println("5.Exit");
            break;
                }
        }
        }catch(ClassNotFoundException | SQLException e)
        {
            System.out.println(e);
        }
    }

}

