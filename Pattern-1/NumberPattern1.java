import java.util.Scanner;

/**
 * NumberPattern1
 */
public class NumberPattern1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            
            for (int j = 0; j <= i; j++) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}