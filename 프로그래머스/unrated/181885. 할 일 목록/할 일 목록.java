import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
       String[] answer = {};
                    
                    List<String> fal = new ArrayList<>();
                    
                    for(int i=0; i<finished.length; i++){
                        if(finished[i] == false) {
                        	fal.add(todo_list[i]);
                        }
                    }

                    answer = new String[fal.size()];
                    
                    for(int i=0; i<answer.length; i++) {
                    	answer[i] = fal.get(i);
                    }
                    
                    return answer;
    }
}