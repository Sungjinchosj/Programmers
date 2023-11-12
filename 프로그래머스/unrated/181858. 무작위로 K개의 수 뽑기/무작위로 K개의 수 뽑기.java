import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
         int[] answer = {};
                    answer = new int[k];
                    
                    List<Integer> num = new ArrayList<>();
                    int [] kArr = Arrays.stream(arr).distinct().toArray();

                    int length = kArr.length;
                    
                    for(int i=0; i<answer.length; i++) {
                        if(length != 0){
                            answer[i] = kArr[i];
                            length--;
                        }else{
                            answer[i] = -1;
                        }
                    	
                    }
                    
                 
          
                    
                    return answer;
    }
}