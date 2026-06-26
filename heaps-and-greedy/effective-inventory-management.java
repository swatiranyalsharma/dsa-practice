public class Solution {
    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int[][] inventory = new int[A.size()][2];
        for(int i=0;i<A.size();i++){
            inventory[i][0] = A.get(i);
            inventory[i][1] = B.get(i);
        }
        int time =0;
        Arrays.sort(inventory, (a,b)-> a[0]-b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<inventory.length;i++){
            int[] currInventory = inventory[i];
            int expiry = currInventory[0];
            int currProfit = currInventory[1];
            if( expiry > time ){
                pq.add(currProfit);
                 time++;
            }else {
                if(pq.size()>0 && pq.peek() < currProfit ){
                    pq.poll();
                    pq.add(currProfit);
                }
            }
           

        }
        int maxProfit = 0;
        while(pq.size() !=0){
            int profit = pq.poll();
            maxProfit= ((maxProfit % 1000000007)+ (profit %  1000000007))  % 1000000007;
        }
        return maxProfit % 1000000007;
    }
}
