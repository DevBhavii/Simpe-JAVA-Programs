import java.util.*;
public class factorial {
    public static void main(String[] args) {
        try{
            int n,f;
            Scanner cin = new Scanner(System.in);
            System.out.println("Enter the number : ");
            n = cin.nextInt();
            f = fact(n);
            System.out.println("The factorial of "+n+" is :"+f);    
        }
        catch(Exception e){}
    }
    static int fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else{
            return(n*fact(n-1));
        }
    }
}
