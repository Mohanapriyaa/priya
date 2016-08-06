import java.util.Scanner;


public class Vowels {

	public static String main(String[] d) {
		String s5="";
		 Scanner sc=new Scanner(System.in);
	      String d1=sc.nextLine();
	      
	      for(int i=0;i<d1.length();i++)
	      {
	    	  if(d1.charAt(i)=='a'||d1.charAt(i)=='e'||d1.charAt(i)=='i'||d1.charAt(i)=='o'||d1.charAt(i)=='u')
	    	  {
	    		  s5="vowels";
	    	  }
	    	  else
	    	  {
	    		 s5="consonant";
	    	  }
	      }
	      return s5;
	}

}
