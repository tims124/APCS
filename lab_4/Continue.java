
import java.util.Scanner;
public class Continue{
	public Continue(){

	}

	public void Continue(){
		int test = 0;
		Scanner input = new Scanner(System.in);
		while(test == 0){
			System.out.println("Do you want to continue?");
			String in = input.nextLine();

			if(in.equals("Y") || in.equals("Yes") || in.equals("OK") || in.equals("Sure") || in.equals("Why not?") || in.equals("WHY NOT?")){
				System.out.println("Ok");
				test = 1;
			}
			if(in.equals("y") ||in.equals("yes") || in.equals("ok") || in.equals("sure") || in.equals("why not") || in.equals("why not?")) {
				System.out.println("Ok");
				test = 1;
			}

			if(in.equals("N") || in.equals("NO") || in.equals("No")){
				System.out.println("terminating");
				test = 2;
			}
			if(in.equals("n") || in.equals("no")){
				System.out.println("terminating");
				test = 2;
			}

			if(test == 0){
				System.out.println("Bad Input, try again");
			}
		}
}
}
