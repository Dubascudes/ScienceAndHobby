import java.util.Scanner;
public class primeFinder {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		long test = 0;
		boolean isPrime = false;
		System.out.println("Enter an integer: ");
		test = in.nextInt();
		while(true){
		if(test > 10 && ((test % 10 == 1)||(test % 10 == 3) || (test % 10 == 5) || (test % 10 == 7)|| (test % 10 == 9))){
			for(int x = 2; x < test;x++){				
				if(test%x==0){
					isPrime = false;
					break;
				}
				else{
					isPrime = true;
				}
			}
		}
		else if(test<10 && test%2==0 && test !=2 ||test==1 ||(test>=10 && ((test % 10 != 1) || (test % 10 != 5) || (test % 10 != 7)|| (test % 10 != 9)))){
			isPrime  = false;
			
		}
		else{
			isPrime = true;
			}
		System.out.println("Prime: "+isPrime);
		System.out.println("Enter new integer");
		test = in.nextInt();
		}
	}
}
