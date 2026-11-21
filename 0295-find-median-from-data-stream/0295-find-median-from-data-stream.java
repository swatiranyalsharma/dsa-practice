class MedianFinder {
    ArrayList<Integer> list;
    ArrayList<Integer> res = new ArrayList<>();
    PriorityQueue<Integer> minHeap = new PriorityQueue();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public MedianFinder() {
        list = new ArrayList<>();
    }
    
    public void addNum(int num) {
       
        if(list.size() > 0){
            if(num < maxHeap.peek()){
                maxHeap.add(num);
            }else{
                minHeap.add(num);
            }
        } else{
            maxHeap.add(num);
        }

         if(Math.abs(minHeap.size() - maxHeap.size()) > 1){
            if(minHeap.size() > maxHeap.size()){
                maxHeap.add(minHeap.peek());
                minHeap.poll();
            }else{
                minHeap.add(maxHeap.peek());
                maxHeap.poll();
            }
        }
         list.add(num); 
       
    }
    
    public double findMedian() {
      
       double median = 0.00;
       if(list.size() == 1){
            return list.get(0);
       }else{
        // System.out.println(list);
            // maxHeap.add(list.get(0));
            
            // for(int i=1;i<list.size();i++){
                // if(list.get(i) < maxHeap.peek()){
                //     maxHeap.add(list.get(i));
                // }else{
                //     minHeap.add(list.get(i));
                // }
               
                if(maxHeap.size() > minHeap.size() || maxHeap.size() < minHeap.size()){
                    if(maxHeap.size() > minHeap.size()){
                        median = maxHeap.peek();
                    }else{
                        median = minHeap.peek();
                    }
                } else {
                    median = (maxHeap.peek() + minHeap.peek()) / 2.00;
                }
            // }
       }
        return median;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */