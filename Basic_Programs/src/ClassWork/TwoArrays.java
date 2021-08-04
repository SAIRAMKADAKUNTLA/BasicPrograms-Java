package ClassWork;

public class TwoArrays {
	public void Get() {
		int[] arr1= {2,4,5,6,7,8};
		int[] arr2= {3,5,6,7,8,9};
		int[] mul= new int[arr1.length] ;
		int[] sum=new int[arr1.length]; 
		System.out.print("mul is");
		for(int i=0;i<arr1.length;i++) {
				mul[i]=arr1[i]*arr2[i];	
				sum[i]=arr1[i]+arr2[i];
		}
		for(int i=0;i<arr1.length;i++) {
			System.out.print(mul[i]+" ");
		}
		System.out.print("sum is");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(sum[i]+" ");
		}
	
	}

	public static void main(String[] args) {
		TwoArrays mul=new TwoArrays();
		mul.Get();
		// TODO Auto-generated method stub

	}

}
