/**
 * @param {number} capacity
 */
var LRUCache = function(capacity) {
    this.map = new Map();
    this.capacity = capacity;
    this.head = null;
    this.tail = null;
};

/** 
 * @param {number} key
 * @return {number}
 */
LRUCache.prototype.get = function(key) {
    if(!this.map.has(key)) return -1;
    let node = this.map.get(key);
    this.moveNodeToFront(node);
    return node.value;
};

/** 
 * @param {number} key 
 * @param {number} value
 * @return {void}
 */
LRUCache.prototype.put = function(key, value) {
    if(this.map.has(key)) {
        let node = this.map.get(key);
        node.value = value;
        this.moveNodeToFront(node);
    } else {
        let node = new ListNode(key, value);
        this.insertNodeToFront(node);
    }
};

LRUCache.prototype.moveNodeToFront = function(node) {
    if(this.head === this.tail || node === this.head) return;
    node.prev.next = node.next;
    if(node === this.tail) {
        this.tail = node.prev;
    } else {
        node.next.prev = node.prev;
    }
    this.push(node);
};

LRUCache.prototype.insertNodeToFront = function(node) {
    if(this.map.size >= this.capacity) {
        this.map.delete(this.tail.key);
        this.pop();
    }
    this.map.set(node.key, node);
    this.push(node);
};

LRUCache.prototype.push = function(node) {
    if(this.head === null && this.tail === null) {
        this.head = this.tail = node;
    } else {
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
};

LRUCache.prototype.pop = function() {
    if(this.head === this.tail) {
        this.head = this.tail = null;
    } else {
        this.tail = this.tail.prev;
        this.tail.next = null;
    }
};

/** 
 * Your LRUCache object will be instantiated and called as such:
 * var obj = Object.create(LRUCache).createNew(capacity)
 * var param_1 = obj.get(key)
 * obj.put(key,value)
 */

var ListNode = function(key, value) {
    this.key = key;
    this.value = value;
    this.next = null;
    this.prev = null;
};
