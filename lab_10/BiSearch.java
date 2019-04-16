public class BiSearch{
  public BiSearch(){  
  }

  public int search(int a, int[] b, int c, int d){//target, array, midpoint,previous mid
    int target = a;
    int[] domain = b;
    int mid = c;
    int previ = d;
    int change = 0;
    if(previ == 0){
      previ = domain.length;
    }

    if(target > domain[domain.length-1]){
      return -1;
      }

    if(domain[mid] == target){//if the target is in the middle
      return mid+1;
      }

    if(domain[mid] > target){//target is to the left of mid
      change = Math.abs((mid - previ) / 2);
      int newmid = mid-change;
      System.out.println(mid+" "+change+" midabove");
      return search(target, domain,newmid , mid);
      }

    if(domain[mid] < target){//target is to the right of mid
      change = Math.abs(previ - mid) /2;
        System.out.println(mid+" "+change+" midbelow");
      return search(target, domain, mid + change, mid);
      }

      return -1;
    }
}
