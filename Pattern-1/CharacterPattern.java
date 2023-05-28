import java.util.Scanner;
public class CharacterPattern{
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i=1;
		while(i <= n){
			int j =1;
			int p = i;
			while(j <= i){
				char ith = (char)('A' + p -1);
				System.out.print(ith);
				p++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}