package exerise;

public class Prob4 {

	public static void main(String[] args) {
		
		 char[] c1 = reverse( "Hello World" );
	      printCharArray( c1 );
	      
	      char[] c2 = reverse( "Java Programming!" );
	      printCharArray( c2 );
	   }
	   
	
	public static char[] reverse(String str) {
	      
		  String space="";
		  for(int i = str.length()-1; i>=0; i--) {
			  space += str.charAt(i);
		  }
		
	      return space.toCharArray();
	   }

	public static void printCharArray(char[] array){
	      /* 코드를 완성합니다 */
	      System.out.println( array );
	   }
	   

}


