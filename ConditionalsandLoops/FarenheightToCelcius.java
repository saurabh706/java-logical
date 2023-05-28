import java.util.Scanner;
public class FarenheightToCelcius {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		int w = sc.nextInt();
		int result = 0;
		while(s <= e){
			result = (s - 32) * 5/9;
			System.out.println(s+" "+result);
			s += w;
		}


		
	}

}
