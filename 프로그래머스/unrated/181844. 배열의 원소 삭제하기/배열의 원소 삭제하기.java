import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
   
        // 정답을 담을 리스트 생성
        List<Integer> num = new ArrayList<>();
     
        // 삭제할 원소 구분해주는 변수 생성
        int count = 0;
        
        // arr의 원소들을 delete_list 배열의 각각 원소들과 비교
        for(int i=0; i<arr.length; i++){
            for(int d=0; d<delete_list.length; d++){
                // arr[i]가 delete_list배열의 원소들과 비교했을때
                // 같은것이 없다면 == 제거되지 않을 원소
                if(arr[i] != delete_list[d]){
                    // arr[i]의 값이 delete_list배열에 각각 원소들과 비교해서 같은 것이 없을때마다
                    // count 증가 == delete_list의 길이와 같아짐
                    count++;
                }
            }
            // delete_list 배열에 없는 arr의 원소 리스트에 추가
            if(count == delete_list.length){
                num.add(arr[i]);
            }
            // 다시 초기화
            count = 0;
     
        }

        // 리스트를 스트림으로 변환후, int형으로 바꾸고 배열로 return
        return num.stream().mapToInt(Integer::intValue).toArray();
    }
}