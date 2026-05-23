// Given an even number A ( greater than 2 ), return two prime numbers whose sum will be equal to the given number.
// If there is more than one solution possible, return the lexicographically smaller solution.
public class Solution {
    public ArrayList<Integer> primesum(int A) {
        // 4  [2, 2]
        // 6 2, 3,4
        // Approach 
        // for to every prime num-> ask his brother is prime?
        //if brother is prime -> print int
        int pair = -1;
         ArrayList<Integer> res = new  ArrayList<Integer>();
        ArrayList<Integer> primes = getPrimeNumbers(A);
        for(int m=0;m < primes.size(); m++){
            pair = A - primes.get(m);
            if(primes.contains(pair)){
                res.add(primes.get(m));
                res.add(pair);
                break;
            }
        }
       return res;

    }

    public ArrayList<Integer> getPrimeNumbers(int A){
        boolean[] primeTillA = new boolean[A+1];
        ArrayList<Integer> primes = new ArrayList<>();
        Arrays.fill(primeTillA, true);
        for(int i=2;i *i <= A;i++){
            for(int j= 2 * i; j <= A; j = j+ i){
                primeTillA[j] = false;
            }
        }
        for(int k=2;k<= A;k++){
            if(primeTillA[k] == true){
            primes.add(k);
            }
        }
        return primes;
    }
}
