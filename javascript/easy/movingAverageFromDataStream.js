/**
 * Initialize your data structure here.
 * @param {number} size
 */
var MovingAverage = function(size) {
    this.queue = [];
    this.sum = 0;
    this.size = size;
};

/**
 * @param {number} val
 * @return {number}
 */
MovingAverage.prototype.next = function(val) {
    let queue = this.queue, size = this.size;
    if(queue.length >= size) {
        this.sum -= queue.shift();
    }
    queue.push(val);
    this.sum += val;
    return (this.sum/queue.length);
};

/**
 * Your MovingAverage object will be instantiated and called as such:
 * var obj = Object.create(MovingAverage).createNew(size)
 * var param_1 = obj.next(val)
 */
