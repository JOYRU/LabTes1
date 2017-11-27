package joy.com.ru;
import java.util.*;
import java.io.*;


public class Function {
	Scanner sc = new Scanner(System.in) ;  
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     
	 void add(){
		 int x , y;
		 String s ; 
		 System.out.print(">");
		 s = sc.next() ;
		 s = s.replace('+', ' ') ; 
		 String[] thin = s.split(" ") ; 
		
		
		 x = Integer.parseInt(thin[0]) ;
		 y = Integer.parseInt(thin[1]) ;
		 
		 System.out.println(x+y) ; 
		 
		 
	 }
	 
	 void subtraction(){
		 int x , y;
		 String s ; 
		 System.out.print(">");
		 s = sc.next() ;
		 s = s.replace('-', ' ') ; 
		 String[] thin = s.split(" ") ; 
		
		
		 x = Integer.parseInt(thin[0]) ;
		 y = Integer.parseInt(thin[1]) ;
		 
		 System.out.println(x-y) ; 
		 
		 
	 }
	 void multiplication(){
		 int x , y;
		 String s ; 
		 System.out.print(">");
		 s = sc.next() ;
		 s = s.replace('*', ' ') ; 
		 String[] thin = s.split(" ") ; 
		
		
		 x = Integer.parseInt(thin[0]) ;
		 y = Integer.parseInt(thin[1]) ;
		 
		 System.out.println(x*y) ; 
		 
	 }
	 
	 void division(){
		 int x , y;
		 String s ; 
		 System.out.print(">");
		 s = sc.next() ;
		 s = s.replace('/', ' ') ; 
		 String[] thin = s.split(" ") ; 
		
		
		 x = Integer.parseInt(thin[0]) ;
		 y = Integer.parseInt(thin[1]) ;
		 
		 System.out.println(x/y) ; 
		 
		 
	 }
}
