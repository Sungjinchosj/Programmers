import java.util.List;
import java.util.ArrayList;


class Solution {
    public int solution(int[][] sizes) {
         int answer = 0;
                    
                    List<Integer> max = new ArrayList<>();
                    List<Integer> min = new ArrayList<>();
                    
                    
                    for(int i=0; i<sizes.length; i++) {
                    	int maxNum = Integer.MIN_VALUE;
                    	int minNum = Integer.MAX_VALUE;
                    	for(int j=0; j<sizes[i].length; j++) {
                    		maxNum = Math.max(maxNum, sizes[i][j]);
                    		minNum = Math.min(minNum, sizes[i][j]);
                    	}
                    	max.add(maxNum);
                    	min.add(minNum);
                    }
                    
                    int big = Integer.MIN_VALUE;
                    int smallBig = Integer.MIN_VALUE;
                    
                    for(int n : max) {
                    	big = Math.max(big, n);
                    }
                    
                    for(int sn : min) {
                    	smallBig = Math.max(smallBig, sn);
                    }
                    
                    answer = big * smallBig;
                    System.out.println(answer);
                    
                    return answer;
    }
}