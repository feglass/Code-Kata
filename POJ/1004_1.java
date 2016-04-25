import java.util.Scanner;

//3272K,157MS
public class Main {
	 
	  public static void main(String args[]) { 
		  
		  Scanner in = new Scanner(System.in);
		  double sum = 0;
		  for (int i=0; i<12; i++) {
			  sum += in.nextDouble();
		  }
		  double result = sum/12;
		  result = Double.parseDouble(String.format("%.2f", result));  //四舍五入并保留两位小数
		  System.out.println("$" + result);
		  

	  }
}

