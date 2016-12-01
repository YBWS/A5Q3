import java.util.Scanner;

/**
 * 
 */

/**
 * @author b.yang
 *
 */
public class A5Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput=new Scanner(System.in);
		
		double[] userNumber = new double[5];
		double userValue;
		double maxmum = -100000000;

		
		System.out.println("Please enter five  number");
		
		for(int i = 0; i <userNumber.length ;i++){
			System.out.println("Please enter a integer number : ");
			userNumber[i] = userInput.nextDouble();
			
		}
		for(int i = 0;i<userNumber.length;i++){
			if (userNumber[i] > maxmum){
				
				maxmum = userNumber[i];
			}
		}
		System.out.println ("the maxmum value is :" + maxmum);
		
		userInput.close(); 
	}

}
