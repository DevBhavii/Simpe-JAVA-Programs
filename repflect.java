import java.lang.reflect.*;
class reflect
{
    public static void main(String[] args) {
        
        A a = new A();
        Class c = a.getClass();
        Method methods[] = c.getDeclaredMethods();
        System.out.println("Public Methods : ");
        for(int i=0; i<methods.length;i++)
        {
            int modifiers = methods[i].getModifiers();
            if(Modifier.isPublic(modifiers))
            {
                System.out.println(" "+methods[i].getName());
            }
        }
    }
}
class A{
    public void a1(){}
    public void a2(){}
    public void a3(){}

}