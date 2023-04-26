//Create a java program to search through the home directory and look for files that match a regular expression. The program should be able to take inputs repeatedly and should print out the full absolute path of the matching files found



import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;



public class Assignment1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dirPath = "C:\\Users\\jaswa\\OneDrive\\Desktop\\Components";
        File directory = new File(dirPath);
        System.out.println("Enter the target filename :");
        String target = scanner.nextLine(); 
        Pattern pattern = Pattern.compile(target);
        System.out.println("these are the absolute paths of matching files :");
        search(directory, pattern);
    }
        private static void search(File directory, Pattern pattern) {
            File[] files = directory.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        search(file, pattern);
                    } else {
                        Matcher matcher = pattern.matcher(file.getName());
                        if (matcher.matches()) {
                            System.out.println(file.getAbsolutePath());
                    }
                }
            }
        }
    }
}
