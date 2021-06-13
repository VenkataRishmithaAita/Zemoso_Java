package JavaAssignment;
import java.util.*;
public class Assignment2 {
    public boolean isStringContainsAllAlphabets(String phrase)
    {
        if(phrase.length()<26)
            return false;
        String upperPhrase=phrase.toUpperCase();
        String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        for(int index=0;index<alphabets.length();index+=1)
        {
            char currChar=alphabets.charAt(index);
            if(upperPhrase.indexOf(currChar)!=-1)
                continue;
            else
                return false;
        }
        return true;
    }
    public void tester(String phrase)
    {

        if(isStringContainsAllAlphabets(phrase))
            System.out.println("String contains a-z alphabets");
        else
            System.out.println("String do not contain a-z alphabets");
    }
    public static void main(String args[])
    {
        Assignment2 object=new Assignment2();
        Scanner sc=new Scanner(System.in);
        String phrase=sc.nextLine();
        object.tester(phrase);
    }
}
//Time complexity is O(26)