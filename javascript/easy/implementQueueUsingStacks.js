/**
 * Initialize your data structure here.
 */
var MyQueue = function() {
    this.pushStack = [];
    this.popStack = [];
};

/**
 * Push element x to the back of queue. 
 * @param {number} x
 * @return {void}
 */
MyQueue.prototype.push = function(x) {
    this.pushStack.push(x);
};

/**
 * Removes the element from in front of queue and returns that element.
 * @return {number}
 */
MyQueue.prototype.pop = function() {
    if(this.popStack.length <= 0) {
        while(this.pushStack.length > 0) {
            this.popStack.push(this.pushStack.pop());
        }
    }
    
    return this.popStack.pop();
};

/**
 * Get the front element.
 * @return {number}
 */
MyQueue.prototype.peek = function() {
    if(this.popStack.length <= 0) {
        while(this.pushStack.length > 0) {
            this.popStack.push(this.pushStack.pop());
        }
    }
    return this.popStack[this.popStack.length-1];
};

/**
 * Returns whether the queue is empty.
 * @return {boolean}
 */
MyQueue.prototype.empty = function() {
    return (this.popStack.length == 0) && (this.pushStack.length == 0);
};

/** 
 * Your MyQueue object will be instantiated and called as such:
 * var obj = Object.create(MyQueue).createNew()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */