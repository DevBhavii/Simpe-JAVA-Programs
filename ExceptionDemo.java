class ExceptionHandling
{
    int y[] = {5,10},z;
    public void cal()
    {
        try
        {
           // z = y[1];
            z = y[1]/0;
            System.out.println("z = "+z);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index error");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Can not divede  by zero error");
        }
        catch(ArrayStoreException e)
        {
            System.out.println("Invalid data input");
        }
    }
}
public class ExceptionDemo {
    public static void main(String[] args) {
        ExceptionHandling e = new ExceptionHandling();
        e.cal();
    }
}
