public class Palindrome{
  public Palindrome(){
  }

  private String punctuation(String sent){//! , . ? -
    String buffer = "";
    String buffer2 = "";  
    int mark = 0;
    String[] punc = new String[5];

    punc[0] = "!";
    punc[1] = "?";
    punc[2] = ".";
    punc[3] = ",";
    punc[4] = "-";
    for(int i = 0; i < sent.length(); i++){
      if(sent.substring(i,i+1).equals(" ")){
        buffer = buffer + sent.substring(mark, i);
        mark = i+1;
      }
    }
    buffer = buffer + sent.substring(mark, sent.length());
    mark = 0;

    for(int i = 0; i < buffer.length(); i++){
      if(buffer.substring(i,i+1).equals(".")){
        buffer2 = buffer2 + buffer.substring(mark, i);
        mark = i+1;
      }
    }

    buffer2 = buffer2 + buffer.substring(mark, buffer.length());
    return buffer2;
  }


  public boolean isPalindrome(String s){
    String test = s;
    test= test.toLowerCase();
    String buffer = "";
    int mark = 0;

    //removes some punctuation
    test = this.punctuation(test);

    //checks to see if the string is a palindrome
    String fwd = test.substring(0,1) + test.substring(test.length() - 1);
    if(test.length() > 2){
      return (isPalindrome(test.substring(1,test.length()-1)) && isPalindrome(fwd));
    }
    if( (test.length() == 2) && test.substring(0,1).equals(test.substring(1)) || test.length() == 1){
      return true;
    }else{
      return false;
    }


  }

}
