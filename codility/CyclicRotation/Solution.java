// you can also use imports, for example:
// import java.util.*;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(int[] A, int K) {
        if (A.length == 0) { return A; }

        int last = A[A.length - 1];


        int[] array = A;
        List<Integer> processing = new ArrayList<Integer>(A.length);
        
        
        for (int i = 0; i < A.length; i++) {
            processing.add(A[i]);  
        }

        for (int i = 0; i < K; i++) {
            processing.remove(processing.size() - 1);
            processing.add(0, last);
            last = processing.get(processing.size() - 1);
        }
        
        for (int i = 0; i < processing.size(); i++) {
            array[i] = processing.get(i);
        }
        
        return array;
    }
}
