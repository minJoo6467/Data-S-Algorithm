package org.min.codility;

public class BinaryGap {

    public int solution(int N){

        String binary = Integer.toBinaryString(N);
        char[] gapResult = binary.toCharArray();

        int gap = 0;
        int total = 0;

        for (int i = 0; i < gapResult.length; ++i) {
            if (gapResult[i] == '0') {
                ++gap;
            } else { //gapResult °¡ 1ÀÏ¶§
                if (gap > total) {
                    total = gap;
                    gap = 0;
                }
            }
        }
        return total;

    }
}
