class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int res =0;
        for(int i=0;i<requests.length;i++){
            if(i-1 >= 0){
                 res = res + Math.abs(requests[i-1] -  requests[i]);
            }else{
                res = res + requests[i];
            }
            
        }
        return res;
    }
}