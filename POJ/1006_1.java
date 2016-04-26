import java.util.Scanner;

//3932K, 4829MS
public class Main {
	public static void main(String[] args) {
		
		int ch;
		Scanner sc = new Scanner(System.in);
       	int sum = 0;
       	int i=0;
       	int a = 33*28*6;
       	int b=23*33*19;
       	int c=23*28*2;
       	int d = 23*28*33;
		
		while((ch = sc.nextInt())!= -1) {
			i++;
			sum = a*ch + b*sc.nextInt() + c*sc.nextInt();
			sum = (sum%(d) -sc.nextInt()) % 21252;
			if (sum<=0)
				sum += 21252;
			System.out.println("Case "+ i +": the next triple peak occurs in " + sum + " days.");
            
		}
		sc.close();	
	}

}
