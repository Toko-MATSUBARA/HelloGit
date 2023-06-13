import java.util.Random;
import java.util.Scanner;
class DiceGame{


    

    public static void main(String args[]){

	System.out.println("What is your name?");
	Scanner scan = new Scanner(System.in);

	String str = scan.next();

	System.out.println("Hello," + str + "!");
	
	System.out.println("Rolling dice...");

	Random rand = new Random();
	int num = rand.nextInt(10);
	System.out.println("Die 1: " + num);

	Random dom = new Random();
	int ber = dom.nextInt(10);
	System.out.println("Die 2: " +ber);

	int sum = num + ber;

	System.out.println("Total value: " + sum);

	if(sum > 7) System.out.println("You won!");
	else System.out.println("You lost.");


    }

}
