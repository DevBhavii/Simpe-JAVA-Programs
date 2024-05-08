import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        int a=0,b=1,result=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int range = in.nextInt();
        System.out.print("The fibonacci : ");
        for(int i=0;i<range;i++)
        {
            System.out.print(result+" ");
            result = a+b;
            a=b;
            b=result;
        }
    }
    
}
