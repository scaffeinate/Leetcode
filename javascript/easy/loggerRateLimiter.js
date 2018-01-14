/**
 * Initialize your data structure here.
 */
var Logger = function() {
    this.map = new Map();
};

/**
 * Returns true if the message should be printed in the given timestamp, otherwise returns false.
        If this method returns false, the message will not be printed.
        The timestamp is in seconds granularity.
 * @param {number} timestamp 
 * @param {string} message
 * @return {boolean}
 */
Logger.prototype.shouldPrintMessage = function(timestamp, message) {
    let map = this.map;
    if(map.get(message) !== undefined && (timestamp - map.get(message)) < 10) {
        return false;
    }
    map.set(message, timestamp);
    return true;
};

/**
 * Your Logger object will be instantiated and called as such:
 * var obj = Object.create(Logger).createNew()
 * var param_1 = obj.shouldPrintMessage(timestamp,message)
 */
