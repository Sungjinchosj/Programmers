class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1) { // 길이가 1일 경우 answer에 -1 저장
            int[] answer = {-1};
            return answer;
        }
        
        int min = arr[0];
        
        for(int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]); // arr배열을 모두 비교 후, 제일 작은 수를 min에 저장
        }

        int[] answer = new int[arr.length - 1]; // 제일 작은 수를 제외한 모든 arr배열 값을 저장하기 위함
        int cnt = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(min == arr[i]) { // 제일 작은 수와 일치한다면 계속, 아니면 answer배열에 담기
                continue;
            }
            answer[cnt++] = arr[i];
        }        
    return answer;
    }
}