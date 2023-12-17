class Solution {
    public String solution(String rsp) {
        
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<rsp.length(); i++){
            if(rsp.charAt(i) == '2'){
                str.append("0");
            }else if(rsp.charAt(i) == '0'){
                str.append("5");
            }else{
                str.append("2");
            }
        }
        System.out.println(str);
        return str.toString();
    }
}