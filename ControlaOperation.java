package joy.com.ru;
import java.util.Scanner;

public class ControlaOperation {

	public static void main(String[] args) {
		Scanner scaner = new Scanner(System.in) ;
		
		System.out.println("1)Addition") ;
		System.out.println("2)Subtraction") ;
		System.out.println("3)Multiplition") ;
		System.out.println("4)Divition") ;
		System.out.println("5)quit") ;
		Repeat ob1 = new Repeat() ; 
		ob1.toRepeat();
		
		/*System.out.println("Select your operation : ") ;
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
				System.out.println("Bye..") ; 
				return;
			
				
			
		}*/
		

	}

}
