import java.util.*;
public class reverseSentence{
  public String reverse(String word){
    if(word.length() == 1){
      return word;
    }else{
    return (reverse(word.substring(1)) + word.substring(0,1));
    }
  }

  public String reverseIter(String start){
    String buffer = "";
    String send = "";
    String word[];

    word = new String[start.length()];
    for(int i = 0; i < start.length(); i++){
      word[i] = start.substring(i,i+1);
    }
    //System.out.println(word[start.length]);

    for(int j = 0; j < Math.floor(word.length/2); j++){
      buffer = word[j];
      word[j] = word[word.length - 1 - j];
      word[word.length - 1 - j] = buffer;
    }
    send = word[0];
    for(int k = 1; k < Math.floor(word.length); k++){
      send = send + word[k];
    }
    return send;
  }



}

