class Solution {
    public int solution(int N) {
        
        int previousGapCount = 0;
        
        int currentGapCount = 0;
        
        String[] binary = Integer.toBinaryString(N).split("");
        
        for (int i = 0; i < binary.length; i++ ) {
            if (binary[i].equals("1")) {
                if (currentGapCount > previousGapCount) {
                    previousGapCount = currentGapCount;
                }
                currentGapCount = 0;
            }

            if (binary[i].equals("0")) {
                currentGapCount += 1;
            }
        }
        
        return previousGapCount;
    }
}
