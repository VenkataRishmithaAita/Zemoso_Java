package JavaAssignment;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment1 {
            public void printCurrentWorkingDirectory1() {
                File userDirectory = new File("C:\\Users\\DELL\\Desktop\\Zemoso_Java");
                Pattern pattern=Pattern.compile("Assignment[0-9]");
                String contents[] = userDirectory.list();
                File Filelist[] = userDirectory.listFiles();
                for (int i = 0; i < contents.length; i++) {
                    Matcher match= pattern.matcher(Filelist[i].getName());
                    if (match.find()) {
                        System.out.println(Filelist[i].getAbsolutePath());
                    }
                }
        }
    public static void main(String args[])
    {
        Assignment1 assignment1=new Assignment1();
        assignment1.printCurrentWorkingDirectory1();
    }
}
