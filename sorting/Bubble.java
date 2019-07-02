
import java.util.Scanner;

public class tree1 {
       
	public int hmm(int g[],int l,int f,int x) {
	if(g[f-1]<x&&g[l-1]>x) {
		int mid = (f+l)/2;
		if(g[mid]== x)
			return mid;
		if(g[mid+1]==x) {
			return mid+1;
			
		}
		if(g[mid-1]==x) {
		     return mid-1;
			}
		
		if(g[mid]>x)
			return hmm(g,mid-1,f,x);
		else
			return hmm(g,l,mid+1,x);
		
		
	}
	return -1;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner k = new Scanner(System.in);
       System.out.println("enter the n value ");
       int n = k.nextInt();
       tree1  op= new tree1();
       int arr[]= {2,3,4,5,6,7,8,9};
       int l= arr.length;
       int o= 1;
       int result=op.hmm(arr,l,o,n);
       
       System.out.println("find value in "+result);
	}

}
