public class cursion{

	public static int recursiveFib(int term){
		if(term == 0){
			return 0;
		}else{
			if(term == 1){
				return 1;
			}else{
				return (recursiveFib(term - 1) + recursiveFib(term - 2));
			}
		}
	}
	
	
	
	public static void main(String[] args){
		//System.out.println(recursiveFib(2));
	}
}