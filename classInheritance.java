class Animal
{
    String name;
    Animal(String name)
    {
        this.name = name;
    }
    void eat()
    {
        System.out.println(name+" eating");
    }
    void sleep()
    {
        System.out.println(name+" sleeping");
    }
}
class Dog extends Animal
{
    Dog(String name)
    {
        super(name);
    }
    void bark()
    {
        System.out.println(name+" barking");
    }
}
public class classInheritance {
    public static void main(String[] args) {
       Dog ob = new Dog("Munna");
       ob.eat();
       ob.sleep();
       ob.bark();
    }
}
