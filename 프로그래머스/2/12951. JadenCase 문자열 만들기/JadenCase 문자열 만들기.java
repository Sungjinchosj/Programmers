class Solution {
    public String solution(String s) {
       String answer = "";
                	  
                      String[] sp = s.toLowerCase().split("");
                      
                      boolean flag = true;

                      for(String ss : sp) {
                    	  
                    	  
                    	  if(flag) {
                    		  answer += ss.toUpperCase();
                    	  }else {
                    		  answer += ss;
                    	  }
                    	  
                    	  if(!ss.equals(" ")) {
                    		  flag = false;
                    	  }else {
                    		  
                    		  flag = true;
                    	  }
                    	  
                    	  
                      }
                      System.out.println(answer);
                      return answer;
    }
}