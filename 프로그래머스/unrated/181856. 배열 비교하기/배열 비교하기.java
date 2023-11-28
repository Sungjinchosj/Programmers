class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        int sum2 = 0;
        int sum1 = 0;
        
        int length1 = arr1.length;
        int length2 = arr2.length;
        
        if(length2 > length1){
            answer = -1;
        }else if(length2 < length1){
            answer = 1;
        }else if(length2 == length1){
            for(int i=0; i<length2; i++){
                sum2 += arr2[i];
                sum1 += arr1[i];
                if(sum2 == sum1){
                    answer = 0;
                }else if(sum2 > sum1){
                    answer = -1;
                }else{
                    answer = 1;
                }
                
            }
        }
        
        return answer;
    }
}