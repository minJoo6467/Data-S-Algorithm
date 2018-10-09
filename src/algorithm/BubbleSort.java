package algorithm;

public class BubbleSort {

	//Swap
	static void swap(int[]a, int idx1, int idx2) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
		
	}
	//bubbleSort
	static void bubbleSort(int[]a, int n) {
		
		for(int i=0; i < n-1; i++) {
			for(int j=0; j < n-1; j++) {
				if(a[j] > a[j+1]) {
					swap(a, j, j+1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("�������� Start!");
		
		int nx = 7;
		
		int[] x = {22,5,11,32,120,68,70}; //�迭 ����
		
		bubbleSort(x, nx);

		
		System.out.println("�������� ���� ��.");
		
		for(int i=0; i< nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
	}
}
