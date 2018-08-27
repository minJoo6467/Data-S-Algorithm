package codility;

import java.util.Arrays;
import java.util.Random;

//다른 사람 100% 결과 코드
//xor..
//똑같은 수들을 제외한 나머지 값 return!!!
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