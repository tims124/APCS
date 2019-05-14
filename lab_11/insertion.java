import java.util.*;
public class insertion{
    public insertion(int l){
	array = new int[l];
	}

    public int[] sort(int[] unsorted){
        int n = unsorted.length; 
        for (int i = 1; i < n; ++i) { 
            int key = unsorted[i]; 
            int j = i - 1; 
 
            while (j >= 0 && unsorted[j] > key) { 
                unsorted[j + 1] = unsorted[j]; 
                j = j - 1; 
            } 
            unsorted[j + 1] = key; 
        }
	array = unsorted;
	return unsorted;
    }

    public String toString(){
        String out = array[0]+"";
	for(int i = 1; i < array.length; i++){
	    out = out+", "+array[i];
	}
    return out;
    }
    private int[] array;
}
