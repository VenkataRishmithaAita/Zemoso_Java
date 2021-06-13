package JavaAssignment;
class EvenNumberException extends Exception
{
    EvenNumberException(String exception)
    {
        super(exception);
    }
}
class NumberEqualToZero extends Exception
{
    NumberEqualToZero(String exception)
    {
        super(exception);
    }
}
class StringLengthLessThanFive extends Exception
{
    StringLengthLessThanFive(String exception)
    {
        super(exception);
    }
}
public class Assignment8 {
    public static void main(String args[])
    {
        String name="maya";
        int number1=0;
        int number2=10;
        try
        {
            if(number1==0)
                throw new NumberEqualToZero("number is equal to zero");
            if(name.length()<5)
                throw new StringLengthLessThanFive("length of string is less than 5");
            if(number2%2==0)
                throw new EvenNumberException("Number is a even number");

        }
        catch(Exception object)
        {
            System.out.println(object);
        }
        finally
        {
            System.out.println("All resources are deallocated");
        }
    }
}
