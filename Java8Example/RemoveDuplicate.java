// Remove Duplicate from Arrays
import java.util.Arrays;

public class RemoveDuplicate {
    
    public static void main(String[] args) {
        Integer[] nums = {1, 2, 3, 4, 5, 1, 2, 3};

        Integer[] list = Arrays.stream(nums).distinct().toArray(Integer[]::new);
        System.out.println(Arrays.toString(list));
    }
}
