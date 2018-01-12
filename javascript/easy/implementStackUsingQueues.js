/**
 * Initialize your data structure here.
 */
var MyStack = function() {
    this.queue = [];
    this.queue2 = [];
    this.push_queue = this.queue;
    this.pop_queue = this.queue2;
};

/**
 * Push element x onto stack. 
 * @param {number} x
 * @return {void}
 */
MyStack.prototype.push = function(x) {
    this.push_queue.push(x);
};

/**
 * Removes the element on top of the stack and returns that element.
 * @return {number}
 */
MyStack.prototype.pop = function() {
    while(this.push_queue.length > 1) {
        this.pop_queue.push(this.push_queue.shift());
    }
    let result = this.push_queue.shift();
    this.swap();
    return result;
    return 0;
};

/**
 * Get the top element.
 * @return {number}
 */
MyStack.prototype.top = function() {
    while(this.push_queue.length > 1) {
        this.pop_queue.push(this.push_queue.shift());
    }
    let result = this.push_queue.shift();
    this.pop_queue.push(result);
    this.swap();
    return result;
};

/**
 * Returns whether the stack is empty.
 * @return {boolean}
 */
MyStack.prototype.empty = function() {
    return (this.push_queue.length == 0) && (this.pop_queue.length == 0);
};

MyStack.prototype.swap = function() {
    let temp = this.push_queue;
    this.push_queue = this.pop_queue;
    this.pop_queue = temp;
};

/** 
 * Your MyStack object will be instantiated and called as such:
 * var obj = Object.create(MyStack).createNew()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */