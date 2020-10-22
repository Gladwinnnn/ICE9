import java.util.*;

public class FrequencyApp {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the word> ");
        String word = scanner.nextLine();

        while (!word.isEmpty()){
            if (map.get(word) == null){
                int counter = 1;
                map.put(word, counter);
            } else{
                int result = map.get(word);
                result += 1;
                map.put(word, result);
            }
            System.out.print("Enter the word> ");
            word = scanner.nextLine();
        }
        
        scanner.close();
        System.out.print("Frequency Count:");
        System.out.println();

        for (String key: map.keySet()){
            System.out.println(map.get(key) + " " + key);
        }
    }
}