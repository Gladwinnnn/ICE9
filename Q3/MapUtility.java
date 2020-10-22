import java.util.*;

public class MapUtility {


    public static void main(String[] args) {
        Map<String,String> input = new HashMap<>();
        input.put("Alfred", "81");
        input.put("Elise", "61");
        input.put("Billy", "41");
        input.put("Daniel", "41");
        input.put("Charlie", "54");


        System.out.println("Input:  " + input);
        Map<String,List<String>> result = reverse(input);
        System.out.println("Output: " + result);

    }

    public static Map reverse(Map<String,String> map){
        Map<String,ArrayList<String>> result = new HashMap();

        for (String student: map.keySet()){
            String marks = map.get(student);
            ArrayList<String> placeHolder = result.get(marks);

            if (placeHolder == null){
                ArrayList<String> students = new ArrayList<>();
                students.add(student);
                result.put(marks,students);
            } else{
                placeHolder.add(student);
            }
        }
        return result;
    }
}
