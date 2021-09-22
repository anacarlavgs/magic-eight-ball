import java.util.Random;
import java.util.Scanner;

public class MagicBall {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("Enter your question");
		scan.next();
		scan.close();
		
		int n = rand.nextInt(7);
		
		switch(n) {
		case 0: System.out.println("Sure!"); break;
		case 1: System.out.println("No!"); break;
		case 2: System.out.println("hmm, maybe."); break;
		case 3: System.out.println("As I see it, yes."); break;
		case 4: System.out.println("Absolutely no."); break;
		case 5: System.out.println("In your dreams."); break;
		case 6: System.out.println("Hell yeah!!"); break;
		
		}
	}

}
