public class Palindrome{
  public Palindrome(){
  }

  private String punctuation(String sent){//! , . ? -
    String pali = sent;
    String buffer = "";
    String ls = ",.?!-'  ";
    for(int i = 0; i <pali.length()-1;i++){
	for(int j = 0; j < ls.length()-1;j++){
	    
	    if((ls.substring(j,j+1).indexOf(pali.substring(i,i+1))==0)){
		pali = pali.substring(0,i) + pali.substring(i+1);
	    }
	}
    }
    //System.out.println(pali);
    return pali;
  }	    
   
    
  public boolean isPalindrome(String s){
    String test = s;
    test = test.toLowerCase();

    //removes punctuation
    test = this.punctuation(test);
    
    if(test.length() == 1){return true;}
    if(test.length() == 2){
	String first = test.substring(0,1);
	String last = test.substring(1,2);
	return first.equals(last);
    }
    
    String first  = test.substring(0,1);
    String last = test.substring(test.length() - 1);
    String mid = test.substring(1,test.length() - 2);

    if(first.equals(last)){
	return true && isPalindrome(mid);
    }
    return false;


  }

}
