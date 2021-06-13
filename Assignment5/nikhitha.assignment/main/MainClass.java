package nikhitha.assignment.main;
import nikhitha.assignment.data.*;
import nikhitha.assignment.singleton.*;
public class MainClass {
    public static void main(String args[])
    {
        Assignment dataobject=new Assignment();
        dataobject.localVariables();
        dataobject.printValues();
        Assignment5 singletonobject=Assignment5.getObject("Nikhitha");
        singletonobject.printString();
    }
}
