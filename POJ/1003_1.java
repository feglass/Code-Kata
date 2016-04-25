import java.util.ArrayList;
import java.util.Scanner;

//3172K,157MS
public class Main {
	 
	  public static void main(String args[]) { 
		  
		  ArrayList<Double> goal = new ArrayList<Double>();
		  Scanner in = new Scanner(System.in);
		  Double temp;
		  while((temp = in.nextDouble()) != 0.00) {
			  goal.add(temp);
		  }
		  		  
		  for(int j=0; j<goal.size(); j++) {
			  int i = 0;;
		      for(double sum=0, num=2; sum < goal.get(j); num++, i++) {
			      sum += 1/num;
		      }
		      System.out.println(i + " card(s)");
	      }  

	  }
}

