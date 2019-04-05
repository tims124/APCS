public class BiSearch{
  public BiSearch(){
    sorted = new int[11];
  }

  public int[] arrayFill(int[] a, int start, int end){
    int j = 0;
    for(int i = start; i < end; i++){
      a[j] = i;
      j++;
    }
    return a;
  }

  public int search(int a, int[] b, int c){//target, array, midpoint
    int target = a;
    int[] domain = b;
    int mid = c;

    if(target > domain[domain.length-1]){
      return -1;
      }

    if(domain[mid] == target){//if the target is in the middle
      return mid;
      }

    if(domain[mid] > target){//target is to the left of mid
      return search(target, domain, mid - (mid/2));
      }

    if(domain[mid] < target){//target is to the right of mid
      return search(target, domain, mid +(mid/2));
      }

    return -1;
    }
private int[] sorted;
}
