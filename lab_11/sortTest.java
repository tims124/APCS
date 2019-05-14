public class sortTest{
	public sortTest(){
	unsorted = new int[20];
	for(int i = 0; i < 20; i++){
			unsorted[i] = (int)(9*Math.random());
			System.out.println(unsorted[i]);
		}
	}	

	public static void main(String[] args){
	    System.out.println(unsorted[1]);
	    //for(int i = 0; i < unsorted.length; i++){
	    //	System.out.println(unsorted[i]);		
	    //
	}

	    
	    
 static private int[] unsorted;
}
