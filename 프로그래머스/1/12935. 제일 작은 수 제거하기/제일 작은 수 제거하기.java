class Solution {
   public int[] solution19(int[] arr) {
                    int[] answer = {};

                    if(arr.length == 1) {
                    	answer = new int[1];
                    	
                    	answer[0] = -1;
                    }else {
                    	
                    	int min = Integer.MAX_VALUE;
                    	List<Integer> num = new ArrayList<>();
                    	
                    	
                    	for(int i=0; i<arr.length; i++) {
                    		min = Math.min(min, arr[i]);
                    	}
                    	
                    	for(int i=0; i<arr.length; i++) {
                    		if(arr[i] != min) {
                    			num.add(arr[i]);
                    		}
                    	}
                    	answer = new int[num.size()];
                    	
                    	for(int i=0; i<answer.length; i++) {
                    		answer[i] = num.get(i);
                    		System.out.println(answer[i]);
                    	}
                    	
                    	
                    	
                    }
                    
                    
                    return answer;
                }
}
