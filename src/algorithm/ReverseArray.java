package doIt2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	//배열의 요소 a[idx1]와 a[idx2]를 교환
	static void swap(int[]a , int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2]; 
		a[idx2] = t;
	}
	

	//배열 a이 요소 값을 나타냄
	static void print(int[]a) {
		for(int i=0; i<a.length; i++) {
		
			System.out.print(a[i]+ " ");
		}
			System.out.println();
	}
		
	//역순으로 정렬
	static void reverse(int[] a) {
		
		print(a);
			
		for(int i=0; i< a.length/2 ; i++) {
	
			System.out.println("a["+i+"]과 "+ "a[" + (a.length-i-1) +"]를 교환합니다.");
			swap(a, i , a.length-i-1 );
			print(a);
		}
		
	}
	
	public static void main(String[] args) {
	
		int[] x = new int[]{5, 10, 73, 2, -5, 42};
	
		reverse(x);
		
		System.out.print("역순 정렬을 마쳤습니다.");

	}

}
