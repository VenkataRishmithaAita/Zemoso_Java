package Assignment7;
class OuterClass
{
    class InnerClass
    {
        InnerClass(String myname)
        {
            System.out.println("my name is:"+myname);
        }
    }
}
class SecondClass extends Class
{
    public void method() {
        OuterClass.InnerClass classobject = new InnerClass("Nikhitha");
    }
}
public class InnerClassProgram {
    public static void main(String args[])
    {
        SecondClass classobject=new SecondClass();
        classobject.method();

    }
}
