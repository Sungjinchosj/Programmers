import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
         int[] answer = new int[commands.length];
                    
                    List<Integer> num = new ArrayList<>();
                    List<Integer> correct = new ArrayList<>();
                    
                    for(int i=0; i<commands.length; i++) {
                    	for(int j=0; j<commands[i].length; j++) {
                    		
                    		for(int k=(commands[i][j])-1; k<commands[i][j+1]; k++) {
                    			
                    			num.add(array[k]);
                    			
                    		}
                    		num.sort(null);
//                    		System.out.print(num.get((commands[i][j+2])-1));
                    		correct.add(num.get((commands[i][j+2])-1));
                    		num.clear();
                    		j=(commands[i].length)-1;
                    	}
                    }
                    
//                    System.out.println(correct);
                    
                    for(int i=0; i<answer.length; i++) {
                    	answer[i] = correct.get(i);
                    }
                    
                    
                    return answer;
    }
}