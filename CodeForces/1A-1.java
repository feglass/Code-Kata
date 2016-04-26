import java.util.Scanner;

//38500K, 124ms
public class Main {
	 
	  public static void main(String args[]) { 
		  
		  Scanner in = new Scanner(System.in);
		  double n = in.nextDouble();
		  double m = in.nextDouble();
		  double a = in.nextDouble();
          System.out.println((long)Math.ceil(n/a) * (long) Math.ceil(m/a));

}
}

