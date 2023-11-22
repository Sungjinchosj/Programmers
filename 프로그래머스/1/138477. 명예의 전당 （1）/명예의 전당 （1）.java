import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
               int[] answer = new int[score.length];
                    
                    List<Integer> num = new ArrayList<>();
                    List<Integer> sNum = new ArrayList<>();
                    
                    for(int i=0; i<score.length; i++) {
                    	if(i<k) {
                    		num.add(score[i]);
                    		num.sort(null);
                    		sNum.add(num.get(0));
                    	}else {
                    		int min = Integer.MAX_VALUE;
                    		
                    		for(int n : num) {
                    			if(min > n) {
                    				min = n;
                    			}
                    		}
                    		if(min <= score[i]) {
            					num.remove(0);
            					num.add(score[i]);
            					num.sort(null);
            					System.out.println(num);
                    		}
                    		sNum.add(num.get(0));
                    	}
                    	
                    	
                    	
                    }
                    System.out.println(sNum);
                    
                    for(int i=0; i<answer.length; i++) {
                    	answer[i] = sNum.get(i);
                    }
                    
                    return answer;
    }
}