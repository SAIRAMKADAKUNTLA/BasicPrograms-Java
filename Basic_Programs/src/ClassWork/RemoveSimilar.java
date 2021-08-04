package ClassWork;

import java.util.Scanner;

public class RemoveSimilar {

	public static void main(String[] args) {
		RemoveSimilar similar=new RemoveSimilar();
		similar.Get();
		
	}
	public void Get() {
		String common="";
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first string");
		String s1=scan.next();
		System.out.println("Enter second string");
		String s2=scan.next();
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i) == s2.charAt(j)) {
					common += s1.charAt(i);				
				}				
			}
			count++;
			System.out.println(common+": "+count);
		}
		for(int i=0;i<common.length();i++) {
			String toRemove=common.charAt(i)+"";
			s1=s1.replace(toRemove, "");
			s2=s2.replace(toRemove, "");
			
		}

	
		System.out.println("updated  s1:"+s1);
		System.out.println("updated  s2:"+s2);
	
	}
	
}
