package ClassWork;

import java.util.Scanner;

public class MinArray {
	public void Get() {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number of elements");
		int length=scan.nextInt();
		int[] array= new int[length];
		int i;
		for( i=0;i<length;i++) {
			System.out.println("enter "+(i+1)+" element");
			array[i]=scan.nextInt();			
		}
		System.out.println("the array is:");
		for(i=0;i<length;i++) {
			System.out.print(array[i]+",");			
		}
		int min=array[0];
		for(i=0;i<array.length;i++) {
			if(min > array[i]) {
			 min = array[i];
			}
			for(i=min;i>min;i++) {
				if(min>array[i]) {
					min=array[i];
				}
				System.out.println("minimum is");
				System.out.print(min+" ");
			}
		}		
	}

	public static void main(String[] args) {
		MinArray ma=new MinArray();
		ma.Get();

	}

}
