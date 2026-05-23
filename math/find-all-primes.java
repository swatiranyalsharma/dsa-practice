public class Solution {
    public ArrayList<Integer> solve(int A) {
        // ArrayList<Integer> primeNumbers = new ArrayList<>();
        boolean[] primeNumbers = new boolean[A+1];
        ArrayList<Integer> ansArray = new ArrayList<>();
        Arrays.fill(primeNumbers, true);
        for( int i=2;i*i<= A; i++){
            // go to every element and find its multiple and make them not prime 
            for(int j=2*i;j<=A;j=j+i){
                if(primeNumbers[j] == true){
                     primeNumbers[j] = false;
                }
            }

        }
        for(int k=2;k<=A;k++) {
            if(primeNumbers[k] == true){
                 ansArray.add(k);
            }
        }
        return ansArray;
        // 2, 3, 4, 5, 6, 7, 8, 9, 10
        // 11, 12, 13, 14, 15, 16, 17, 18, 19,, 20
        // 21, 22, 23, 24, 25, 26, 27, 28 , 29 , 30
    }
}
