import java.util.Arrays;
import java.util.Collections;

/**
 * Java String Program to Reverse a String
 */
public class ReverseString {
    
    public static void reverseUsingArrays(String[] str){
        Arrays.sort(str, Collections.reverseOrder());
        String val = "";
        for (String string : str) {
            val = val.concat(string);
        }
        System.out.println("reverseUsingArrays :"+val);
    }

    public static void reverseUsingSB(String str){
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder = stringBuilder.reverse();
        System.out.println("reverseUsingSB :"+stringBuilder);
    }

    public static void reverseUsingSBuffer(String str){
        StringBuffer stringBuffer = new StringBuffer(str);
        stringBuffer = stringBuffer.reverse();
        System.out.println("reverseUsingSBuffer :"+stringBuffer);
    }

    public static void main(String[] args) {
        String str = "Geeks";
        reverseUsingArrays(str.split(""));
        reverseUsingSB(str);
        reverseUsingSBuffer(str);
    }
}
