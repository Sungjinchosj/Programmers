class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        
        String color = board[h][w];

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(j == w){
                     if(i == h-1 || i == h+1){
                         if(color.equals(board[i][j])){
                             answer++;
                         }
                     }
                }else if(i == h){
                    if(j == w-1 || j == w+1){
                         if(color.equals(board[i][j])){
                             answer++;
                         }
                     }
                }
               
            }
            System.out.println();
        }
        
        return answer;
    }
}