class LRUCache {

    private Map<Integer, ListNode> lruMap;
    private ListNode head = null, tail = null;
    private int capacity = 0;
    public LRUCache(int capacity) {
        this.lruMap = new HashMap<>();
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(!lruMap.containsKey(key)) return -1;
        ListNode node = lruMap.get(key);
        moveNodeToFront(node);
        return node.value;
    }
    
    public void put(int key, int value) {
        if(lruMap.containsKey(key)) {
            ListNode node = lruMap.get(key);
            node.value = value;
            moveNodeToFront(node);
        } else {
            ListNode node = new ListNode(key, value);
            insertNodeToFront(node);
        }
    }
    
    private void moveNodeToFront(ListNode node) {
        if(node.equals(head) || head.equals(tail)) return;
        node.prev.next = node.next;
        if(node.equals(tail)) {
            tail = node.prev;
        } else {
            node.next.prev = node.prev;
        }
        node.next = head;
        head.prev = node;
        head = node;
    }
    
    private void insertNodeToFront(ListNode node) {
        if(lruMap.size() >= capacity) {
            lruMap.remove(tail.key);
            pop();
        }
        push(node);
        lruMap.put(node.key, node);
    }
    
    private void push(ListNode node) {
        if(head == null && tail == null) {
            head = tail = node;
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }
    
    private void pop() {
        if(head.equals(tail)) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
    
    class ListNode {
        private int key, value;
        private ListNode next = null, prev = null;
        
        public ListNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
