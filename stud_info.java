import java.util.*;
public class stud_info {
    public static void main(String[] args) {
        String name[] = new String[10];
        int marks[] = new int[10];
        String section[] = new String[10];
        try{
            
            Scanner cin = new Scanner(System.in);
            System.out.print("Enter the no.of student : ");
            int n = cin.nextInt();
    
            System.out.print("Enter the size of marks : ");
            int m = cin.nextInt();
    
            System.out.print("Enter the how many section : ");
            int s = cin.nextInt();
    
            //System.out.print("Enter the Name, marks and section : ");
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<m; i++)
                {
                    for(int k=0;k<s;i++)
                    {
                        System.out.println((i+1)+")Enter the Name, marks and section : ");
                        name[i] = cin.next();
                        marks[j] = cin.nextInt();
                        section[k] = cin.next();
                        System.out.println("Student name is = "+name[i]);
                        System.out.println("Student marks is = "+marks[j]);
                        System.out.println("Section is = "+section[k]);  
                        
                    }
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter the valid information ");
        }
    }
    
}
