/**
 * Initialize your data structure here.
 */
var TwoSum = function() {
    this.map = new Map();
};

/**
 * Add the number to an internal data structure..
 * @param {number} number
 * @return {void}
 */
TwoSum.prototype.add = function(number) {
    let map = this.map;
    if(map.get(number)) {
        map.set(number, map.get(number)+1);
    } else {
        map.set(number, 1);
    }
};

/**
 * Find if there exists any pair of numbers which sum is equal to the value.
 * @param {number} value
 * @return {boolean}
 */
TwoSum.prototype.find = function(target) {
    let map = this.map;
    for(let [key, value] of map) {
        if(((target - key) == key) ? (map.get(target-key) > 1) : (map.get(target-key))) {
            return true;
        }
    }
    return false;
};

/**
 * Your TwoSum object will be instantiated and called as such:
 * var obj = Object.create(TwoSum).createNew()
 * obj.add(number)
 * var param_2 = obj.find(value)
 */
