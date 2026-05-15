// Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
class Node {
    int key;
    int value;
    Node prev;
    Node next;

    Node(int key, int value){
        this.key = key;
        this.value = value;
    }
} 
class LRUCache {
    int limit;
    Node head;
    Node tail;
    HashMap<Integer, Node> map;
    public LRUCache(int capacity) {
        map = new HashMap<>();
        limit = capacity;
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
    }

    public void insertBack(Node newNode){
        Node tmp = tail.prev;
        tmp.next = newNode;
        newNode.prev = tmp;
        newNode.next = tail;
        tail.prev = newNode;
    }

    public void delete(Node ntd){
        Node prev =  ntd.prev;
        Node next = ntd.next;
        prev.next = next;
        next.prev = prev;
    }

    public void deleteFront(){
        Node ntd = head.next;
         map.remove(ntd.key);
        delete(ntd);
    }
    
    public int get(int key) {
        // map.get
        if(!map.containsKey(key)) return -1;
        Node tmp = map.get(key);
        int value = tmp.value;
        delete(tmp);

        insertBack(tmp);
        return value;

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node tmp = map.get(key);
            tmp.value = value;
            delete(tmp); //need to get this value and then delete that node
            insertBack(tmp);
            
        }else{
            Node newNode = new Node(key,value);
             if(map.size() >=limit ){
            //remove lru
                deleteFront();
                insertBack(newNode);
            //insert back
            }else{
                insertBack(newNode);
            }
            map.put(key, newNode); // what should be value here?
            // return null;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */