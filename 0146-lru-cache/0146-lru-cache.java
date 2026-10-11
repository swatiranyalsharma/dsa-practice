class LRUCache {
    class DLL{
        int key;
        int value;
        DLL next;
        DLL prev;

        DLL(int key, int value){
            this.key = key;
            this.value = value;
            this.next = null;
            this.prev = null;
        }
    }

    int size =0;
    HashMap<Integer, DLL> map = new HashMap<>();
    DLL dummyStart;
    DLL dummyLast;
   
    public LRUCache(int capacity) {
        size = capacity;
        dummyStart = new DLL(-1, -1);
        dummyLast = new DLL(-1, -1);
        dummyStart.next = dummyLast;
        dummyLast.prev = dummyStart;
    }
    
    //get is also done - nicely written
    public int get(int key) {
        if(!map.containsKey(key)){
            return -1;
        }else{
            // bring the eleemnt from the pos in array to front
            DLL node = map.get(key);
            int hasValue = node.value;
            removeNode(node);
            map.remove(key);
            // DLL node = map.get(key);
            DLL nn = new DLL(key, hasValue);
            map.put(key,nn);
            addNewNode(dummyLast.prev, nn, dummyLast);
            return node.value;
        }
        
    }
    //nice funtion
    public void addNewNode(DLL prev, DLL nn, DLL next){
        size--;
        prev.next = nn;
        next.prev = nn;
        nn.next = next;
        nn.prev = prev;
    }
    //nicely written
    public void removeNode(DLL node){
        //  System.out.println(prev.next.key);
        size++;
        DLL prev = node.prev;
        DLL next = node.next;
        prev.next = next;
        next.prev = prev;
    }
    public void put(int key, int value) {
        if(!map.containsKey(key)){
           
            if(size>0){ // not full
             System.out.println("has Capacity ");
                DLL nn =  new DLL(key, value);       
                map.put(key,nn);
                addNewNode(dummyLast.prev, nn, dummyLast);

            }else{// full
                    //  System.out.println("Capacity is full");
                //remove from last , remove the same from map
                DLL nodeToremove = dummyStart.next;
                removeNode(nodeToremove);
                 map.remove(nodeToremove.key);

                DLL nn = new DLL(key, value);
                map.put(key,nn);
                addNewNode(dummyLast.prev, nn, dummyLast);
                // add new to beg and hashmap
            }
        }else{
            // get element from map and remove it from the curr pos
            // add it to dll
            DLL nodeToRemove = map.get(key);
            // int keyValue = nodeToRemove.value;
            map.remove(nodeToRemove.key);
            removeNode(nodeToRemove);
             

            DLL nn = new DLL(key, value);
            addNewNode(dummyLast.prev, nn, dummyLast);
             map.put(key,nn);
        }

        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */