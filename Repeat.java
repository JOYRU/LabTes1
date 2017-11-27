package joy.com.ru;
import java.util.*;
import java.io.*;


public class Repeat {
	Scanner scaner = new Scanner(System.in);
	 void toRepeat(){
		
		System.out.println("Select your operation : ") ;
		int choice = scaner.nextInt() ; 
		Function ob = new Function() ; 
		
		switch(choice){
			case 1:
				ob.add() ; 
				break;
			case 2:
				ob.subtraction() ; 
				break;
			case 3:
				ob.multiplication() ; 
				break;
			case 4:
				ob.division() ; 
				break;
			case 5:
				System.out.println("Bye,now.") ; 
				return;
			
				
			
		}
		
		System.out.println("Would you like to continue? (y/n)") ; 
		char ch =scaner.next().charAt(0) ;
		
		if(ch=='y')
			toRepeat() ; 
		else
			System.out.println("Bye,now.") ; 
		
		
		
		
		
		
	}

}
