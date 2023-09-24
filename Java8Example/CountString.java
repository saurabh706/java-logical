import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountString {
    
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter String to get count of each character :");
            String str = scanner.nextLine();
            Map<String,Long> map = Arrays.asList(str.split("")).stream().
            collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            map.forEach((k,v)-> System.out.println(k+" : "+v));
        }
    }
}
