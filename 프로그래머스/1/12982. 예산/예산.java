import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Solution {
    public int solution(int[] d, int budget) {
             int count = 0;
            int sum = 0;
        
         Arrays.sort(d);
            
            for(int i=0; i<d.length; i++) {
            	if(sum + d[i] <= budget) {
            		sum += d[i];
            		count ++;
            	}else if(sum + d[i] > budget){
            	
            		break;
            	}
            }
            
      
            
            return count;
    }
}