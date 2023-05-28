import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.next();
        char ch = str.charAt(0);
        if(ch >=97 && ch <=122){
            System.out.println(0);
        }else if(ch >=65 && ch <=90){
            System.out.println(1);
        }else{
            System.out.println(-1);

        }
    }
}