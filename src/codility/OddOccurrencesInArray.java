package codility;

import java.util.Arrays;
import java.util.Random;

//�ٸ� ��� 100% ��� �ڵ�
//xor..
//�Ȱ��� ������ ������ ������ �� return!!!
public class OddOccurrencesInArray {

	public static int solution(int[]A) {
		int  temp = 0;
	
		for(int i=0; i<A.length; ++i) {
			temp  = temp ^ A[i];
			System.out.println("xor: " + temp);
		}
		return temp;
		
	}
	public static void main(String[] args) {
	
		int aa[] = {11,13,9,11,13,7,7};
		
		System.out.println(solution(aa));
		
	}
}