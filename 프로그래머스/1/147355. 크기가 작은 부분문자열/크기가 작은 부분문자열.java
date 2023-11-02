class Solution {
    public int solution(String t, String p) {
          int answer = 0;
            
            long num = 0;
            int length = p.length();
            long number = Long.parseLong(p);
            
            	
            	for(int i=0; i< t.length(); i++) {
            			
            			num = Long.parseLong(t.substring(i, length));
            			length++;
            			
            			if(num <= number) {
            				answer++;
            			}
            			
            			if(length > t.length()) {
            				break;
            			}
            	}
            	
            	
            
            
            return answer;
    }
}