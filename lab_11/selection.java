public class selection{
    public selection(int[] a){
	unsorted = a;
    }
    public int[] sort(){
	int key = 0;//index

	for(int i = 0; i < unsorted.length;i++){
	    for(int j = i;j<unsorted.length;j++){
		if(unsorted[j] < unsorted[key]){
		    key = j;
		}
	    }
	    int temp = unsorted[i];
	    unsorted[i] = unsorted[key];
	    unsorted[key] = temp;
	}
	return unsorted;
    }

    public String toString(){
        String out = unsorted[0]+"";
	for(int i = 1; i < unsorted.length; i++){
	    out = out+", "+unsorted[i];
	}
    return out;
    }
    private int[] unsorted;
}
