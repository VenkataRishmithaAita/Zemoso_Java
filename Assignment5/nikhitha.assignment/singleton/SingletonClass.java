package nikhitha.assignment.singleton;
public class SingletonClass {
    String member;
    public static  SingletonClass getObject(String member)
    {
        //this.member=member;
        //non-static variable this cannot be referenced from a static context
        SingletonClass object=new SingletonClass();
        object.member=member;
        return object;

    }
    public void printString()
    {
        System.out.println("String: "+member);
    }
}
