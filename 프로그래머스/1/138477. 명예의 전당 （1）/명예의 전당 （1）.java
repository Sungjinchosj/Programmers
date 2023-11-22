import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
       int[] answer = new int[score.length];
                    
                    List<Integer> num = new ArrayList<>(); // 명예의 전당 점수 리스트
                    List<Integer> sNum = new ArrayList<>(); // 최하위 점수 리스트
                    
                    
                    for(int i=0; i<score.length; i++) {
                    	if(i<k) {
                    		// 명예의 전당 k일차까지는 모든 점수 다 등록
                    		num.add(score[i]);
                    		num.sort(null);
                    		sNum.add(num.get(0));
                    	}else {
                    		// k일차 지나고 나서
                    		
                    		// 명예의 전당 최하위 점수
                    		// sort 로 정렬해주었기 때문에 0번 인덱스가 항상 최하위점수
                    		int min = num.get(0);
                    		
                    		// min보다 점수가 클 경우 
                    		if(min <= score[i]) {
                    			// 0번인덱스(최하위점수) 제거, 새로운 점수 추가
            					num.remove(0);
            					num.add(score[i]);
            					// 점수별로 정렬
            					num.sort(null);
                    		}
                    		// 0번 인덱스가 최하위 점수 == 최하위점수 리스트에 추가
                    		sNum.add(num.get(0));
                    	}
                    	
                    	
                    	
                    }
                    
                    
                    // answer배열에 최하위점수 리스트 넣어주기
                    for(int i=0; i<answer.length; i++) {
                    	answer[i] = sNum.get(i);
                    }
                    
                    return answer;
    }
}
