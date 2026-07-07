class Solution {
    public long sumAndMultiply(int n) {
        String s = Integer.toString(n);
        String[] arr = s.split("");
        StringBuffer sb = new StringBuffer();
        long sum = 0;
        for(int i=0;i<arr.length;i++){
          
            if(!arr[i].equals("0")){
                sb.append(arr[i]);
                sum += Integer.parseInt(arr[i]);
            }
        }
        String res = sb.toString();
        long val=0;
        
        if(!res.equals(""))
         val = Long.parseLong(res);
        return val * sum;
    }
}