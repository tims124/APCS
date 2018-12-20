public class NumberPlay
{
	//The constructor will initialize the values of the class attribute num
	//(which is the length of the array) and will establish anArray as an
	//array of integers with length len
    public NumberPlay(int n){
        len = n;
        anArray = new int[len];
    }
    
    //fillArray will fill anArray with values 0<=value<b using the Math.random()
    //function
    public void fillArray(int b){//values inbetween 0 and b
		for(int count = 0; count < anArray.length; count++){
			int rand = (int)(Math.random()*(b+1));
			anArray[count] = rand;
		}
	}

	//findMax will find and return the maximum value in the array 
    public int findMax(){
		for(int itt = 0; itt < (anArray.length-1); itt++){
			if(anArray[itt] > anArray[itt+1]){
				int buffer = anArray[itt];
				anArray[itt] = anArray[itt+1];
				anArray[itt+1] = buffer;
			}
		}
		return anArray[anArray.length - 1];
	}
	
	//addOdds will add the odd values in the array and return the sum
	public int addOdds(){
		int sum = 0;
		for(int itt = 0; itt < (anArray.length); itt++){
			if(anArray[itt]%2 != 0){
				sum = sum + anArray[itt];
			}
		}
		return sum;
	}
	
	//displayArray will display the array on one line with the
	//elements separated by spaces
	public void displayArray(){
		for(int itt = 0; itt < (anArray.length); itt++){
			System.out.print(anArray[itt]+" ");
		}
	}
	
	//sortArray will sort the array from smallest to largest
	public void sortArray(){
		for(int itt = 0; itt < anArray.length; itt++){
			for(int count = 0; count < (anArray.length-1-itt); count++){
				if(anArray[count] > anArray[count+1]){
					int buffer = anArray[count];
					anArray[count] = anArray[count+1];
					anArray[count+1] = buffer;
				}
			}
		}
    }
    
    // attributes
	private int[] anArray;
	private int len;
}