public class BiSearch{
  public BiSearch(){  
  }


     public static int search(int arr[], int first, int last, int key){  
        if (last>=first){  
            int mid = first + (last - first)/2;  
	    if (arr[mid] == key){  
		return mid;  
            }  
            if (arr[mid] > key){  
		return search(arr, first, mid-1, key);
            }else{  
		return search(arr, mid+1, last, key);
            }  
        }  
        return -1;  
    }  

    public int[] bubbleSort(int[] a){
	for(int i = 0; i < a.length - 1; i++){
	    int temp = 0;
	    for(int j = 0; j < a.length - 1; j++){
		if(a[j] > a[j+1]){
		    temp = a[j];
		    a[j] = a[j+1];
		    a[j+1] = temp;
		}
	    }	    
	}

	return a;

    }

}
