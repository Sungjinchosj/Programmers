import java.util.List;
import java.util.ArrayList;


class Solution {
    public String solution(String s, int n) {
                 String answer = "";
                    
                    List<Integer> num = new ArrayList<>();
                    
                    for(int i=0; i<s.length(); i++){
                        num.add((int)s.charAt(i));
                    }
                    
                    
                    for(int ch : num) {
                    	if(ch == 32) {
                    		answer += " ";
                    		
	                    }else {
	                    	
	                    	
	                    	if(ch >= 'a' && ch <= 'z') {
	                    		if(ch + n > 'z') {
	                    			ch = ch-26;
	                    		}
	                    			
	                    			answer += String.valueOf(String.valueOf((char)(ch+n)));
	                    	}
	                    	
	                    	else if(ch >= 'A' && ch <= 'Z') {
	                    		if(ch + n > 'Z') {
	                    			ch = ch-26;
	                    		}
	                    		
	                    		answer += String.valueOf(String.valueOf((char)(ch+n)));
	                    	}
	                    	
	                    	
	                    }
                    }
                    return answer;
    }
}