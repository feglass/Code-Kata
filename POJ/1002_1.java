import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;


public class Main {
	
	  private static Map<Character,Integer> letter_map;
	  private static Map<String,Integer> result_map;
	
	  public static void main(String args[]) { 
		  
		   
	        
	        letter_map=new HashMap<Character,Integer>();  
		      char c='A';
		      for(int i=0; i<24; i++) {
		        	if(i < 16)  //Q之前
		        	    letter_map.put((char)(c + i), (i/3) + 2 );
		        	else letter_map.put((char)(c + i + 1), (i/3) + 2 );
		      }
		      char d='0';
		      for(int i=0; i<10; i++)  {
		    	  letter_map.put((char)(d+i), i);
		      }
		    
		    result_map =new HashMap<String,Integer>();
	        
	        Scanner sc = new Scanner(System.in);
	        String readStr =  new String();
	        int n = sc.nextInt();
	        for(int i=0 ; i < n; i++) {
	        	readStr = sc.next();
	        	addToMap(toStandardForm(readStr)); 	
	        }
	        
	        
	        
	        print();
	           
	    } 
	  
   private static void addToMap(String str) {	   
		// TODO Auto-generated method stub
	 int count=0;
	 if(result_map.containsKey(str)) {
		 count=result_map.get(str);
		 result_map.put(str, count+1);
	 } else {
		 result_map.put(str, 1);	 
	 }	   	   
	}

   private static String toStandardForm(String str) {
		  String result = new String();		  
		  result = str.replace("-", "");
		 
//	      for(Entry<Character, Integer> entry:letter_map.entrySet()){    
	           // System.out.println(entry.getKey()+"--->"+entry.getValue());    
//	      }  
	    //  System.out.println("去斜杠: " + result);
	      
	      char res[] = result.toCharArray();
	      StringBuffer result1 = new StringBuffer();
		  for(int i=0; i<7; i++) {
			//  System.out.print(res[i] + " ");
			  result1.append(letter_map.get(res[i]));
		  }
		  result1.insert(3, '-');
		//  System.out.println("转换为标准: " + result1); 

		  return result1.toString();
	  }
	  
private static int  print() {
	
	//按value排序 
	 Iterator<Entry<String, Integer>> it = result_map.entrySet().iterator();
     while(it.hasNext()){
         Entry<String, Integer> entry = it.next();
         
         if (entry.getValue() == 1) {
        	  it.remove();    
         }

     }
    if(result_map.isEmpty()) {
    	System.out.println("No duplicates.");
    	return 0;
    }
	
	List<Map.Entry<String, Integer>> entryList = new ArrayList<Map.Entry<String, Integer>>(result_map.entrySet());   
	Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {     
	    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {        
	    	 return (o1.getKey()).toString().compareTo(o2.getKey());

	    }  
	});  	  
	for (int i = 0; i < entryList.size(); i++) {  
		
	    System.out.println(entryList.get(i).toString().replace('=', ' '));  
	}  
	return 1;
	  

}
	  
	

}
