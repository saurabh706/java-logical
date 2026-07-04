import java.util.Arrays;

/**
 * Given an array and a key, the task is to remove all occurrences of the specified key from the array in Java.
 */

public class RemoveArrayOccurance{
  public static void main(String[] args){
    int[] nums = {1,2,3,4,1,5,6,1};
    int key = 1;
    int[] result = Arrays.stream(nums).filter(n -> n != key).toArray();
    System.out.println(Arrays.toString(result));
  }
}
