public class test{
	 public static void main(String[] args) {
		 int a =0;
		 int[] val = new int[12];
		 while(a<12){
			 val[a]=a;
			 a++;
		 }
		 int counter = 1;
		 int count=0;
		 int count1 = 0;
     int max = val[counter];
     int buffer;

     while(counter < 12){
       buffer = val[counter];
       max = Math.max(max,buffer);
       counter++;
     }
		 int pos = max;

		 while(count < max){

			if(pos > 9 ){
					System.out.print(pos+" |");
			}else{
					System.out.print(pos+"  |");
			}

			count1=0;
		 	while(count1 <12){
				if(val[count1] >= pos){
		 			System.out.print(" "+"*");
				}else{
					System.out.print("   ");
				}
				count1++;
			}
			System.out.println("");
			count++;
			pos--;

	 	}
		System.out.println("---------------------------------------");
		System.out.println("    	 1  2  3  4  5  6  7  8  9  10 11 12");

		 }}
