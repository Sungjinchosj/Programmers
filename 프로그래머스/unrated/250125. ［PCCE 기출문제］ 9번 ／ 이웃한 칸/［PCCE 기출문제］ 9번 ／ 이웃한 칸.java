class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        // 지정색 저장
        String color = board[h][w];

        
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                // board[i][j] == j가 w인 경우 
                if(j == w){
                    // 위아래 색을 알아야한다.
                    // board[i][w] 에서 위아래를 확인할 수 있도록
                    // i에서 1을 빼면 바로 위, 더하면 아래를 확인할 수 있다.
                     if(i == h-1 || i == h+1){
                         // 지정색이랑 일치하면 카운트 증가
                         if(color.equals(board[i][j])){
                             answer++;
                         }
                     }
                }else if(i == h){ // 양 옆 색을 알아야 한다.
                    // board[i][j] == i가 h인 경우

                    // board[h][j] 에서 양 옆을 확인할 수 있도록
                    // j에서 1을 빼면 왼쪽, 더하면 오른쪽을 확인할 수 있다.
                    if(j == w-1 || j == w+1){
                        // 지정색이랑 일치하면 카운트 증가
                         if(color.equals(board[i][j])){
                             answer++;
                         }
                     }
                }
               
            }
       
        }
        
        return answer;
    }
}
