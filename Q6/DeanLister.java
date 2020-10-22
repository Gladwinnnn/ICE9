import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.*;

public class DeanLister{
    public static void main(String[] args){
        deanLister("result.csv");
    }

    public static void deanLister(String fileNameAndPath){
        ArrayList<String> students = new ArrayList<>();
        try{
            File file = new File(fileNameAndPath);
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String data = scanner.nextLine();
                String[] placeHolder = data.split(",");
                if (!placeHolder[3].equals("GPA") && !placeHolder[3].equals("F")){
                    double GPA = Double.parseDouble(placeHolder[3]);
                    if (GPA >= 3.7){
                        students.add(placeHolder[0]);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.getStackTrace();
        }
        for (String student: students){
            System.out.println(student);
        }
    }
}