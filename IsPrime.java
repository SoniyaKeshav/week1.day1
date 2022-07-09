package week1.day1;

import java.util.Iterator;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=13;
		boolean res =true;
		for (int i=2; i<n/2; i++) {
			if (n % i ==0)
			{
				res =false;
				break;
			}
		}
		if(res)
			System.out.println("Pime number");
		else
			System.out.println("Non Prime Number");
		
	}
}
