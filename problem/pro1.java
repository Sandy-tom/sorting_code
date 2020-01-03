

//Given an unsorted array arr[] of size N, rotate it by D elements (clockwise).

import java.util.Scanner;

public class pro2 {
	
	
   public void pro(int s,int n,int[] arr){
    	int temp[] = new int[s];
    	int l = arr.length;
    	int k = l;
           for(int i=0;i<l;i++) {
        	   
        	   temp[i] = arr[(i+n)%k];
           }
          
    
    	for(int i =0;i<l;i++) {
    		
    		System.out.print(temp[i]);
    	}  	
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner j = new Scanner(System.in);
		
		System.out.println("enter the test case");
		int n = j.nextInt();
		while(n>0){
			
			System.out.println("enter the lenth of the element of arry");
			int l = j.nextInt();
			int arr[]  = new int[l]; 
			System.out.println("enter the lenth of element to swap");
			int v = j.nextInt();
			System.out.println("enter the array element ");
			for(int i = 0;i<l;i++) {
				arr[i] = j.nextInt();				
			}
			n--;
			pro2 k = new pro2();
			k.pro(l,v,arr);
			
		}
	}

}
