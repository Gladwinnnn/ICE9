package org.apache.commons.csv;

import java.io.*;
import java.lang.*;
import java.util.*;

public class DeanLister{
    public static void main(String[] args){
        try{
            ArrayList<String> students = new ArrayList<>();
            Reader in = new FileReader("result.csv");
            Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
            for (CSVRecord record : records) {
                if (!record.values()[3].equals("GPA") && !record.values()[3].equals("F")){
                    double GPA = Double.parseDouble(record.values()[3]);
                    if (GPA >= 3.7){
                        students.add(record.values()[0]);
                    }
                }
            }
            for (String student: students){
                System.out.println(student);
            }
        } catch(FileNotFoundException e){ // error
            e.getStackTrace();
        } catch(IOException e){
            e.getStackTrace();
        }
    }
}