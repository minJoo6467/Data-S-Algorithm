package doIt2;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

	//�迭�� ��� a[idx1]�� a[idx2]�� ��ȯ
	static void swap(int[]a , int idx1, int idx2) {
		int t = a[idx1]; 
		a[idx1] = a[idx2]; 
		a[idx2] = t;
	}
	

	//�迭 a�� ��� ���� ��Ÿ��
	static void print(int[]a) {
		for(int i=0; i<a.length; i++) {
		
			System.out.print(a[i]+ " ");
		}
			System.out.println();
	}
		
	//�������� ����
	static void reverse(int[] a) {
		
		print(a);
			
		for(int i=0; i< a.length/2 ; i++) {
	
			System.out.println("a["+i+"]�� "+ "a[" + (a.length-i-1) +"]�� ��ȯ�մϴ�.");
			swap(a, i , a.length-i-1 );
			print(a);
		}
		
	}
	
	public static void main(String[] args) {
	
		int[] x = new int[]{5, 10, 73, 2, -5, 42};
	
		reverse(x);
		
		System.out.print("���� ������ ���ƽ��ϴ�.");

	}

}
