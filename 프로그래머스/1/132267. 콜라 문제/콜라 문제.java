class Solution {
    public int solution(int a, int b, int n) {
         int answer = 0;
                    
                    while(true){
                        
                    	if(n/a < 1) {
                    		break;
                    	}
                    	
                        answer += n / a * b;
                        
                        n = n - (n/a * a) + (n/a * b);
                            
                        
                        System.out.println(answer);
                        
                    }
                    
                    
                    return answer;
    }
}