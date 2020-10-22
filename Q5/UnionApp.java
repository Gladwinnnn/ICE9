import java.util.*;

public class UnionApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first line> ");
        String firstLine = scanner.nextLine();
        System.out.print("Enter second line> ");
        String secondLine = scanner.nextLine();
        String firstSplit = firstLine;
        String[] firstArr= firstLine.split(",");
        String secondSplit = secondLine;
        String[] secondArr = secondLine.split(",");
        HashSet<Integer> result = new HashSet<>();

        for (String number: firstArr){
            if (!result.contains(number)){
                int placeHolder = Integer.parseInt(number);
                result.add(placeHolder);
            }
        }

        for (String number: secondArr){
            if (!result.contains(number)){
                int placeHolder = Integer.parseInt(number);
                result.add(placeHolder);
            }
        }

        List<Integer> sorted = new ArrayList<Integer>(result); 
        Collections.sort(sorted); 

        Iterator<Integer> iter = sorted.iterator();
        String output = "";
        while (iter.hasNext()){
            int number = iter.next();
            output += "" + number + ",";
        }
        output = output.substring(0, output.length()-1);
        System.out.print(output);
    }
}